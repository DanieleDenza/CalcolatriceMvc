package it.daniele;

public class Dati {

	private String numero1;
	private String numero2;
	
	@Override
	public String toString() {
		return numero1 + " + " + numero2 + "="+ (Integer.parseInt(numero1)+Integer.parseInt(numero2));
	}
	
	public String getNum1() {
		return numero1;
	}
	public void setNum1(String num1) {
		this.numero1 = num1;
	}
	public String getNum2() {
		return numero2;
	}
	public void setNum2(String num2) {
		this.numero2 = num2;
	}
}
