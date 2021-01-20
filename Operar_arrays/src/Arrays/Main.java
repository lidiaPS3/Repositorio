package Arrays;

public class Main {

	
	public static void main(String[] args) {
		Funciones funcion = new Funciones();
		int ind = 1;
		int [] array = new int [20];
		funcion.rellenarArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
