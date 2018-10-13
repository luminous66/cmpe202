 

import java.text.DecimalFormat;


public class Leaf implements Component {

    protected String description ;
    protected Double price ;
    protected String inside=null ;

    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public Leaf ( String d ) 
    {
        description = d ;
        price = 0.0 ;
    }
    
    public void printDescription() {
        System.out.println( "1 " + description  ) ;
    }
    
    public void printDescription(boolean isprice) {
        if(isprice){
            
        }
        else System.out.println( "1 " + description  ) ;
    }

    public void printPrice(){
        System.out.println( price );
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
    public Double getPrice(){
	   return price;
    }
    public String getDescription(){
       return description;
    }
    public String getInside(){
        return inside;
    }
}
 
