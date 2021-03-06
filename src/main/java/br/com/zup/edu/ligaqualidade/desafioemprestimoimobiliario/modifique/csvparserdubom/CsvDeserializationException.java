package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom;

public class CsvDeserializationException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    public CsvDeserializationException(String message) {
        super(message);
    }
}