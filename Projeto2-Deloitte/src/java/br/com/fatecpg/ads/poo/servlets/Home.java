/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Felipe
 */
@WebServlet(name = "Home", urlPatterns = {"/home"})
public class Home extends HttpServlet {

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
            out.println("<title>Servlet Home</title>");    
            out.println("<meta charset=\"UTF-8\">");
            out.println("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">" +
                "<div class=\"collapse navbar-collapse\" id=\"navbarNav\">" +
                    "<ul class=\"navbar-nav\">" +
                    "<li class=\"nav-item active\"><a class=\"nav-link\" href=\"/src/home\">Home </a></li>" +
                    "<li class=\"nav-item\"><a class=\"nav-link\" href=\"/src/juros-simples\">Juros simples</a></li>"+
                    "<li class=\"nav-item\"><a class=\"nav-link\" href=\"/src/juros-composto\">Juros composto</a></li>" +
                "</ul></div></nav>");
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Calculadora financeira</h3>");
            out.println("<style>" +
                            "img.displayed {" +
                            "display: block;" +
                            "margin-left: auto;" +
                            "margin-right: auto }" +
                            "p.paragrafo{" +
                            "\"margin-left: auto;\"" +
"                            \"margin-right: auto\"}" +
                        "</style>");
            out.println("<div class=\"container-fluid\">" +
                    "<div class=\"row\">" +
                        "<div class=\"col-md-6\">" +
                            "<a href='/src/juros-simples'>" +
                                "<img class=\"displayed\" src=\"https://goo.gl/UhBoC6\" alt=\"Juros Simples\" height=\"230\" width=\"230\"><p></p>" + 
                            "</a>" +
                        "</div>" +
                        "<div class=\"col-md-6\">" + 
                            "<a href='/src/juros-composto'>" +
                            "<img class=\"displayed\" src=\"https://goo.gl/eUtm64\" alt=\"Juros composto\" height=\250\" width=\"250\"><p></p>" +
                            "</a>" +
                        "</div>" +
                        "</div>");
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
