package com.fam.gastos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medios_pagos")
public class MedioPago {
	@Column(name = "id_medio_pago")
	private Integer idMedioPago;
	@Column(name = "descripcion")
	private String descripcion;
	
	public MedioPago() {
		super();
	}
	public MedioPago(Integer idMedioPago, String descripcion) {
		super();
		this.idMedioPago = idMedioPago;
		this.descripcion = descripcion;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdMedioPago() {
		return idMedioPago;
	}
	public void setIdMedioPago(Integer idMedioPago) {
		this.idMedioPago = idMedioPago;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
