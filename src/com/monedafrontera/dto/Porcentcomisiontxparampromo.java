package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * Porcentcomisiontxparampromo generated by hbm2java
 */
public class Porcentcomisiontxparampromo implements java.io.Serializable {

	private int consecutivo;
	private Banco banco;
	private Establecimiento establecimiento;
	private Franquicia franquicia;
	private Pais pais;
	private Promotor promotor;
	private String tipocupo;
	private BigDecimal porcentaje;
	private Date fechainicio;
	private Date fechafin;

	public Porcentcomisiontxparampromo() {
	}

	public Porcentcomisiontxparampromo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Porcentcomisiontxparampromo(int consecutivo, Banco banco, Establecimiento establecimiento,
			Franquicia franquicia, Pais pais, Promotor promotor, String tipocupo, BigDecimal porcentaje,
			Date fechainicio, Date fechafin) {
		this.consecutivo = consecutivo;
		this.banco = banco;
		this.establecimiento = establecimiento;
		this.franquicia = franquicia;
		this.pais = pais;
		this.promotor = promotor;
		this.tipocupo = tipocupo;
		this.porcentaje = porcentaje;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
	}

	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	public Franquicia getFranquicia() {
		return this.franquicia;
	}

	public void setFranquicia(Franquicia franquicia) {
		this.franquicia = franquicia;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public String getTipocupo() {
		return this.tipocupo;
	}

	public void setTipocupo(String tipocupo) {
		this.tipocupo = tipocupo;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

}
