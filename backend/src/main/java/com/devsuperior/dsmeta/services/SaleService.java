package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service //Registra o SaleService como componente do sistema.
public class SaleService {
	
	@Autowired // Anotation que faz importação automatica
	private SaleRepository repository; //Declarando o repository que é responsavel pela interação com banco de dados
	
	//Operação para buscar dados
	public List<Sale> findSales() {
		return repository.findAll(); //Busca do banco todas as vendas.
		
	}
}
