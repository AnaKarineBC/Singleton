public class DemoSingleThread {
	public static void main(String[] args) {
		// Imprime uma mensagem de introdu��o explicando o prop�sito do teste
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		
		// Obt�m a inst�ncia do Singleton com o valor "FOO"
		Singleton singleton = Singleton.getInstance("FOO");
		
		// Tenta obter outra inst�ncia do Singleton com o valor "BAR"
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		
		// Imprime o valor da primeira inst�ncia do Singleton
		System.out.println(singleton.value);
		
		// Imprime o valor da segunda inst�ncia do Singleton (que deveria ser a mesma inst�ncia)
		System.out.println(anotherSingleton.value);
	}
}
