/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author sawadatakuya
 */
public class BlackJack1 extends HttpServlet {
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    
    
 
 
    


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
    User User1=new User(); 
    Dealer Dealer1=new Dealer();
    Dealer1.allcards();
    Dealer1.setcard(Dealer1.deal());
    User1.setcard(Dealer1.deal());
    out.print("始めディーラーは"+Dealer1.open());
    out.print("始めユーザーは"+User1.open());
    
    while(Dealer1.checksum()){
        Dealer1.setcard(Dealer1.hit());out.print("ディーラーはヒットして"+Dealer1.open());
    }
    
    
    while(User1.checksum()){
     User1.setcard(Dealer1.hit());out.print("ユーザーはヒットして"+User1.open());
    }
    
    
    
    
   
    
 
    
    
    
    if(Dealer1.open()==User1.open()){
        out.print("引き分け");
    }
    else if(Dealer1.open()>21&&User1.open()>21){
        out.print("引き分け");
            }
    else if(Dealer1.open()>21&&21>User1.open()){
        out.print("あなたの勝ち");
            }
    else if(Dealer1.open()<21&&User1.open()>21){
        out.print("ディーラーの勝ち");
            }
    else if(Dealer1.open()>User1.open()){
        out.print("ディーラーの勝ち");
            }
    else{out.print("あなたの勝ち");
        }
    
    
    
        
    
    
    
    

   
    
    
   }
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
        


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
