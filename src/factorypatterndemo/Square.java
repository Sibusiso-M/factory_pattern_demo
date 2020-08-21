
package factorypatterndemo;

/**
 *
 * @author Student
 */
public class Square implements Shape  {

    @Override
    public void draw() 
    {
      System.out.println("Inside Square :: draw() method");
    }

    @Override
    public boolean equalsIgnoreCase(String shapeParam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parameterfomule()
    {
        return " 4 * Length ";
    }
    
}
