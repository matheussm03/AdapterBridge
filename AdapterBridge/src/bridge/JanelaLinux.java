package bridge;

public class JanelaLinux implements JanelaImplementada {

	@Override
	public void criarJanela(String titulo) {
		System.out.println(titulo + "Janela Linux");
	}

	@Override
	public void criarBotao(String titulo) {
		System.out.println(titulo + "Botao Linux");
	}

}
