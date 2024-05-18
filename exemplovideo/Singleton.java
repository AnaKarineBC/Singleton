package exemplovideo;

public class Singleton {
	// Atributo estático que conterá a única instância da classe Singleton, marcada
	// como volatile para garantir visibilidade correta entre threads.
	private static volatile Singleton instance;

	// Atributo de instância que armazena os dados passados no construtor.
	private String data;

	// Construtor privado para impedir a criação de instâncias fora da classe.
	private Singleton(String data) {
		this.data = data;
	}

	// Método estático para obter a única instância da classe, utilizando
	// Double-Checked Locking.
	public static Singleton getInstance(String data) {
		// Armazena a referência da instância em uma variável local para melhorar a
		// performance.
		Singleton result = instance;

		// Primeira verificação sem bloqueio para melhorar a performance.
		if (result == null) {
			// Sincroniza no bloco de código para garantir que apenas uma thread possa
			// executar este bloco de código ao mesmo tempo.
			synchronized (Singleton.class) {
				// Segunda verificação dentro do bloco sincronizado para garantir que a
				// instância ainda não foi criada por outra thread.
				if (result == null) {
					// Cria a instância e atualiza a variável local e o atributo estático.
					instance = result = new Singleton(data);
				}
			}
		}
		// Retorna a instância única.
		return result;
	}
}
