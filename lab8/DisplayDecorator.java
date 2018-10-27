/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public abstract class DisplayDecorator implements IDisplayComponent, IKeyEventHandler
{
	protected IKeyEventHandler nextHandler ;
	protected CreditCardComp cc ;

	public DisplayDecorator(CreditCardComp component){
		this.cc=component;
	}

	public String display() {
		return "";
	}	

	public void setNext( IKeyEventHandler next) {
    	cc.setNext(next);
    }

	public void key(String ch, int cnt) {
		cc.key(ch,cnt);
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return;
	}
}