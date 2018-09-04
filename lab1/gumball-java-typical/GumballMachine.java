
public class GumballMachine
{

    private int num_gumballs;
    private int cost;
    private int enough_money;
    private boolean nonquarter_accepted;

    public GumballMachine( int size ,int cost , boolean nonquarter_accepted)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost = cost ;
        this.enough_money = 0;
        this.nonquarter_accepted = nonquarter_accepted;
    }

    public void insertQuarter(int coin)
    {
        if (enough_money<this.cost) {
            if(this.nonquarter_accepted)
            this.enough_money += coin ;
            else{
                if(coin==25)
                this.enough_money += coin ;
                else
                System.out.println( "Only accept quarter." ) ;
            }
        }
    }
    
    public void turnCrank()
    {
        if ( this.enough_money>=this.cost )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.enough_money = 0 ;
                System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
            }
        }
        else if( ( this.enough_money>0 )&&( this.enough_money<this.cost ) )
        {
            System.out.println( this.enough_money+" cents received. Please insert more coins." ) ;
        } 
        else if( this.enough_money==0 )
        {
            System.out.println( "Please insert "+this.cost+" cents." ) ;
        }
    }
}
