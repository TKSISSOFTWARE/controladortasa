package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

/**
 * Detallefactura generated by hbm2java
 */
public class Detallefactura implements java.io.Serializable {

	private DetallefacturaId id;
	private Factura factura;
	private Inventario inventario;
	private Short cantidad;
	private Long valor;

	public Detallefactura() {
	}

	public Detallefactura(DetallefacturaId id, Factura factura, Inventario inventario) {
		this.id = id;
		this.factura = factura;
		this.inventario = inventario;
	}

	public Detallefactura(DetallefacturaId id, Factura factura, Inventario inventario, Short cantidad, Long valor) {
		this.id = id;
		this.factura = factura;
		this.inventario = inventario;
		this.cantidad = cantidad;
		this.valor = valor;
	}

	public DetallefacturaId getId() {
		return this.id;
	}

	public void setId(DetallefacturaId id) {
		this.id = id;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Inventario getInventario() {
		return this.inventario;
	}

	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}

	public Short getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Short cantidad) {
		this.cantidad = cantidad;
	}

	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

}
