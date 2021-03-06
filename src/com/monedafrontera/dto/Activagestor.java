package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Activagestor generated by hbm2java
 */
public class Activagestor implements java.io.Serializable {

	private ActivagestorId id;
	private Activacion activacion;
	private Gestor gestor;
	private String observacion;

	public Activagestor() {
	}

	public Activagestor(ActivagestorId id, Activacion activacion, Gestor gestor) {
		this.id = id;
		this.activacion = activacion;
		this.gestor = gestor;
	}

	public Activagestor(ActivagestorId id, Activacion activacion, Gestor gestor, String observacion) {
		this.id = id;
		this.activacion = activacion;
		this.gestor = gestor;
		this.observacion = observacion;
	}

	public ActivagestorId getId() {
		return this.id;
	}

	public void setId(ActivagestorId id) {
		this.id = id;
	}

	public Activacion getActivacion() {
		return this.activacion;
	}

	public void setActivacion(Activacion activacion) {
		this.activacion = activacion;
	}

	public Gestor getGestor() {
		return this.gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
