/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public abstract class CreditCardComp implements IDisplayComponent, IKeyEventHandler
{

	protected IKeyEventHandler nextHandler ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		return ""; // do nothing
	}	

	public String getNum() {
		return ""; // do nothing
    }

	public void key(String ch, int cnt) {
	}	
	public void addSubComponent( IDisplayComponent c ) {
		return;
	}

}