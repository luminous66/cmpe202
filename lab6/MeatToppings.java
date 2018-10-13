public class MeatToppings extends Leaf
{
    
    public MeatToppings( String d )
    {
        super(d) ;
    }

    public MeatToppings ( String d, Double p )
    {
        super(d,p);
    }
    
    public void printDescription() {
        System.out.println( "   ->| " + description + " "  ) ;
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