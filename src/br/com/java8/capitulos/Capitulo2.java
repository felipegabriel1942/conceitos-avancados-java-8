package br.com.java8.capitulos;

import java.util.Arrays;
import java.util.List;

import br.com.java8.model.Usuario;

public class Capitulo2 {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveria", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		System.out.println("----- For Normal -------");
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}

		System.out.println("----- Implementando a interface Consumer -------");
		Mostrador mostrador = new Mostrador();
		usuarios.forEach(mostrador);

		System.out.println("----- Com Lambda -------");
		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

}
