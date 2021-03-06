package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proposal;

import java.time.LocalDateTime;

public class EventProposal {

	private String event_id;
	private String event_schema;
	private String event_action;
	private LocalDateTime event_timestamp;
	private Proposal proposal;

	public EventProposal(String event_id, String event_schema, String event_action, LocalDateTime event_timestamp,
			Proposal proposal) {
		this.event_id = event_id;
		this.event_schema = event_schema;
		this.event_action = event_action;
		this.event_timestamp = event_timestamp;
		this.proposal = proposal;
	}

	public String getEvent_id() {
		return event_id;
	}

	public String getEvent_schema() {
		return event_schema;
	}

	public String getEvent_action() {
		return event_action;
	}

	public LocalDateTime getEvent_timestamp() {
		return event_timestamp;
	}

	public Proposal getProposal() {
		return proposal;
	}

}
