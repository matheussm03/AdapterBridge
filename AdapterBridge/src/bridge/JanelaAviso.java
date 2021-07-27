package bridge;

public class JanelaAviso extends JanelaAbstrata {

	public JanelaAviso(JanelaImplementada janela) {
		super(janela);
	}

	@Override
	public void criar() {
		criarJanela(" Janela de Aviso - ");
		criarBotao("Ok");
	}

}
