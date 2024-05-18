package exemplovideo;

public class Singleton {
	// Atributo est�tico que conter� a �nica inst�ncia da classe Singleton, marcada
	// como volatile para garantir visibilidade correta entre threads.
	private static volatile Singleton instance;

	// Atributo de inst�ncia que armazena os dados passados no construtor.
	private String data;

	// Construtor privado para impedir a cria��o de inst�ncias fora da classe.
	private Singleton(String data) {
		this.data = data;
	}

	// M�todo est�tico para obter a �nica inst�ncia da classe, utilizando
	// Double-Checked Locking.
	public static Singleton getInstance(String data) {
		// Armazena a refer�ncia da inst�ncia em uma vari�vel local para melhorar a
		// performance.
		Singleton result = instance;

		// Primeira verifica��o sem bloqueio para melhorar a performance.
		if (result == null) {
			// Sincroniza no bloco de c�digo para garantir que apenas uma thread possa
			// executar este bloco de c�digo ao mesmo tempo.
			synchronized (Singleton.class) {
				// Segunda verifica��o dentro do bloco sincronizado para garantir que a
				// inst�ncia ainda n�o foi criada por outra thread.
				if (result == null) {
					// Cria a inst�ncia e atualiza a vari�vel local e o atributo est�tico.
					instance = result = new Singleton(data);
				}
			}
		}
		// Retorna a inst�ncia �nica.
		return result;
	}
}
