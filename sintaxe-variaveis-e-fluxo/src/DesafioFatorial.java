// O seu desafio é imprimir os fatoriais de 1 a 10!

public class DesafioFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for(int n = 1; n <= 10; n++) {
			fatorial *= n; // fatorial = n * fatorial;
			System.out.println(fatorial);
		}
	}
}
