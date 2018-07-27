
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
public class Class1310 {
    public static void main (String[]args){
        Date now=new Date();
        SimpleDateFormat start=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println("処理開始時間は"+start.format(now));
        String name="澤田拓也";
        System.out.println(name.indexOf("也"));
        SimpleDateFormat end=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println("処理終了時間は"+end.format(now));
        
                
        
    }
    
}
