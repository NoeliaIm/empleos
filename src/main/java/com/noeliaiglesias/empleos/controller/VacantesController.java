package com.noeliaiglesias.empleos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.noeliaiglesias.empleos.model.Vacante;
import com.noeliaiglesias.empleos.service.IVacanteService;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {

	@Autowired
	private IVacanteService vacanteService;


	@GetMapping("/mostrarDetalle/{id}")
	public String mostrarDetalleById(@PathVariable("id") int idVacante, Model model) {
		Vacante vacante = vacanteService.buscarById(idVacante);
		model.addAttribute("vacante", vacante);

		return "mostrarDetalle";
	}

	@GetMapping("/delete")
	public String borrarVacante(@RequestParam("id") int id, Model model) {

		Vacante vacante = vacanteService.buscarById(id);
		model.addAttribute("vacante", vacante);

		return "borrado";
	}

	/*
	 * @GetMapping("/mostrarDetalle") public String
	 * mostrarDetalleById(@RequestParam("id") int idVacante, Model model) {
	 * List<Vacante> lista =
	 * com.noeliaiglesias.empleos.controller.HomeController.getVacantes(); for
	 * (Vacante vacante : lista) { if (vacante.getId() == idVacante) {
	 * model.addAttribute("vacante", vacante); } } return "mostrarDetalle"; }
	 */
}
