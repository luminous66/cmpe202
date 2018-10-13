  

public interface Component {

     void printDescription() ;
     void printDescription(boolean isprice) ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     Double getPrice();
     String getDescription();
     String getInside();

}
 
