package Authorization.servlets;

import Authorization.model.Person;
import Authorization.model.Rule;
import Authorization.storage.InMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/au", name = "AuthorizationServlet")
public class AuthorizationServlet extends HttpServlet {
    final private static InMemoryStorage memory = new InMemoryStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pagesAuthorization/Authorization.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Person person = memory.byLogin(login);

        if (person != null){
            if (person.getPassword().equals(password)&&person.getRule()==null){
                req.getSession().setAttribute("user", person);
                req.getSession().setAttribute("isUser", true);
                res.sendRedirect("/home");

            }else {
                req.getSession().setAttribute("isAdmin", true);
                res.sendRedirect("/home");
                  }
            }

    }
}
