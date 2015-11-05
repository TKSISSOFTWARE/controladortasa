package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * Puntoestablecimiento generated by hbm2java
 */
public class Puntoestablecimiento implements java.io.Serializable {

	private PuntoestablecimientoId id;
	private Establecimiento establecimiento;
	private Puntodeventa puntodeventa;
	private Date fechafin;

	public Puntoestablecimiento() {
	}

	public Puntoestablecimiento(PuntoestablecimientoId id, Establecimiento establecimiento, Puntodeventa puntodeventa) {
		this.id = id;
		this.establecimiento = establecimiento;
		this.puntodeventa = puntodeventa;
	}

	public Puntoestablecimiento(PuntoestablecimientoId id, Establecimiento establecimiento, Puntodeventa puntodeventa,
			Date fechafin) {
		this.id = id;
		this.establecimiento = establecimiento;
		this.puntodeventa = puntodeventa;
		this.fechafin = fechafin;
	}

	public PuntoestablecimientoId getId() {
		return this.id;
	}

	public void setId(PuntoestablecimientoId id) {
		this.id = id;
	}

	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Puntodeventa getPuntodeventa() {
		return this.puntodeventa;
	}

	public void setPuntodeventa(Puntodeventa puntodeventa) {
		this.puntodeventa = puntodeventa;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

}