public final class Singleton {
    // Atributo estático que conterá a única instância da classe.
	private static Singleton instance;
    
    // Atributo público que armazena um valor associado à instância Singleton.
	public String value;

    // Construtor privado para impedir que outras classes criem instâncias desta classe diretamente.
	private Singleton(String value) {
        // O código abaixo simula uma inicialização lenta.
		try {
            // Pausa a execução da thread por 1 segundo.
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
            // Captura e imprime qualquer exceção que ocorra durante a pausa da thread.
			ex.printStackTrace();
		}
        // Atribui o valor passado ao atributo da instância.
		this.value = value;
	}

    // Método estático que retorna a única instância da classe, criando-a se ainda não existir.
	public static Singleton getInstance(String value) {
        // Verifica se a instância ainda não foi criada.
		if (instance == null) {
            // Cria a nova instância com o valor fornecido.
			instance = new Singleton(value);
		}
        // Retorna a instância existente (ou recém-criada).
		return instance;
	}
}
