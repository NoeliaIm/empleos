package com.noeliaiglesias.empleos.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.noeliaiglesias.empleos.model.Vacante;
import com.noeliaiglesias.empleos.service.IVacanteService;

@Service
public class VacanteServiceImpl implements IVacanteService {
	private List<Vacante> lista = null;

	public VacanteServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			Vacante vacante0 = new Vacante();
			vacante0.setDescripcion("Labores de mantenimiento del servidor");
			vacante0.setFecha(sdf.parse("11-12-2020"));
			vacante0.setId(1);
			vacante0.setNombre("Ingeniero de sistemas");
			vacante0.setSalario(1000.0);
			vacante0.setDestacado(1);

			Vacante vacante1 = new Vacante();
			vacante1.setDescripcion("Labores de desarrollo");
			vacante1.setFecha(sdf.parse("10-01-2021"));
			vacante1.setId(2);
			vacante1.setNombre("Desarrolladore de aplicaciones");
			vacante1.setSalario(1000.0);
			vacante1.setDestacado(1);

			Vacante vacante2 = new Vacante();
			vacante2.setDescripcion("Labores de secretaría");
			vacante2.setFecha(sdf.parse("15-11-2020"));
			vacante2.setId(3);
			vacante2.setNombre("Auxiliar administrativo");
			vacante2.setSalario(1000.0);
			vacante2.setDestacado(0);

			Vacante vacante3 = new Vacante();
			vacante3.setDescripcion("Labores de limpieza");
			vacante3.setFecha(sdf.parse("06-12-2020"));
			vacante3.setId(4);
			vacante3.setNombre("Limpiadora");
			vacante3.setSalario(1000.0);
			vacante3.setDestacado(0);

			lista.add(vacante0);
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);

		} catch (ParseException e) {
			// TODO: handle exception
			System.err.println("Error: " + e.getMessage());
		}

	}

	@Override
	public List<Vacante> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Vacante buscarById(int id) {
		for (Vacante vacante : lista) {
			if (vacante.getId() == id) {
				return vacante;
			}
		}
		return null;
	}

}
