

import java.util.Random;

public class HasEnoughCoinState implements State {
	GumballMachine gumballMachine;
 
	public HasEnoughCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertCoin(int coin) {
		System.out.println("You can't insert another coin");
	}
 
	public void ejectCoin() {
		System.out.println("Coins returned");
		gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
