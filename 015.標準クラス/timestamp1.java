
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sawadatakuya
 */
public class timestamp1 {
    public static void main(String args[]){
    Date d=new Date(1478221200000L);
    System.out.print(d);
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.print(sdf.format(d));
}    
}
