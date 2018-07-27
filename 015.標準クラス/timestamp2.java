
import java.text.ParseException;
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
public class timestamp2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date day1 = sdf.parse("2017/10/11 12:31:50");
        Date day2 = sdf.parse("2017/12/12 12:12:12");
        
        long day11= day1.getTime();
        long day22=day2.getTime();
        
        long dayd=(day22-day11);
        
        System.out.print(dayd);
        }   
    }