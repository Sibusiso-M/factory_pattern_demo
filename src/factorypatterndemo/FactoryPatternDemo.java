
package factorypatterndemo;

/**
 *
 * @author Student
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        
        //get an object of circle and call its draw method.
        Shape shape1 = shapeFactoryObj.getShape("Circle");
        //call draw method of Circle 
        shape1.draw();
        
        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactoryObj.getShape("Rectangle");
        shape2.draw();
        
        Shape shape3 = shapeFactoryObj.getShape("Square");
        shape3.draw();
        System.out.println("Parameter for Circle :");
        System.out.println(shape1.parameterfomule());
        
    }
    
}
