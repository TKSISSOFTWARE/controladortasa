package com.monedafrontera.dto;
// Generated 5/11/2015 11:46:49 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Personal generated by hbm2java
 */
public class Personal implements java.io.Serializable {

	private String documento;
	private Cargo cargo;
	private String tipodocumento;
	private String nombre;
	private String apellido;
	private String celular;
	private String telefono;
	private String pinbb;
	private String direccion;
	private String correo;
	private String correoalternativo;
	private Date fechanac;
	private Date ultmactualizacion;
	private Boolean correosalerta;
	private Set gastoses = new HashSet(0);
	private Set comisionhistoricos = new HashSet(0);
	private Gestor gestor;
	private Arrastrador arrastrador;
	private Set saldos = new HashSet(0);
	private Administrativo administrativo;
	private Promotor promotor;
	private Asesor asesor;

	public Personal() {
	}

	public Personal(String documento, String nombre) {
		this.documento = documento;
		this.nombre = nombre;
	}

	public Personal(String documento, Cargo cargo, String tipodocumento, String nombre, String apellido, String celular,
			String telefono, String pinbb, String direccion, String correo, String correoalternativo, Date fechanac,
			Date ultmactualizacion, Boolean correosalerta, Set gastoses, Set comisionhistoricos, Gestor gestor,
			Arrastrador arrastrador, Set saldos, Administrativo administrativo, Promotor promotor, Asesor asesor) {
		this.documento = documento;
		this.cargo = cargo;
		this.tipodocumento = tipodocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.telefono = telefono;
		this.pinbb = pinbb;
		this.direccion = direccion;
		this.correo = correo;
		this.correoalternativo = correoalternativo;
		this.fechanac = fechanac;
		this.ultmactualizacion = ultmactualizacion;
		this.correosalerta = correosalerta;
		this.gastoses = gastoses;
		this.comisionhistoricos = comisionhistoricos;
		this.gestor = gestor;
		this.arrastrador = arrastrador;
		this.saldos = saldos;
		this.administrativo = administrativo;
		this.promotor = promotor;
		this.asesor = asesor;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPinbb() {
		return this.pinbb;
	}

	public void setPinbb(String pinbb) {
		this.pinbb = pinbb;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreoalternativo() {
		return this.correoalternativo;
	}

	public void setCorreoalternativo(String correoalternativo) {
		this.correoalternativo = correoalternativo;
	}

	public Date getFechanac() {
		return this.fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public Date getUltmactualizacion() {
		return this.ultmactualizacion;
	}

	public void setUltmactualizacion(Date ultmactualizacion) {
		this.ultmactualizacion = ultmactualizacion;
	}

	public Boolean getCorreosalerta() {
		return this.correosalerta;
	}

	public void setCorreosalerta(Boolean correosalerta) {
		this.correosalerta = correosalerta;
	}

	public Set getGastoses() {
		return this.gastoses;
	}

	public void setGastoses(Set gastoses) {
		this.gastoses = gastoses;
	}

	public Set getComisionhistoricos() {
		return this.comisionhistoricos;
	}

	public void setComisionhistoricos(Set comisionhistoricos) {
		this.comisionhistoricos = comisionhistoricos;
	}

	public Gestor getGestor() {
		return this.gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Arrastrador getArrastrador() {
		return this.arrastrador;
	}

	public void setArrastrador(Arrastrador arrastrador) {
		this.arrastrador = arrastrador;
	}

	public Set getSaldos() {
		return this.saldos;
	}

	public void setSaldos(Set saldos) {
		this.saldos = saldos;
	}

	public Administrativo getAdministrativo() {
		return this.administrativo;
	}

	public void setAdministrativo(Administrativo administrativo) {
		this.administrativo = administrativo;
	}

	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public Asesor getAsesor() {
		return this.asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

}
