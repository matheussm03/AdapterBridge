package bridge;

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void criarJanela(String titulo) {
		System.out.println(titulo + "Janela Windows");
	}

	@Override
	public void criarBotao(String titulo) {
		System.out.println(titulo + "Botao Windows");
	}

}
