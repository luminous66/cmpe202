

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine1 = new GumballMachine(2,25,true);

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin(10);
		gumballMachine1.turnCrank();

		System.out.println(gumballMachine1);

		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoin(25);
		gumballMachine1.ejectCoin();
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		gumballMachine1.refill(5);
		gumballMachine1.insertCoin(25);
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		
		GumballMachine gumballMachine2 = new GumballMachine(3,50,true);

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();
		gumballMachine2.insertCoin(25);
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);
		
		
		GumballMachine gumballMachine3 = new GumballMachine(2,50,false);

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin(5);
		gumballMachine3.turnCrank();
		gumballMachine1.ejectCoin();
		gumballMachine3.insertCoin(10);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(10);
		gumballMachine3.turnCrank();
		gumballMachine3.insertCoin(25);
		gumballMachine3.insertCoin(25);
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);
	}
}
