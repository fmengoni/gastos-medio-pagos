package com.fam.gastos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fam.gastos.model.MedioPago;
import com.fam.gastos.services.MedioPagoService;

@RestController
public class MedioPagoController {

	@Autowired
	private MedioPagoService medioPagoService;
	
	@GetMapping("/mediopagos")
	public List<MedioPago> findAll(){
		return medioPagoService.findAll();
	}
}
