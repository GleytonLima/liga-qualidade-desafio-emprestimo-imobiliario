package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.EventosValidator;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.core.ProposalFlowEvent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom.CSVParserDuBom;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solucao {
    public static String processMessages(List<String> messages) {
        final CSVParserDuBom CSVParserDuBom = new CSVParserDuBom();

        final List<ProposalFlowEvent> collect = messages.stream().map(message ->
                (ProposalFlowEvent) CSVParserDuBom.convertToObject(message)
        ).collect(Collectors.toList());

        Set<String> idEventosValidos = new EventosValidator(collect).analisarEventosValidos();

        return idEventosValidos.toString();
    }
}