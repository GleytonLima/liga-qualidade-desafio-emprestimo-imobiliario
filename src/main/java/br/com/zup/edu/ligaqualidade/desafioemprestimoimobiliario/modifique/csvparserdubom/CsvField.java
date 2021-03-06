package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.csvparserdubom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CsvField {
    public CsvFieldType type() default CsvFieldType.TEXTO;
}
