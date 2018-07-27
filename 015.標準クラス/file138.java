
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sawadatakuya
 */
public class file138 {
    public static void main(String[]args) throws IOException{
        File fp=new File("test-text");
        FileWriter fw =new FileWriter(fp);
        fw.write("澤田拓也 21歳　男");
        fw.close();
        
        
        FileReader fr=new FileReader(fp);
        BufferedReader br=new BufferedReader(fr);
        System.out.print(br.readLine());
        fr.close();
        
    }
    
}
