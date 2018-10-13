  

public class BuildOrder {

    public static Composite getOrder()
    {
        Composite order = new Composite( "Order Number : 45" ) ;
        
        // order little bacon burger
        ChooseBurger chooseBurger = new ChooseBurger( "LBB",5.59 ,"BACON") ;
        // all toppings free, toppings on the top bun
        TopToppings t1 = new TopToppings( "LETTUCE" ) ;
        TopToppings t2 = new TopToppings( "TOMATO" ) ;
        // all toppings free, toppings on the meat
        MeatToppings t3 = new MeatToppings( "G ONION" ) ;
        
        // Setup little bacon burger components
        chooseBurger.addChild( t1 ) ;
        chooseBurger.addChild( t2 ) ;
        chooseBurger.addChild( t3 ) ;
        // Add  chooseBurger to the ORder
        order.addChild( chooseBurger );
        order.addChild(new Leaf("LTL CAJ", 2.79 ));

        for (Component obj  : order.components)
        {
            order.price += obj.getPrice();
        }
        return order ;
    }

}


/*

Five Guys Burger Menu:
http://www.fiveguys.com/

*/