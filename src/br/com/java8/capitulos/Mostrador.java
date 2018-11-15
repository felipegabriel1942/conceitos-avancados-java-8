package br.com.java8.capitulos;

import java.util.function.Consumer;

import br.com.java8.model.Usuario;

public class Mostrador implements Consumer<Usuario>{

	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
		
	}

}
