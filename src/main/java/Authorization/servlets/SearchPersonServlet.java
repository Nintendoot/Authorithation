package Authorization.servlets;

import Authorization.model.Person;
import Authorization.storage.InMemory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/search")
public class SearchPersonServlet extends HttpServlet {
  final   private static InMemory memory=new InMemory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String personLogin=req.getParameter("login");
        Person per=memory.byLogin(personLogin);
            req.setAttribute("per",per);
            getServletContext().getRequestDispatcher("/pagesAuthorization/SearchPerson.jsp").forward(req,res);


    }
}
