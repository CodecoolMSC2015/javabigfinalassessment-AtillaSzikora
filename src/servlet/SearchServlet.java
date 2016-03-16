package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class SearchServlet extends HttpServlet {

    Socket socket;
    ObjectOutputStream oos;
    ObjectInputStream ois;
    List personList;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out = resp.getWriter();
        req.getRequestDispatcher("index.html").include(req, resp);

        String[] skills = req.getParameter("skills").split(",");
        Set skillSet = new HashSet<>(Arrays.asList(skills));
        out.println("\nGiven skills sent to server: " + skillSet);

        socket = new Socket("192.168.150.31", 1234);
        oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(skills);
        ois = new ObjectInputStream(socket.getInputStream());
        try {List personList = (List) ois.readObject();}
        catch (ClassNotFoundException e) {e.printStackTrace();}
        out.print(personList);

        ois.close(); oos.close(); socket.close();
    }
}
