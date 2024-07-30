package DecoratorDesignPattern;

public class ExtraCheese extends ToppingDecorator{
	
	BasePizza basePizza;
	public ExtraCheese (BasePizza pizza) {
		this.basePizza = pizza;
	}
	public int cost() {
		return basePizza.cost() + 20;
	}
	
}
