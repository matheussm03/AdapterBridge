package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarteiraTest {

 @Test
    void deveRetornarCarroDePasseio() {
    	CarteiraMotoristaB carteiraMotoristaB = new CarteiraMotoristaB();
        assertEquals("Carro de Passeio", carteiraMotoristaB.getCategoria());
    }
  
    
 @Test
 void deveRetornarCarroDePasseioCaminhaoOnibus() {
	 	CarteiraMotoristaB carteiraMotoristaB = new CarteiraMotoristaB();
		CarteiraMotoristaD carteiraMotoristaD = new CarteiraMotoristaD();
		CarteiraAdapter carteiraAdapter = new CarteiraAdapter(carteiraMotoristaD);
		carteiraAdapter.setCategoria(carteiraMotoristaB.getCategoria());
     assertEquals("Carro de Passeio - Caminhão - Ônibus", carteiraMotoristaD.getCategoria());
 }
    



}
