/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class DisplayExp extends DisplayDecorator
{
	public DisplayExp(CreditCardComp component){
		super(component);
	}
	public String display() {
		String date=cc.getNum();
		if ( date.equals("")  )
			return "[MM/YY]" + "  " ;
		else if(date.length()<=2){
			return "[" + date + "]" + "  " ;
		}
		else
			return "[" + date.substring(0,2) + "/" + date.substring(2) + "]" + "  " ;
	}
}