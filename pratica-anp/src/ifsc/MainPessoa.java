package ifsc;

public class MainPessoa {

	public static void main(String[] args) {

		Professor objeto = new Professor ();
		
		objeto.setNome("Bruna");
		objeto.setCpf("513.480.895-14");
		objeto.setSiape(120512369);
		
		System.out.println(objeto.getNome());
		System.out.println(objeto.getCpf());
		System.out.println(objeto.getSiape());
		
		Aluno triste = new Aluno ();
		
		triste.setNome("Andrieli");
		triste.setCpf("120.407.569-73");
		triste.setMatricula(224584721);
		
		System.out.println(triste.getNome());
		System.out.println(triste.getCpf());
		System.out.println(triste.getMatricula());
		
	}

}
