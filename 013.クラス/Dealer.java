
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 public  class Dealer extends human {

    
    ArrayList<Integer>cards=new ArrayList<>();
    
    
    public void allcards(){
        for(int n=1;n<=4;n++){
            for(int i=1;i<=13;i++){
                cards.add(i);
                
            }
                
        }
    }

       public ArrayList<Integer>deal(){
          ArrayList<Integer>data1=new ArrayList<>();
          Random rand=new Random();
          int set1=rand.nextInt(cards.size());
          int set11=rand.nextInt(cards.size());
          data1.add(cards.get(set1));
          data1.add(cards.get(set11));
          return data1;
       }


       public  ArrayList<Integer>hit(){
           ArrayList<Integer>data2=new ArrayList<>();
           Random rand=new Random();
           Integer set2=rand.nextInt(cards.size());
           data2.add(cards.get(set2));
           return data2;
      
       }
       


    @Override
       public void setcard(ArrayList<Integer>a){
           for (int i=0;i<a.size();i++){
               myCards.add(a.get(i));
           }
          
       }
       
    
    @Override
       public int open(){
           int sum=0;
        for(int i=0;i<myCards.size();i++){
            if(myCards.get(i)>10){
                myCards.set(i,10);    
            }
           
               sum=sum+myCards.get(i);
        }
           
        return sum;
                       
       }
       
    @Override
       public boolean checksum(){
           int sum=0;
           for(int i=0;i<myCards.size();i++){
                if(myCards.get(i)>10){
                myCards.set(i,10);    
                }
               
               sum=sum+myCards.get(i);
           }
               
                   
        return sum<16;
           
       }
   
}
    

