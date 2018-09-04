

public class Main {

	public static void main(String[] args) {
		//Model1:cost 25cents, accept only quarter
	        GumballMachine gumballMachine1 = new GumballMachine(5,25,false);

		System.out.println(gumballMachine1);
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 10 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		gumballMachine1.insertQuarter( 25 );
		gumballMachine1.turnCrank();
		System.out.println(gumballMachine1);
		
		//Model2:cost 50cents, accept only quarter
		GumballMachine gumballMachine2 = new GumballMachine(5,50,false);

		System.out.println(gumballMachine2);
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 10 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.insertQuarter( 25 );
		gumballMachine2.turnCrank();
		System.out.println(gumballMachine2);
		
		//Model3:cost 50cents, accept all coins
		GumballMachine gumballMachine3 = new GumballMachine(5,50,true);

		System.out.println(gumballMachine3);
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 5 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 5 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 5 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 10 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		gumballMachine3.insertQuarter( 25 );
		gumballMachine3.turnCrank();
		
		System.out.println(gumballMachine3);
	}
}
