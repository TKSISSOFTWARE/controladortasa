package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * SaldodepositosId generated by hbm2java
 */
public class SaldodepositosId implements java.io.Serializable {

	private String numerotarjeta;
	private Date fecha;

	public SaldodepositosId() {
	}

	public SaldodepositosId(String numerotarjeta, Date fecha) {
		this.numerotarjeta = numerotarjeta;
		this.fecha = fecha;
	}

	public String getNumerotarjeta() {
		return this.numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SaldodepositosId))
			return false;
		SaldodepositosId castOther = (SaldodepositosId) other;

		return ((this.getNumerotarjeta() == castOther.getNumerotarjeta())
				|| (this.getNumerotarjeta() != null && castOther.getNumerotarjeta() != null
						&& this.getNumerotarjeta().equals(castOther.getNumerotarjeta())))
				&& ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null
						&& castOther.getFecha() != null && this.getFecha().equals(castOther.getFecha())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumerotarjeta() == null ? 0 : this.getNumerotarjeta().hashCode());
		result = 37 * result + (getFecha() == null ? 0 : this.getFecha().hashCode());
		return result;
	}

}
