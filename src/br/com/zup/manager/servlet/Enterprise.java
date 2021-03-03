package br.com.zup.manager.servlet;

public class Enterprise {

	private Long id;
	private String name;
	
	public Enterprise(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Empresa: " + name;
	}
	
}
