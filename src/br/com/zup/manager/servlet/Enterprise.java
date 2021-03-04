package br.com.zup.manager.servlet;

import java.time.LocalDate;

public class Enterprise {

	private Long id;
	private String name;
	private LocalDate fundation;

	public Enterprise(String name, LocalDate fundation) {
		this.name = name;
		this.fundation = fundation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getFundation() {
		return fundation;
	}

	public void setFundation(LocalDate fundation) {
		this.fundation = fundation;
	}

	@Override
	public String toString() {
		return "Empresa: " + name;
	}

}
