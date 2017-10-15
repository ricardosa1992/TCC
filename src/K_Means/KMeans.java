package K_Means;

import java.util.ArrayList;

public class KMeans {
	public static void kMeans(ArrayList<Ponto> listaDePontos, int qtdCentroids) {
		ArrayList<Ponto> centroids = definirCentroidsAleatorios(listaDePontos, qtdCentroids);
		for (Ponto ponto : centroids) {
			System.out.println("Centroide " + ponto.valor + " posX: " + ponto.posX + " posY: " + ponto.posY);
		}
 	}
	
	public static ArrayList<Ponto> definirCentroidsAleatorios(ArrayList<Ponto> listaDePontos, int qtdCentroids){
		float maiorValorPosX = 0;
		float maiorValorPosY = 0;
		float somaPosX = 0;
		float somaPosY = 0;
		float mediaPosX = 0;
		float mediaPosY = 0;
		ArrayList<Ponto> centroids = new ArrayList<>();
		
		for (Ponto ponto : listaDePontos) {
			somaPosX += ponto.posX;
			somaPosY += ponto.posY;
			if(ponto.posX > maiorValorPosX) 
				maiorValorPosX = ponto.posX;
			if(ponto.posY > maiorValorPosY)
				maiorValorPosY = ponto.posY;
		}
		
		mediaPosX = somaPosX / listaDePontos.size();
		mediaPosY = somaPosY / listaDePontos.size();
		
		centroids.add(new Ponto(-1, (int)mediaPosX, (int)mediaPosY));
		centroids.add(new Ponto(-2, (int)(mediaPosX/2), (int)(mediaPosY/2)));
		centroids.add(new Ponto(-2, (int)(maiorValorPosX/2), (int)(maiorValorPosY/2)));
		
		return centroids;
		
	}
	
}
