package Arrays;

public class Funciones {
	public void rellenarArray(int [] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) (Math.random()*25+1);
		}
	}
}
