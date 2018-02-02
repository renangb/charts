package br.com.renan.charts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.renan.charts.daos.GraficoDAO;
import br.com.renan.charts.models.Grafico;

@Controller
public class GraficosController {
	
	@Autowired
	private GraficoDAO graficoDao;
		
	@RequestMapping("/graficos/form")
	public String form(){
		return "/graficos/form";
	}
	
	@RequestMapping("/graficos")
	public String gravar(Grafico grafico){
	    System.out.println(grafico);
	    graficoDao.gravar(grafico);
	    
	    return "/graficos/ok";
	}
}
