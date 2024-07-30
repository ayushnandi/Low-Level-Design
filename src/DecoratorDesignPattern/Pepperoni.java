package DecoratorDesignPattern;

public class Pepperoni extends ToppingDecorator{
	
	BasePizza basePizza;
	public Pepperoni (BasePizza pizza) {
		this.basePizza = pizza;
	}
	public int cost() {
		return basePizza.cost() + 10;
	}
}
