package com.mitocode.ejercicio93.map;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {

		Map<String, String> paises = new HashMap<>();
		
		paises.put("PE", "Peru");
		paises.put("CO", "Colombia");
		paises.put("CH", "Chile");
		paises.put("EC", "Ecuador");
		
//		Imprimir con lambda
		paises.forEach((key,value) 
				-> System.out.println("key: " + key + " value: " + value));
		System.out.println();
		
//		Otra forma
		paises.entrySet().stream().forEach(System.out::println);
		System.out.println();
		
//		Busca key MX si no encuentra agrega
		paises.putIfAbsent("MX", "Mexico");
		paises.entrySet().stream().forEach(System.out::println);
		
//		Busca un key si no lo encuentra devuelve Hola
		String valor = paises.getOrDefault("PEE", "Hola");
		System.out.println("Valor: " + valor);
	}

}
