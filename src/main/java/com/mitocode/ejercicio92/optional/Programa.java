package com.mitocode.ejercicio92.optional;

import java.util.Optional;

public class Programa {

	public static void main(String[] args) {
		String nombre = null;
//		System.out.println(nombre.toUpperCase());
		
//		nombre = "Dany";
		Optional<String> op = Optional.ofNullable(nombre);
//		String nombre2 = op.get();
//		System.out.println(nombre2);
		
		System.out.println(op.isPresent());
		
		nombre = op.orElse("Juan");
		System.out.println(nombre);

	}

}
