public final class Singleton {
    // Atributo est�tico que conter� a �nica inst�ncia da classe.
	private static Singleton instance;
    
    // Atributo p�blico que armazena um valor associado � inst�ncia Singleton.
	public String value;

    // Construtor privado para impedir que outras classes criem inst�ncias desta classe diretamente.
	private Singleton(String value) {
        // O c�digo abaixo simula uma inicializa��o lenta.
		try {
            // Pausa a execu��o da thread por 1 segundo.
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
            // Captura e imprime qualquer exce��o que ocorra durante a pausa da thread.
			ex.printStackTrace();
		}
        // Atribui o valor passado ao atributo da inst�ncia.
		this.value = value;
	}

    // M�todo est�tico que retorna a �nica inst�ncia da classe, criando-a se ainda n�o existir.
	public static Singleton getInstance(String value) {
        // Verifica se a inst�ncia ainda n�o foi criada.
		if (instance == null) {
            // Cria a nova inst�ncia com o valor fornecido.
			instance = new Singleton(value);
		}
        // Retorna a inst�ncia existente (ou rec�m-criada).
		return instance;
	}
}
