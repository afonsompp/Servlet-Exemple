package br.com.zup.manager.servlet;

import java.util.ArrayList;
import java.util.List;

public class Data {

	private static List<Enterprise> list = new ArrayList<>();
	
	static {
		save(new Enterprise("Google"));
		save(new Enterprise("Zup"));
	}

	public static void save(Enterprise e) {
		e.setId(Long.valueOf(list.size() + 1));
		list.add(e);
	}

	public static List<Enterprise> findAll() {
		return list;
	}
	
	public static String findOne(String enterprise) {
		var a = list.stream().filter(e -> e.getName().equals(enterprise)).findFirst();
		
		return a.get().getName();
	}

}
