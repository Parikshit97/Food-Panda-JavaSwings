/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parikshitnarang
 */
public class DelayClass {
    public DelayClass(HungryPanda obj)
    {
        obj.setVisible(true);
         try{
             Thread.sleep(80);
            for(int i=0 ; i<=100 ; i++){
                Thread.sleep(40);
                HungryPanda.jLabel2.setText(Integer.toString(i)+"%");
                 
                
            }
        }
        catch(Exception e){
            
        }
            
             obj.setVisible(true);
             
             
             
        
    }
    
}
