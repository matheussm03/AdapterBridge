package bridge;

public class Teste {
	public static void main(String[] args) {
		
		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
		janela.criar();
		
		janela = new JanelaAviso(new JanelaLinux());
		janela.criar();
		
		janela = new JanelaAviso(new JanelaWindows());
		janela.criar();

		janela = new JanelaDialogo(new JanelaWindows());
		janela.criar();
		
	}
}
