package DecoratorDesignPattern;

public class DDP {
	
	public static void main(String[] args) {
		
		BasePizza pizza = new Pepperoni(new ExtraCheese(new Farmhouse()));
		System.out.println(pizza.cost());
	}
}