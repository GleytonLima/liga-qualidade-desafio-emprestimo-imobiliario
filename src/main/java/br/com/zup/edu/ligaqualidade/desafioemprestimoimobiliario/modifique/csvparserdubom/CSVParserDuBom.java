package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom;


import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.ProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventAction;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventSchema;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proponent.ProponentAddedProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal.ProposalCreatedProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal.ProposalDeleteProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal.ProposalUpdatedProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty.WarrantyAddedProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty.WarrantyRemovedProposalFlowEvent;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVParserDuBom {
    public Object convertToObject(String csvString) throws CsvDeserializationException {
        try {
            return convertStringToEvent(csvString);
        } catch (Exception e) {
            throw new CsvDeserializationException(e.getMessage());
        }
    }

    private ProposalFlowEvent convertStringToEvent(String string) throws IllegalArgumentException, IllegalAccessException {
        ArrayList<String> propertiesList = new ArrayList<>(Arrays.asList(string.split(",")));
        ProposalFlowEvent proposalFlowEvent = null;
        EventSchema eventSchema = EventSchema.valueOf(propertiesList.get(1).toUpperCase());
        EventAction eventAction = EventAction.valueOf(propertiesList.get(2).toUpperCase());
        switch (eventSchema) {
            case PROPOSAL:
                switch (eventAction) {
                    case CREATED:
                        proposalFlowEvent = new ProposalCreatedProposalFlowEvent();
                        break;
                    case UPDATED:
                        proposalFlowEvent = new ProposalUpdatedProposalFlowEvent();
                        break;
                    case DELETED:
                        proposalFlowEvent = new ProposalDeleteProposalFlowEvent();
                        break;
                    default:
                        throw new CsvDeserializationException("Campo: " + eventSchema + " desconhecido");
                }
                break;
            case WARRANTY:
                switch (eventAction) {
                    case UPDATED:
                        proposalFlowEvent = new WarrantyAddedProposalFlowEvent();
                        break;
                    case ADDED:
                        proposalFlowEvent = new WarrantyAddedProposalFlowEvent();
                        break;
                    case REMOVED:
                        proposalFlowEvent = new WarrantyRemovedProposalFlowEvent();
                        break;
                    default:
                        throw new CsvDeserializationException("Campo: " + eventSchema + " desconhecido");
                }
                break;
            case PROPONENT:
                switch (eventAction) {
                    case ADDED:
                        proposalFlowEvent = new ProponentAddedProposalFlowEvent();
                        break;
                    default:
                        throw new CsvDeserializationException("Campo: " + eventSchema + " desconhecido");
                }
                break;
            default:
                throw new CsvDeserializationException("Campo: " + eventSchema + " desconhecido");
        }
        int colunaCSV = 0;
        for (Field field : proposalFlowEvent.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(CsvField.class)) {
                //TODO: Já tentar fazer o parse para um tipo específico. Por enquanto tudo String (TEXTO)
                CsvFieldType tipoCampo = getTipoColuna(field);
                field.set(proposalFlowEvent, propertiesList.get(colunaCSV));
            }
            colunaCSV++;
        }
        return proposalFlowEvent;
    }

    private CsvFieldType getTipoColuna(Field field) {
        CsvFieldType value = field.getAnnotation(CsvField.class)
                .type();
        return value == null ? CsvFieldType.TEXTO : value;
    }
}
