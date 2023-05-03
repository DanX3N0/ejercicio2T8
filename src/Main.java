import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un entero N:");
		int n = Integer.parseInt(sc.nextLine());
		
		ColaEstatica cola1 = new ColaEstatica(n);
		ColaEstatica cola2 = new ColaEstatica(n);
		ColaEstatica cola3 = new ColaEstatica(n);
		
		System.out.println("Ingrese los datos de C1: ");
		while(!cola1.full()) {
			int dato = sc.nextInt();
			cola1.push(dato);
		}
		
		System.out.println("Ingrese los datos de C2: ");
		while(!cola2.full()) {
			int dato = sc.nextInt();
			cola2.push(dato);
		}
		
		//suma hacia C3
		while(!cola1.empty()) {
			int a = cola1.pop();
			int b = cola2.pop();
			int suma = a + b;
			cola3.push(suma);
		}
		
		System.out.println("El resultado es:");
		while(!cola3.empty()) {
			System.out.println("-> " + cola3.pop());
		}
	}
	
}
