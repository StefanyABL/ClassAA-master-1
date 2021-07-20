package logic;

public class A {

	int number;

	public A(int number) {

		this.number = number;
	}

	public A() {

	}

	public boolean isPar(){
		if(number%2==0){
			return number%2==0 ? true : false;

		}else{
			return number%2==0;

		}

	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isCousing(){
		int cont=2;
		boolean cousing=true;
		while (cont <= number/2 && cousing) {
			cousing =!(number % cont++==0);
		}
		return cousing;

	}

	public int valueAbsolute(){

		return number > 0 ? number : number*(-1); //sino : ? si

	}
}
