package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.ProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventAction;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventSchema;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.Util;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvField;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvFieldType;

import java.math.BigDecimal;

public class ProposalCreatedProposalFlowEvent implements ProposalFlowEvent {
    @CsvField(type = CsvFieldType.TEXTO)
    private String event_id;
    @CsvField(type = CsvFieldType.TEXTO)
    private String event_schema;
    @CsvField(type = CsvFieldType.TEXTO)
    private String event_action;
    @CsvField(type = CsvFieldType.TEXTO)
    private String event_timestamp;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proposal_id;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proposal_loan_value;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proposal_number_of_monthly_installments;

    @Override
    public String getEventId() {
        return this.event_id;
    }

    @Override
    public String getProposalId() {
        return this.proposal_id;
    }

    @Override
    public EventSchema getEventSchema() {
        return EventSchema.PROPOSAL;
    }

    @Override
    public EventAction getEventAction() {
        return EventAction.CREATED;
    }

    @Override
    public boolean isValid() {
        if(this.event_id.equals("52f0b3f2-f838-4ce2-96ee-9876dd2c0cf6")) {
            System.out.printf("Teste");
        }
        BigDecimal valorEmprestimo = BigDecimal.valueOf(Float.parseFloat(this.proposal_loan_value));
        BigDecimal valorMinimo = BigDecimal.valueOf(30000);
        BigDecimal valorMaximo = BigDecimal.valueOf(3000000);

        boolean validacao1 = Util.isBetween(valorEmprestimo, valorMinimo, valorMaximo);

        boolean validacao2 = Util.isBetween(Integer.parseInt(this.proposal_number_of_monthly_installments), 12*2, 15*12);

        return validacao1 && validacao2;
    }
}
