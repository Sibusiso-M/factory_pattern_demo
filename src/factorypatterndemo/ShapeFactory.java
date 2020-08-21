
package factorypatterndemo;

/**
 *
 * @author Student
 */
public class ShapeFactory {
    
    //get object of type shape 
    public Shape getShape(String shapeTypeParam) 
    {
        if (shapeTypeParam == null) {
            return null;
        }
        
        if (shapeTypeParam.equalsIgnoreCase("CIRCLE"))
        {
         return new Circle();
        }else if (shapeTypeParam.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if (shapeTypeParam.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        return null;
    }

}
