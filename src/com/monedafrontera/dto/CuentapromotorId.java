package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * CuentapromotorId generated by hbm2java
 */
public class CuentapromotorId implements java.io.Serializable {

	private String numcuenta;
	private String documento;

	public CuentapromotorId() {
	}

	public CuentapromotorId(String numcuenta, String documento) {
		this.numcuenta = numcuenta;
		this.documento = documento;
	}

	public String getNumcuenta() {
		return this.numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CuentapromotorId))
			return false;
		CuentapromotorId castOther = (CuentapromotorId) other;

		return ((this.getNumcuenta() == castOther.getNumcuenta()) || (this.getNumcuenta() != null
				&& castOther.getNumcuenta() != null && this.getNumcuenta().equals(castOther.getNumcuenta())))
				&& ((this.getDocumento() == castOther.getDocumento()) || (this.getDocumento() != null
						&& castOther.getDocumento() != null && this.getDocumento().equals(castOther.getDocumento())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNumcuenta() == null ? 0 : this.getNumcuenta().hashCode());
		result = 37 * result + (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		return result;
	}

}
