package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proponent;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.ProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventAction;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventSchema;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvField;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvFieldType;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvSerializable;

@CsvSerializable
public class ProponentAddedProposalFlowEvent implements ProposalFlowEvent {
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
    private String proponent_id;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proponent_name;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proponent_age;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proponent_monthly_income;
    @CsvField(type = CsvFieldType.TEXTO)
    private String proponent_is_main;

    @Override
    public String getEventId() {
        return event_id;
    }

    @Override
    public String getProposalId() {
        return proposal_id;
    }

    @Override
    public EventSchema getEventSchema() {
        return EventSchema.PROPONENT;
    }

    @Override
    public EventAction getEventAction() {
        return EventAction.ADDED;
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
