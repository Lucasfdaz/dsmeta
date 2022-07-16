package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service //Registra o SaleService como componente do sistema.
public class SaleService {
	
	@Autowired // Anotation que faz importação automatica
	private SaleRepository repository; //Declarando o repository que é responsavel pela interação com banco de dados
	
	//Operação para buscar dados
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		
		LocalDate min = minDate.equals("")? today.minusDays(365) : LocalDate.parse(minDate);
		LocalDate max = maxDate.equals("")? today : LocalDate.parse(maxDate); //Verifica se a data esta vazia através de expressão condicional ternária
		
		return repository.findSales(min, max, pageable); //Busca do banco todas as vendas.
		
		
	}
}