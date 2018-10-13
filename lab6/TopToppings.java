public class TopToppings extends Leaf
{
    
    public TopToppings( String d )
    {
        super(d) ;
    }

    public TopToppings ( String d, Double p )
    {
        super(d,p);
    }

    
    public void printDescription() {
        System.out.println( "     " + description + " "  ) ;
    }

    public void addChild(Component c) {
        // no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public Component getChild(int i) {
        // no implementation
        return null ;
    }
    
}