// Utilize um la�o do tipo for para imprimir todos os m�ltiplos de 3, entre 1 e 100.

public class DesafioMultiplos {

	public static void main(String[] args) {
		for(int numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0) {
				System.out.println(numero);
			}
		}
		
		// for (int i = 3; i < 100; i += 3 ){
        //     System.out.println(i);
        // }
	}
}
