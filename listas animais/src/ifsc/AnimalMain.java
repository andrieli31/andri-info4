package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		
		Cachorro jade = new Cachorro();
		jade.setNome("Jade");
		jade.setCor("Marrom");
		jade.setEcossistema("Mato");
		jade.setComprimento(304f);
		jade.setNumeroPatas(4);
		jade.setRaca("Vira lata");
		
		Cachorro poly = new Cachorro();
		poly.setNome("Polly");
		poly.setComprimento(105f);
		poly.setEcossistema("Roça");
		poly.setCor("Branca");
		poly.setNumeroPatas(4);
		poly.setRaca("Pastor suíço");
		
		Cachorro black = new Cachorro();
		black.setNome("Pretinha");
		black.setComprimento(105f);
		black.setEcossistema("Roça");
		black.setCor("Preta");
		black.setNumeroPatas(4);
		black.setRaca("Vira lata");
		
		ArrayList<Cachorro> cachorrinhos = new ArrayList<>();
		cachorrinhos.add(jade);
		cachorrinhos.add(poly);
		cachorrinhos.add(black);

		for (Cachorro cachorro : cachorrinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getNumeroPatas());
		}

		
		Gato nina = new Gato();
		nina.setComprimento(190f);
		nina.setNumeroPatas(4);
		nina.setRaca("Siamês");
		nina.setNome("Nina");
		nina.setEcossistema("mato");
		nina.setCor("manchada");
		
		Gato fifi = new Gato();
		fifi.setComprimento(190f);
		fifi.setNumeroPatas(4);
		fifi.setRaca("vira lata");
		fifi.setNome("Faísca");
		fifi.setEcossistema("mato");
		fifi.setCor("cinza");
		
		Gato buck = new Gato();
		buck.setComprimento(190f);
		buck.setNumeroPatas(4);
		buck.setRaca("vira lata");
		buck.setNome("Buck");
		buck.setEcossistema("roça");
		buck.setCor("laranja");
		
		
		ArrayList<Gato> gatinhos = new ArrayList<>();
		gatinhos.add(nina);
		gatinhos.add(fifi);
		gatinhos.add(buck);

		for (Gato gato : gatinhos) {
			System.out.println(gato.getComprimento());
			System.out.println(gato.getNumeroPatas());
			System.out.println(gato.getRaca());
			System.out.println(gato.getNome());
			System.out.println(gato.getCor());
			System.out.println(gato.getEcossistema());
			
		}
	}
}
