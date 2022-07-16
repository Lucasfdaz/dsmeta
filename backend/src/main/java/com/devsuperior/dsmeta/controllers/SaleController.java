//Respónsavel pelos End Points da API

package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales" ) //Valor do caminho que vamos acessar
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	//Metodo que disponibiliza as vendas par ao front end
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();

}
}