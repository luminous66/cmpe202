/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardComp num;
    private CreditCardComp exp;
    private CreditCardComp cvc;
    private DisplayDecorator numdisplay;
    private DisplayDecorator expdisplay;
    private DisplayDecorator cvcdisplay;

    private int count;

    String output;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();

        numdisplay = new DisplayNum(num);
        expdisplay = new DisplayExp(exp); 
        cvcdisplay = new DisplayCvc(cvc);   
        screen.addSubComponent( numdisplay );
        screen.addSubComponent( expdisplay );
        screen.addSubComponent( cvcdisplay );

        count = 0;

    }

    public String display() {
        output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.equals("X")){
            count -= 1;
            screen.key(ch, count);
        }
        else{
            if(count<24)
                count++;
            screen.key(ch, count);
        }
    }

}

