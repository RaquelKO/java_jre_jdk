
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		// quanto vale o segundo?
		// vari�veis guardam valores e n�o refer�ncias
		
		System.out.println(segundo);
	}
}
