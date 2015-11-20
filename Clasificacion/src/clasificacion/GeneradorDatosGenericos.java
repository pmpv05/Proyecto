package clasificacion;


import java.util.Random;

public class GeneradorDatosGenericos {
	private static int TAMANIO_MAX = 32000;
	public int[] generarDatosAleatorios() {
		Random rnd = new Random();
		int[] datosGenerados = new int[TAMANIO_MAX];
		boolean[] datosUtilizados = new boolean[TAMANIO_MAX];
		for (int i = 0; i < datosGenerados.length; i++) {
			int j = rnd.nextInt(TAMANIO_MAX);
			while(datosUtilizados[j]){
				j = (j + 1) % TAMANIO_MAX;
			}
			datosGenerados[j] = i;
			datosUtilizados[j] = true;
		}
		return datosGenerados;
	}
	
	public int[] generarDatosAscendentes() {
		int [] copiaAscendente = new int[TAMANIO_MAX];
		for (int i = 0; i < TAMANIO_MAX; i++) {
			copiaAscendente[i] = i;
		}
		return copiaAscendente;
	}
	
	public int[] generarDatosDescendentes() {
		int [] copiaDescendente = new int[TAMANIO_MAX];
		for (int i = 0; i < TAMANIO_MAX; i++) {
			copiaDescendente[i] = TAMANIO_MAX - i;
		}
		return copiaDescendente;
	}
	
	public int[] generarDatosAscendentes(int tam) {
		int [] copiaAscendente = new int[tam];
		for (int i = 0; i < tam; i++) {
			copiaAscendente[i] = i;
		}
		return copiaAscendente;
	}
	
	public int[] generarDatosDescendentes(int tam) {
		int [] copiaDescendente = new int[tam];
		for (int i = 0; i < tam; i++) {
			copiaDescendente[i] = tam - i;
		}
		return copiaDescendente;
	}
	
	public int[] generarDatosAleatorios(int size){
		Random rnd = new Random();
		int[] datosGenerados = new int[size];
		boolean[] datosUtilizados = new boolean[size];
		for (int i = 0; i < datosGenerados.length; i++) {
			int j = rnd.nextInt(size);
			while(datosUtilizados[j]){
				j = (j + 1) % size;
			}
			datosGenerados[j] = i;
			datosUtilizados[j] = true;
		}
		return datosGenerados;
	}
}
