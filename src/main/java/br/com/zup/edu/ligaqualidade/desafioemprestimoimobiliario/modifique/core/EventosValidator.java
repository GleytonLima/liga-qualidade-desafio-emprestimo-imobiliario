package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EventosValidator {
    List<ProposalFlowEvent> proposalFlowEvents;

    public EventosValidator(List<ProposalFlowEvent> proposalFlowEvents) {
        this.proposalFlowEvents = proposalFlowEvents;
    }

    public Set<String> analisarEventosValidos(){
        final Set<ProposalFlowEvent> collect = this.proposalFlowEvents.stream().filter(event -> event.getEventSchema().equals(EventSchema.PROPOSAL)).collect(Collectors.toSet());
        //TODO: Validar
        return Set.of("");
    }
}
