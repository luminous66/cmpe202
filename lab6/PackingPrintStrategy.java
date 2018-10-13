   

import java.util.ArrayList;

public class PackingPrintStrategy implements PrintStrategy {

    
    public void print(Composite order) {
        System.out.println( order.description );
        System.out.println( " FIVE GUYS" ) ;
        System.out.println( " Sandwich #1" ) ;
        for (Component obj  : order.components)
        {
            obj.printDescription();
            if(obj.getInside()!=null){
                    System.out.println( "  {{{{" + obj.getInside() + "}}}} "  ) ;
                }
        }
        
    }
}
 
