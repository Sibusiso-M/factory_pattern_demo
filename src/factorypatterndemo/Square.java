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
