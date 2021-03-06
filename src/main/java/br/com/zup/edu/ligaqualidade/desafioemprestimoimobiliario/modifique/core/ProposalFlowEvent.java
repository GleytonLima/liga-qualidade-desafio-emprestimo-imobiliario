package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core;

public interface ProposalFlowEvent {
    String getEventId();
    String getProposalId();
    EventSchema getEventSchema();
    EventAction getEventAction();
    boolean isValid();
}
