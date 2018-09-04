
public class GumballMachine
{

    private int num_gumballs;
    private int enough_money;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.enough_money = 0;
    }

    public void insertQuarter(int coin)
    {
        if (enough_money<50) {
            this.enough_money += coin ;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.enough_money>=50 )
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
    	else if( ( this.enough_money>0 )&&( this.enough_money<50 ) )
    	{
    		System.out.println( this.enough_money+" cents received. Please insert more coins." ) ;
    	} 
    	else if( this.enough_money==0 )
    	{
    		System.out.println( "Please insert 50 cents." ) ;
    	}
    }
}
