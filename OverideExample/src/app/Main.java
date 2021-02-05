package app;

class A{
	public void showDataFromLastyearDatabase() {
		System.out.println("In A");
	}
}


class B extends A{
	public void showDataFromLastyearDataBase() {
		System.out.println("In B");
	}
}


public class Main {
	public static void main(String[] args) {
		B obj = new B();
		obj.showDataFromLastyearDatabase();
		
	}

}
