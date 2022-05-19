package com.fam.gastos.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fam.gastos.model.MedioPago;
import com.fam.gastos.model.repository.MedioPagoRepository;

@Service
@Transactional
public class MedioPagoService {

	@Autowired
	private MedioPagoRepository medioPagoRepository;
	
	public List<MedioPago> findAll(){
		return medioPagoRepository.findAll();
	}
	
	public void save(MedioPago medioPago) {
		medioPagoRepository.save(medioPago);
	}
	
	public void delete(MedioPago medioPago) {
		medioPagoRepository.delete(medioPago);
	}
	
	public MedioPago getById(Integer idMedioPago) {
		return medioPagoRepository.getById(idMedioPago);
	}
	
	public Boolean existsById(Integer idMoneda) {
		return medioPagoRepository.existsById(idMoneda);
	}
}
