/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

/**
 *
 * @author srinivsi
 */
public class CheckString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    String c="asg";
        if(checknoofchar(c))
    {
        System.out.println("not string");
    }
    else
    {
    System.out.println("string only");
    }
    }     

  public static boolean checknoofchar(String s)
    {
        
        for(int i=0;i<s.length();i++)
        {
        if (!Character.isLetter(s.charAt(i)))
        {
        return true;
        } 
        
        }
    return false;
       
    }
}
