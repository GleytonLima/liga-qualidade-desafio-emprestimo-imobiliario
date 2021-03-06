package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.ProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventAction;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventSchema;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvField;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CsvFieldType;

public class WarrantyUpdatedProposalFlowEvent implements ProposalFlowEvent {
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
    private String warranty_id;
    @CsvField(type = CsvFieldType.TEXTO)
    private String warranty_value;

    @Override
    public String getEventId() {
        return this.event_id;
    }

    @Override
    public String getProposalId() {
        return proposal_id;
    }

    @Override
    public EventSchema getEventSchema() {
        return EventSchema.WARRANTY;
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
