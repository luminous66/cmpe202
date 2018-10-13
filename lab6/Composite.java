   
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    protected String inside ;
    protected Double price ;


    public Composite ( String d, Double p,String i )
    {
        description = d ;
        price = p ;
        inside=i;
    }
    
    public Composite ( String d, Double p )
    {
        description = d ;
        price = p ;
        inside=null;
    }
    
    public Composite ( String d ) 
    {
        description = d ;
        price = 0.0 ;
        inside=null;
    }



    public void printDescription() {
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    
    public void printDescription(boolean isprice) {
        if(isprice){
            
        }
        else System.out.println( "1 " + description  ) ;
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
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
 
