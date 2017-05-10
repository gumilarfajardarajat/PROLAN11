public class SubCalculator extends Calculator{
	public double hasilTambah(double x, double y){
		double hasil;
		hasil = x + y;
		return hasil;
	}
	
	public double hasilKurang(double x, double y){
		double hasil;
		hasil = x - y;
		return hasil;
	}
	
	public double hasilKali(double x, double y){
		double hasil;
		hasil = x * y;
		return hasil;
	}
	
	public double hasilBagi(double x, double y){
		double hasil;
		hasil = x / y;
		return hasil;
	}
}