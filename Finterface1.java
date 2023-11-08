package FunctionalInterface;

@FunctionalInterface
interface A{
	void show();
}

public class Finterface1 {
	public static void main(String[] args) {
		A obj = () -> System.out.println("show");
		obj.show();
		
		A obj1 = new A() {
			@Override
			public void show() {
				System.out.println("Hello");
			}
		};
		obj1.show();
	}
}
