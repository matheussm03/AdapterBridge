package bridge;

public abstract class JanelaAbstrata {

	protected JanelaImplementada janela;

	public JanelaAbstrata(JanelaImplementada janela) {
		this.janela = janela;
	}

	public void criarJanela(String titulo) {
		this.janela.criarJanela(titulo);
	}

	public void criarBotao(String titulo) {
		this.janela.criarBotao(titulo);
	}

	public abstract void criar();

}
