/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.AddQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.GermanyFootballTeam;

/**
 *
 * @author nliesmanto
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/addPlayer"})
public class AddServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
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
        doPost (request, response);
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
            
            //get the data
            int playerJerseyNumber = Integer.parseInt(request.getParameter("playerJerseyNumber"));
            String playerName = request.getParameter("playerName");
            int playerAge = Integer.parseInt(request.getParameter("playerAge"));
            String playerPOB = request.getParameter("playerPOB");
            String playerPosition = request.getParameter("playerPosition");
            int playerCaps = Integer.parseInt(request.getParameter("playerCaps"));
            int playerGoals = Integer.parseInt(request.getParameter("playerGoals"));
            String playerDomesticClub = request.getParameter("playerDomesticClub");
            
            //set up player object
            GermanyFootballTeam germanyfootballteam = new GermanyFootballTeam();
            germanyfootballteam.setPlayerJerseyNumber(playerJerseyNumber);
            germanyfootballteam.setPlayerName(playerName);
            germanyfootballteam.setPlayerAge(playerAge);
            germanyfootballteam.setPlayerPOB(playerPOB);
            germanyfootballteam.setPlayerPosition(playerPosition);
            germanyfootballteam.setPlayerCaps(playerCaps);
            germanyfootballteam.setPlayerGoals(playerGoals);
            germanyfootballteam.setPlayerDomesticClub(playerDomesticClub);
            
            //set up addQuery object
            AddQuery aq = new AddQuery();
            
            //pass player to addQuery to add to the db
            aq.doAdd(germanyfootballteam);
            
            //pass execution control to the ReadServlet
            String url = "/read";
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(url);
            dispatcher.forward(request, response);
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
