package br.com.zup.edu.ligaqualidade.desafioemprestimoimobiliario.modifique.proponent;

import java.time.LocalDateTime;

public class EventProponent {

	private String event_id;
	private String event_schema;
	private String event_action;
	private LocalDateTime event_timestamp;
	private Proponent proponent;

	public EventProponent(String event_id, String event_schema, String event_action, LocalDateTime event_timestamp,
			Proponent proponent) {
		this.event_id = event_id;
		this.event_schema = event_schema;
		this.event_action = event_action;
		this.event_timestamp = event_timestamp;
		this.proponent = proponent;
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

	public Proponent getProponent() {
		return proponent;
	}

}
