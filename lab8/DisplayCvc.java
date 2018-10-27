/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class DisplayCvc extends DisplayDecorator
{
	public DisplayCvc(CreditCardComp component){
		super(component);
	}
	public String display() {
		String cvc=cc.getNum();
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else
			return "[" + cvc + "]" + "  " ;
	}

}