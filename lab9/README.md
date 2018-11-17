# Decorator Pattern in original and lambda implementation

## Original

```
public class Main {
 
	public static void main(String args[]) {
		Beverage beverage2 = new Decaf();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Milk(beverage2);
		System.out.println(beverage2.getDescription());
 
		Beverage beverage3 = new Espresso();
		beverage3 = new Soy(beverage3);
		beverage3 = new Milk(beverage3);
		beverage3 = new Milk(beverage3);
		System.out.println(beverage3.getDescription());
	}
}
```
As we can see, we have to define each decorator classes.

## Lambda 

```
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
```

By lambda expressions, it makes the additional classes for decorators redundant. You don’t need to write decorator classes and only specify behavior each time.
However, if you have a concrete decorator class, you can reuse it next time.
