
package factorypatterndemo;

/**
 *
 * @author Student
 */
public class Rectangle implements Shape {

    @Override
    public void draw() 
    {
        System.out.println("Inside Rectangle :: draw() method");
    }

    @Override
    public boolean equalsIgnoreCase(String shapeParam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parameterfomule() 
    {
     return " Length * Width";
    }
    
}
