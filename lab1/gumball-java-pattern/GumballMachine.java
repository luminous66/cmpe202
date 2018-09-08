

public class GumballMachine {
 
    State soldOutState;
    State notEnoughCoinState;
    State hasEnoughCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int totalcost;
    int coininserted=0;
    public boolean noQuarterAccepted;
 
    public GumballMachine(int numberGumballs,int cost,boolean quarterOrNot) {
        soldOutState = new SoldOutState(this);
        notEnoughCoinState = new NotEnoughCoinState(this);
        hasEnoughCoinState = new HasEnoughCoinState(this);
        soldState = new SoldState(this);

        this.totalcost=cost;
        this.noQuarterAccepted=quarterOrNot;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = notEnoughCoinState;
        } 

    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }

    int getCost() {
        return totalcost;
    }
 
    void addCoin(int coin) {
	coininserted += coin;
    }
    
    int getCoin() {
	return coininserted;
    }
    
    int moreCoin() {
	
        return totalcost-coininserted;
    }
    
    void setCoin(int coin) {
	coininserted = coin;
    }	
   
    public void refill(int count) {
        this.count = count;
        System.out.println(count +" balls refilled");
        state = notEnoughCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2018");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	else return result.toString();
    }
}
