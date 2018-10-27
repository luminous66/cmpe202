/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC  extends CreditCardComp
{

	private String cvc = "" ;
	public String getNum() {
    	return cvc ;
    }	

	public void key(String ch, int cnt) {
		if ( cnt >= 21 ) {
			if ( cnt >= 21 && cnt <= 23 ){
				if(ch.equals("X") && cvc.length()>1 ){
					cvc=cvc.substring(0,cvc.length()-1);
				}
				else if(ch.equals("X") && cvc.length()<=1 ){
					cvc="";
				}
				else
					cvc += ch ;
			}
			else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
		}
		
	}	


}