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
		if (list.size() == 0) {
			e.setId(1L);
		} else {
			var last = list.get(list.size() - 1);
			e.setId(last.getId() + 1L);
		}
		list.add(e);
	}

	public static List<Enterprise> findAll() {
		return list;
	}

	public static void delete(Long id) {
		list.removeIf(e -> e.getId() == id);
	}

	public static void update(Long id, Enterprise en) {
		list.stream()
			.filter(e -> e.getId() == id)
			.forEach(e -> 
				{ 
					e.setName(en.getName());
					e.setFundation(en.getFundation());
				});
	}

	public static String findOne(String enterprise) {
		var a = list.stream().filter(e -> e.getName().equals(enterprise)).findFirst();

		return a.get().getName();
	}

}
