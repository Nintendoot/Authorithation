package Authorization.servlets;

import Authorization.model.Person;
import Authorization.storage.InMemory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/au", name="AuthorizationServlet")
public class AuthorizationServlet extends HttpServlet {
    final private static InMemory memory=new InMemory();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pagesAuthorization/Authorization.jsp").forward(req,res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
String login=req.getParameter("login");
String password=req.getParameter("password");
Person person=memory.byLogin(login);
        req.getSession().setAttribute("person",person);
        getServletContext().getRequestDispatcher("/pagesAuthorization/index.jsp" ).forward(req,res);


    }
}
