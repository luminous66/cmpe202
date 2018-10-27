/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class DisplayNum extends DisplayDecorator
{

	public DisplayNum(CreditCardComp component){
		super(component);
	}
	public String display() {
		String num=cc.getNum();
		if ( num.equals("")  )
			return "[4444 4444 4444 4444]" + "  " ;
		else if(num.length()<=4){
			return "[" + num + "]" + "  " ;
		}
		else if(num.length()<=8){
			return "[" + num.substring(0,4) + "  " + num.substring(4) + "]" + "  " ;
		}
		else if(num.length()<=12){
			return "[" + num.substring(0,4) + "  " + num.substring(4,8) +"  " + num.substring(8) +  "]" + "  " ;
		}
		else
			return "[" + num.substring(0,4) + "  " + num.substring(4,8) +"  " + num.substring(8,12) + "  " + num.substring(12) + "]" + "  " ;
	}
}