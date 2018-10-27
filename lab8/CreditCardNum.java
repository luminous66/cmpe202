/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum extends CreditCardComp
{
	private String number = "" ;

    public String getNum() {
    	return number ;
    }
	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			if(ch.equals("X")){
				if(number.length()>1 )
					number=number.substring(0,number.length()-1);
				else if(number.length()<=1 )
					number="";
			}
			else
				number += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

}