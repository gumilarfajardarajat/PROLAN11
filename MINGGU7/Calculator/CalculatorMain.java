import java.util.Scanner;

public class CalculatorMain{
	public static void main(String []args){
		double operan1,operan2;	
		Scanner input = new Scanner(System.in);
		Calculator cal = new SubCalculator();
		System.out.println("Operan 1 :");
		operan1 = input.nextDouble();
		System.out.println("Operan 2 :");
		operan2 = input.nextDouble();
		System.out.println("Hasil Perkalian = "+cal.hasilTambah(operan1,operan2));
		System.out.println("Hasil Perkalian = "+cal.hasilKurang(operan1,operan2));
		System.out.println("Hasil Perkalian = "+cal.hasilKali(operan1,operan2));
		System.out.println("Hasil Perkalian = "+cal.hasilBagi(operan1,operan2));
	}
}