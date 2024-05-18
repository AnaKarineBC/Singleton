public class DemoSingleThread {
	public static void main(String[] args) {
		// Imprime uma mensagem de introdução explicando o propósito do teste
		System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n"
				+ "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" + "RESULT:" + "\n");
		
		// Obtém a instância do Singleton com o valor "FOO"
		Singleton singleton = Singleton.getInstance("FOO");
		
		// Tenta obter outra instância do Singleton com o valor "BAR"
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		
		// Imprime o valor da primeira instância do Singleton
		System.out.println(singleton.value);
		
		// Imprime o valor da segunda instância do Singleton (que deveria ser a mesma instância)
		System.out.println(anotherSingleton.value);
	}
}
