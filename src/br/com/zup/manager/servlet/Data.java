package br.com.zup.manager.servlet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Data {

	private static List<Enterprise> list = new ArrayList<>();
	
	static {
		save(new Enterprise("Google", LocalDate.parse("2000-10-25")));
		save(new Enterprise("Zup", LocalDate.parse("2010-03-21")));
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
