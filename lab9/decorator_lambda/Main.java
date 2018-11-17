public class Main {
 
	public static void main(String args[]) {
		Beverage beverage1 = new Decaf();
		Beverage beverage1Mocha = () -> beverage1.getDescription() + ", Mocha";
		Beverage beverage1MochaMilk = () -> beverage1Mocha.getDescription() + ", Milk";
		System.out.println(beverage1MochaMilk.getDescription());
 
		Beverage beverage2 = new Espresso();
		Beverage beverage2Soy = () -> beverage2.getDescription() + ", Soy";
		Beverage beverage2SoyMilk = () -> beverage2.getDescription() + ", Milk";
		Beverage beverage2SoyMilkMilk = () -> beverage2.getDescription() + ", Milk";
		System.out.println(beverage2SoyMilkMilk.getDescription());
	}
}
