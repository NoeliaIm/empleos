package com.noeliaiglesias.empleos.service;

import java.util.List;

import com.noeliaiglesias.empleos.model.Vacante;

public interface IVacanteService {

	List<Vacante> buscarTodas();

	Vacante buscarById(int id);

}
