package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SearchServlet extends HttpServlet {

    String[] skills;
    static Set skillSet;
    String searchType;
    static Set personSet;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("index.html").include(req, resp);

        skills = req.getParameter("skills").split(",");
        skillSet = new HashSet<>(Arrays.asList(skills));
        searchType = req.getParameter("radio");
        out.println("\n(" + searchType + ") Given skills are: " + skillSet + "\n");

        new SocketClient();
        out.print(personSet);

        out.close(); }
}
