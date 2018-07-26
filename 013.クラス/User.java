
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sawadatakuya
 */
public class User extends human{
       public void setcard(ArrayList<Integer>setcard){
           for (int i=0;i<setcard.size();i++){
               myCards.add(setcard.get(i));
           }
       }
       
    
       public int open(){
           int sum=0;
           for(int i=0;i<myCards.size();i++){
               sum=sum+myCards.get(i);
           }
        return sum;
                       
       }
       
       public boolean checksum(){
           int sum=0;
           for(int i=0;i<myCards.size();i++){
               sum=sum+myCards.get(i);
           }
               
                   
        return sum<16;
           
       }
       

 
    
    
}
