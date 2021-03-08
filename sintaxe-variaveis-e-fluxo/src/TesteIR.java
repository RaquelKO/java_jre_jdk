
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;
		double aliquota = 0;
		double deducao = 0;
		
		if(salario >= 1900 && salario <= 2800) {
			aliquota = 7.5;
			deducao = 142;
		} else if(salario > 2800 && salario <= 3751) {
			aliquota = 15;
			deducao = 350;
		} else if (salario > 3751 && salario <= 4664) {
			aliquota = 22.5;
			deducao = 636;
		}
		
		System.out.println("A alíquota do seu IR é de " + aliquota + "%, e você pode deduzir R$" + deducao + ".");
		
	}
}
