package Heran�a;

public class teste {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a preguica = new Pregui�a();
		 
		cachorro.setAcao("corre");
		cachorro.setNome("Bob");
		cachorro.setIdade(5);
		cavalo.setAcao("corre");
		cavalo.setNome("p�DePano");
		cavalo.setIdade(7);
		preguica.setAcao("sobe em �rvore");
		preguica.setNome("Sidy");
		preguica.setIdade(10);
		
		System.out.println("O nome do cachorro �: "+cachorro.getNome()+ "\nA idade do cachorro �: "
		+cachorro.getIdade()+ "\nA a��o do cachorro �: "+cachorro.getAcao());
		
		System.out.println("O nome do cavalo �: "+cavalo.getNome()+ "\nA idade do cavalo �: "
				+cavalo.getIdade()+ "\nA a��o do cavalo �: "+cavalo.getAcao());
		
		System.out.println("O nome do pregui�a �: "+preguica.getNome()+ "\nA idade do pregui�a �: "
				+preguica.getIdade()+ "\nA a��o do pregui�a �: "+preguica.getAcao());
		

	}

}
