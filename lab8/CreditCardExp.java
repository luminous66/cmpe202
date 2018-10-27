/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp extends CreditCardComp
{

	private String date="";
	public String getNum() {
    	return date ;
    }
	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ){
			if(ch.equals("X"))
				date=date.substring(0,date.length()-1);
			else
				date += ch ;
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	


}