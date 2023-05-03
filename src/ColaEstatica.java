
public class ColaEstatica {

	//Tamaño por defecto
	public int tamañoPorDefecto = 7;
	//Punteros
	public int inicio = 0;
	public int fin = 0;
	//Arreglo
	public int[] arregloCola;
	
	//Constructor sin parametros
	public ColaEstatica() {
		arregloCola = new int[tamañoPorDefecto];
	}
	//Sobrecarga del constructor
	public ColaEstatica(int nuevoTamaño) {
		arregloCola = new int[nuevoTamaño];
	}
	
	//METODOS
	//PUSH
	public void push(int elementoAInsertar) {
		arregloCola[fin] = elementoAInsertar;
		fin = fin + 1;
	}
	//POP()
	public int pop() {
		return arregloCola[inicio++];
	}
	//Empty()
	public boolean empty() {
		if(inicio == fin)
			return true;
		return false;
	}
	//FULL()
	public boolean full() {
		if(fin == arregloCola.length)
			return true;
		return false;
	}
}