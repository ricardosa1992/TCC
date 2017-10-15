package K_Means;

import java.util.ArrayList;

public class Agrupamento {
	float valorCentroide;
	ArrayList<Ponto> listaPontos;
	
	public Agrupamento(float _valor) {
		valorCentroide = _valor;
		listaPontos = new ArrayList<>();
	}
	
	public float getValorCentroide() {
		return valorCentroide;
	}

	public void setValorCentroide(float valorCentroide) {
		this.valorCentroide = valorCentroide;
	}

	public void addPonto(Ponto p) {
		listaPontos.add(p);
	}
	
	public ArrayList<Ponto> getListaPontos(){
		return listaPontos;
	}
	
	public void setListaPontos(ArrayList<Ponto> lista) {
		listaPontos = lista;
	}
	
}
