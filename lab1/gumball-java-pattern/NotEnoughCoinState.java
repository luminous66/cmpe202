

public class NotEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        
        if(gumballMachine.noQuarterAccepted){
            if(coin==25){
            gumballMachine.addCoin(coin) ;
            }
            else{
            System.out.println("You haven't inserted a quarter. Other coins are not accepted.");
            }
        }
        else gumballMachine.addCoin( coin );

        if(gumballMachine.getCoin() >= gumballMachine.getCost()){
            gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        }
        else{
            System.out.println("Total cost is "+gumballMachine.getCost()+". You need to insert "+gumballMachine.moreCoin()+" cents.");
        }
        
    }
 
    public void ejectCoin() {
        if(gumballMachine.coininserted ==0 ){
            System.out.println("You haven't inserted a coin");
        }
        else{
            gumballMachine.setCoin(0);
            System.out.println("Coins returned");
        }
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there are not enough coins");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for coins";
    }
}
