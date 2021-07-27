package bridge;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada janela) {
		super(janela);
	}

	@Override
	public void criar() {
		criarJanela(" Janela de Dialogo - ");
		criarBotao("Botao Sim");
		criarBotao("Botao Nao");
		criarBotao("Botao Voltar");
	}

}
