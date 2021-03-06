package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Franquicia generated by hbm2java
 */
public class Franquicia implements java.io.Serializable {

	private String codfranquicia;
	private String nombrefranquicia;
	private BigDecimal porcentaje;
	private Set tasadolarpromotorparametros = new HashSet(0);
	private Set porcentajecomisiontxparams = new HashSet(0);
	private Set tasaeuroparametros = new HashSet(0);
	private Set tasaeuropromotorparametros = new HashSet(0);
	private Set tasadolarparametros = new HashSet(0);
	private Set porcentcomisiontxparampromos = new HashSet(0);
	private Set tarjetas = new HashSet(0);
	private Set promotorfranquicias = new HashSet(0);

	public Franquicia() {
	}

	public Franquicia(String codfranquicia, String nombrefranquicia) {
		this.codfranquicia = codfranquicia;
		this.nombrefranquicia = nombrefranquicia;
	}

	public Franquicia(String codfranquicia, String nombrefranquicia, BigDecimal porcentaje,
			Set tasadolarpromotorparametros, Set porcentajecomisiontxparams, Set tasaeuroparametros,
			Set tasaeuropromotorparametros, Set tasadolarparametros, Set porcentcomisiontxparampromos, Set tarjetas,
			Set promotorfranquicias) {
		this.codfranquicia = codfranquicia;
		this.nombrefranquicia = nombrefranquicia;
		this.porcentaje = porcentaje;
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
		this.porcentajecomisiontxparams = porcentajecomisiontxparams;
		this.tasaeuroparametros = tasaeuroparametros;
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
		this.tasadolarparametros = tasadolarparametros;
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
		this.tarjetas = tarjetas;
		this.promotorfranquicias = promotorfranquicias;
	}

	public String getCodfranquicia() {
		return this.codfranquicia;
	}

	public void setCodfranquicia(String codfranquicia) {
		this.codfranquicia = codfranquicia;
	}

	public String getNombrefranquicia() {
		return this.nombrefranquicia;
	}

	public void setNombrefranquicia(String nombrefranquicia) {
		this.nombrefranquicia = nombrefranquicia;
	}

	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

	public Set getTasadolarpromotorparametros() {
		return this.tasadolarpromotorparametros;
	}

	public void setTasadolarpromotorparametros(Set tasadolarpromotorparametros) {
		this.tasadolarpromotorparametros = tasadolarpromotorparametros;
	}

	public Set getPorcentajecomisiontxparams() {
		return this.porcentajecomisiontxparams;
	}

	public void setPorcentajecomisiontxparams(Set porcentajecomisiontxparams) {
		this.porcentajecomisiontxparams = porcentajecomisiontxparams;
	}

	public Set getTasaeuroparametros() {
		return this.tasaeuroparametros;
	}

	public void setTasaeuroparametros(Set tasaeuroparametros) {
		this.tasaeuroparametros = tasaeuroparametros;
	}

	public Set getTasaeuropromotorparametros() {
		return this.tasaeuropromotorparametros;
	}

	public void setTasaeuropromotorparametros(Set tasaeuropromotorparametros) {
		this.tasaeuropromotorparametros = tasaeuropromotorparametros;
	}

	public Set getTasadolarparametros() {
		return this.tasadolarparametros;
	}

	public void setTasadolarparametros(Set tasadolarparametros) {
		this.tasadolarparametros = tasadolarparametros;
	}

	public Set getPorcentcomisiontxparampromos() {
		return this.porcentcomisiontxparampromos;
	}

	public void setPorcentcomisiontxparampromos(Set porcentcomisiontxparampromos) {
		this.porcentcomisiontxparampromos = porcentcomisiontxparampromos;
	}

	public Set getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(Set tarjetas) {
		this.tarjetas = tarjetas;
	}

	public Set getPromotorfranquicias() {
		return this.promotorfranquicias;
	}

	public void setPromotorfranquicias(Set promotorfranquicias) {
		this.promotorfranquicias = promotorfranquicias;
	}

}
