package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proponent;

import java.math.BigDecimal;

public class Proponent {

	private String proponent_id;
	private String proponent_name;
	private Integer proponent_age;
	private BigDecimal proponent_monthly_income;
	private boolean proponent_is_main;

	public Proponent(String proponent_id, String proponent_name, Integer proponent_age,
			BigDecimal proponent_monthly_income, boolean proponent_is_main) {
		this.proponent_id = proponent_id;
		this.proponent_name = proponent_name;
		this.proponent_age = proponent_age;
		this.proponent_monthly_income = proponent_monthly_income;
		this.proponent_is_main = proponent_is_main;
	}

	public String getProponent_id() {
		return proponent_id;
	}

	public String getProponent_name() {
		return proponent_name;
	}

	public Integer getProponent_age() {
		return proponent_age;
	}

	public BigDecimal getProponent_monthly_income() {
		return proponent_monthly_income;
	}

	public boolean isProponent_is_main() {
		return proponent_is_main;
	}

}
