/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/juros-simples"})
public class JurosSimples extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JurosSimples</title>");
            out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">" +
                "<div class=\"collapse navbar-collapse\" id=\"navbarNav\">" +
                    "<ul class=\"navbar-nav\">" +
                    "<li class=\"nav-item active\"><a class=\"nav-link\" href=\"/src/home\">Home </a></li>" +
                    "<li class=\"nav-item\"><a class=\"nav-link\" href=\"/src/juros-simples\">Juros simples</a></li>"+
                    "<li class=\"nav-item\"><a class=\"nav-link\" href=\"/src/juros-composto\">Juros composto</a></li>" +
                "</ul></div></nav>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<style>" +
                ".container {\ndisplay: flex;" +
                   "\nflex-direction: column;" +
                    "\njustify-content: center;" +
                    "\nalign-items: center;" +
                    "\n}" +
                    "</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h3>Aplicação Financeira - Juros Simples</h3>");
            out.println("<form name='formulario'>");
            out.println("<table>");
            out.println("<tr><td>Capital:</td><td><input min='0' step='0.01' name='c' required/></td></tr>");
            out.println("<tr><td>Taxa de juros mensal (%):</td><td><input type='number' min='0' step='any' name='i' required/></td></tr>");
            out.println("<tr><td>Período (meses):</td><td><input type='number' step='1' min='0' name='n' required'/></td></tr>");
            out.println("<tr><td colspan='2' align='center'><input type='submit' value='Calcular'/></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("<hr/>");
            
            double c = Double.parseDouble(request.getParameter("c"));
            double i = Double.parseDouble(request.getParameter("i"))/100.0+1;
            int n = Integer.parseInt(request.getParameter("n"));
            
            NumberFormat m = NumberFormat.getCurrencyInstance();
            String montante = "";
            
            for (int count=1;count<=n;count++)
            {
                montante = m.format(c*Math.pow((double)i, (double)count));
            }
            
            out.println("<br><h4>Valor final: R"+montante+"</h4>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
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
