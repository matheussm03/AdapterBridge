package adapter;

public class CarteiraMotoristaD implements ICategoria{
	
	private String categoria;
	
	public CarteiraMotoristaD() {
		this.categoria = "Caminh�o - �nibus";
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
