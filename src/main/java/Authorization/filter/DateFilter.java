package Authorization.filter;

import Authorization.model.Person;
import Authorization.storage.InMemoryStorage;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "RegistrationServlet")
public class DateFilter extends HttpFilter {
final protected static InMemoryStorage memory=new InMemoryStorage();
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getMethod().equals("POST")) {
            try {
                if (!req.getParameter("name").isEmpty() && !req.getParameter("surname").isEmpty() && !req.getParameter("age").isEmpty()) {

                    if (!req.getParameter("login").isEmpty() && req.getParameter("login").length() > 4) {
                        if (!req.getParameter("login").isEmpty() && !req.getParameter("password").isEmpty()) {
                            Person person=memory.byLogin(req.getParameter("login"));
                            if(person==null){
                                chain.doFilter(req, res);
                            }else {
                                req.setAttribute("error","A user with this username already exists");
                                getServletContext().getRequestDispatcher("/pagesAuthorization/BadRegistration.jsp").forward(req,res);
                            }

                        } else {
                            req.setAttribute("error","Not login and password are entered");
                            getServletContext().getRequestDispatcher("/pagesAuthorization/BadRegistration.jsp").forward(req,res);
                        }
                    } else {
                        req.setAttribute("error","The login must be longer than 4 characters");
                        getServletContext().getRequestDispatcher("/pagesAuthorization/BadRegistration.jsp").forward(req,res);
                    }
                } else {
                    req.setAttribute("error","Not all data is entered");
                    getServletContext().getRequestDispatcher("/pagesAuthorization/BadRegistration.jsp").forward(req,res);
                }
            } catch (NumberFormatException e) {
                req.setAttribute("error","The data entered is not correct");
                getServletContext().getRequestDispatcher("/pagesAuthorization/BadRegistration.jsp").forward(req,res);
            }

        }
    }
}

