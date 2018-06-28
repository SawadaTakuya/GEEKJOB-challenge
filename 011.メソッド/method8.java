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
public class method8 extends HttpServlet {
    
     String[] user_profile(String moji){
    
    
    
        String[]atai1={"1","技育太郎","東京","男","プログラマー"};
        String[]atai2={"2","技育花子","北海道","女","システムエンジニア"};
        String[]atai3={"3","技育三郎","大阪","男","Webエンジニア"};
        
         int ii = Integer.parseInt(atai1[0]);
         int oo = Integer.parseInt(atai2[0]);
         int pp = Integer.parseInt(atai3[0]);
         
         int jj = Integer.parseInt(moji);
        
         if(jj==ii){
             return atai1;
         }else if(jj==oo){
             return atai2;
         }else if(jj==pp){
             return atai3;
         }else{
             return null;
         }
       
    }
        

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) { 
        
            
          for(int i=0;i<user_profile("3").length;i++){
          
                 out.print(user_profile("3")[i]);
          }
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
