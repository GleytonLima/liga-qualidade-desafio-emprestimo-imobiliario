package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty;

import java.math.BigDecimal;

public class Warranty {

	private String warranty_id;
	private BigDecimal warranty_value;
	private String warranty_province;

	public Warranty(String warranty_id, BigDecimal warranty_value, String warranty_province) {
		this.warranty_id = warranty_id;
		this.warranty_value = warranty_value;
		this.warranty_province = warranty_province;
	}

	public String getWarranty_id() {
		return warranty_id;
	}

	public BigDecimal getWarranty_value() {
		return warranty_value;
	}

	public String getWarranty_province() {
		return warranty_province;
	}

}
