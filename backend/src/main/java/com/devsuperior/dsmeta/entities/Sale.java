package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Vai preparar o projeto na hora da compilação para que a classe seja equivalente a uma tabela do banco de dados.
@Table(name = "tb_sales") // Nome da tabela.
public class Sale {
	
	@Id //Identifica o ID como único para cada venda. 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Faz com que o ID seja auto incremental e de forma automática 1,2,3 ...
	private Long id;
	private String sellerName;     //vendedor
	private Integer visited;      //Numero de visitas
	private Integer deals;       // Vendas
	private Double amount;      //Total
	private LocalDate date;    // Data

	public Sale () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
