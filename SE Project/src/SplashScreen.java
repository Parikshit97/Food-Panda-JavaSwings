

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author parikshitnarang
 */
public class SplashScreen {
    
    public static void main(String[] args){
        
        LoginSplash obj=new LoginSplash();
        obj.setVisible(true);
        
        try{
            for(int i=0 ; i<=100 ; i++){
                Thread.sleep(40);
                  LoginSplash.jLabel2.setText(Integer.toString(i)+"%");
                
            }
        }
        catch(Exception e){
            
        }
        new Welcome().setVisible(true);
    }
    
}
