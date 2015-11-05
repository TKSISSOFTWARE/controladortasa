package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Gravamenestablecimiento generated by hbm2java
 */
public class Gravamenestablecimiento implements java.io.Serializable {

	private GravamenestablecimientoId id;
	private Establecimiento establecimiento;
	private Gravamen gravamen;
	private BigDecimal porcentaje;
	private Boolean iva;
	private Boolean activo;

	public Gravamenestablecimiento() {
	}

	public Gravamenestablecimiento(GravamenestablecimientoId id, Establecimiento establecimiento, Gravamen gravamen) {
		this.id = id;
		this.establecimiento = establecimiento;
		this.gravamen = gravamen;
	}

	public Gravamenestablecimiento(GravamenestablecimientoId id, Establecimiento establecimiento, Gravamen gravamen,
			BigDecimal porcentaje, Boolean iva, Boolean activo) {
		this.id = id;
		this.establecimiento = establecimiento;
		this.gravamen = gravamen;
		this.porcentaje = porcentaje;
		this.iva = iva;
		this.activo = activo;
	}

	public GravamenestablecimientoId getId() {
		return this.id;
	}

	public void setId(GravamenestablecimientoId id) {
		this.id = id;
	}

	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Gravamen getGravamen() {
		return this.gravamen;
	}

	public void setGravamen(Gravamen gravamen) {
		this.gravamen = gravamen;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Boolean getIva() {
		return this.iva;
	}

	public void setIva(Boolean iva) {
		this.iva = iva;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}