package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Cargo;

public class TesteLista {
	
	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("ESTAGIARIO", "JUNIOR", 122222.00));

		lista.add(new Cargo("DBA", "TRAINEE", 23.00));
		
		lista.add(new Cargo("DEV", "PLENO", 3000.00));
//		Collections.sort(lista);
		Collections.sort(lista);
		for(Cargo objeto : lista) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getNivel());
			System.out.println(objeto.getSalario());
		}
	}
	
}
