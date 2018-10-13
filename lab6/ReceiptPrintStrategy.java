   
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ReceiptPrintStrategy implements PrintStrategy {

        public void print(Composite order) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( " FIVE GUYS" ) ;
        System.out.println( " " + order.description  ) ;
        
        for (Component obj  : order.components)
        {
            if(obj.getPrice()!=0.0){
                boolean isprice = true;
                DecimalFormat fomt = new DecimalFormat("0.00");
                System.out.println( "1  " + obj.getDescription() + " " + fomt.format(obj.getPrice()) ) ;
                if(obj.getInside()!=null){
                    System.out.println( "  {{{{" + obj.getInside() + "}}}} "  ) ;
                }
                obj.printDescription(isprice);
            }
            else   obj.printDescription();
        }
        System.out.println( " Sub. Total:    $"+order.price ) ;
        
    }
    
}
 
