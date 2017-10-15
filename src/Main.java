
public class Main {

	public static void main(String[] args) {
		MatrizCustos matriz = new MatrizCustos();
		matriz.lerPontos("C:\\\\Users\\\\RICARDO\\\\eclipse-workspace\\\\TCC\\\\Instancias-TSP\\\\coord-eil51.txt");
		matriz.calcularMatrizDistancia();
		//matriz.printMatriz();
		//matriz.printPosIguais();
		matriz.gravarMatriz("M-51.csv");

	}

}
