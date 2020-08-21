/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatterndemo;

/**
 *
 * @author Student
 */
public class Circle implements Shape{

    @Override
    public void draw() 
    {
        System.out.println("Inside Circle draw() method");
    }

    @Override
    public boolean equalsIgnoreCase(String shapeParam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String parameterfomule() {
        return "pi(radius)*(radius)";
    }


    
}
