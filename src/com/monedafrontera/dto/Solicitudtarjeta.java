package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Solicitudtarjeta generated by hbm2java
 */
public class Solicitudtarjeta implements java.io.Serializable {

	private SolicitudtarjetaId id;
	private Integer valor;

	public Solicitudtarjeta() {
	}

	public Solicitudtarjeta(SolicitudtarjetaId id) {
		this.id = id;
	}

	public Solicitudtarjeta(SolicitudtarjetaId id, Integer valor) {
		this.id = id;
		this.valor = valor;
	}

	public SolicitudtarjetaId getId() {
		return this.id;
	}

	public void setId(SolicitudtarjetaId id) {
		this.id = id;
	}

	public Integer getValor() {
		return this.valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
