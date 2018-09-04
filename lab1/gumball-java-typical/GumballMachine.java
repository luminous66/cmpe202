
public class GumballMachine
{

    private int num_gumballs;
    private int num_quarters;

    public GumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.num_quarters = 0;
    }

    public void insertQuarter(int coin)
    {
        if ( ( coin == 25 )&&(num_quarters==0) ){
            this.num_quarters ++ ;
        }
        else if ( ( coin == 25 )&&(num_quarters==1) ){
            this.num_quarters ++ ;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.num_quarters==2 )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.num_quarters = 0 ;
    			System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarters." ) ;
    		}
    	}
    	else if( this.num_quarters==1 )
    	{
    		System.out.println( "Please insert another quarter" ) ;
    	} 
    	else 
    	{
    		System.out.println( "Please insert two quarters" ) ;
    	}
    }
}
