  

public class Client {

    public static void runTest()
    {
        Composite theOrder = BuildOrder.getOrder() ;
        PrintStrategy forcustomer=new ReceiptPrintStrategy();
        forcustomer.print(theOrder);
        System.out.println( " -----------------" ) ;
        PrintStrategy forkitchen=new PackingPrintStrategy();
        forkitchen.print(theOrder);
    }
}
 
