package adapter;

public class CarteiraAdapter extends CarteiraMotoristaB {

	private CarteiraMotoristaD carteiraD;
	
	public CarteiraAdapter(CarteiraMotoristaD carteiraD) {
		this.carteiraD = carteiraD;
	}
	
	public void setCategoria(String categoria) {
		this.carteiraD.setCategoria(categoria + " - "+ carteiraD.getCategoria());
	}	
	
	public String getCategoria() {
		return this.carteiraD.getCategoria();
	}

}
