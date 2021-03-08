
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		
		int valor = (int) salario;
		System.out.println(valor);
		
		int x = 2000000;
		long numeroGrande =  326541231564215L;
		short valorPequeno = 2131;
		byte b = 127;
		
		float pontoFlutuante = (float) 3.14;
		float outroPontoFlutuante = 3.14f;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}
}
