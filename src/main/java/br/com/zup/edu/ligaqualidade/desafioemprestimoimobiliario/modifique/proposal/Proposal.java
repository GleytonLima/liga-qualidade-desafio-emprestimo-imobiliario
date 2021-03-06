package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal;

import java.math.BigDecimal;
import java.util.List;

import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proponent.Proponent;
import br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.warranty.Warranty;

public class Proposal {

	private String proposal_id;
	private BigDecimal proposal_loan_value;
	private Integer proposal_number_of_monthly_installments;
	private List<Warranty> warranties;
	private List<Proponent> proponents;

	public Proposal(String proposal_id, BigDecimal proposal_loan_value,
			Integer proposal_number_of_monthly_installments) {
		this.proposal_id = proposal_id;
		this.proposal_loan_value = proposal_loan_value;
		this.proposal_number_of_monthly_installments = proposal_number_of_monthly_installments;
	}

	public String getProposal_id() {
		return proposal_id;
	}

	public BigDecimal getProposal_loan_value() {
		return proposal_loan_value;
	}

	public Integer getProposal_number_of_monthly_installments() {
		return proposal_number_of_monthly_installments;
	}

	public List<Warranty> getWarranties() {
		return warranties;
	}

	public List<Proponent> getProponents() {
		return proponents;
	}

}
