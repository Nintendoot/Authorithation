package Authorization.filter;

import Authorization.model.Person;
import Authorization.storage.InMemory;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "AuthorizationServlet")
public class CheckLoginFilter extends HttpFilter {
    final private static InMemory memory = new InMemory();

    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getMethod().equals("POST")) {
            try {
                if (!req.getParameter("login").isEmpty() && !req.getParameter("password").isEmpty()) {
                    Person per=memory.byLogin(req.getParameter("login"));
                    if (per!=null) {
                        if(per.getPassword().equals(req.getParameter("password"))){
                            chain.doFilter(req,res);
                        }else {
                            req.setAttribute("message", "Password doesn't match");
                            getServletContext().getRequestDispatcher("/pagesAuthorization/BadAuthorization.jsp").forward(req, res);
                        }
                    } else {
                        req.setAttribute("message","There is no such user");
                        getServletContext().getRequestDispatcher("/pagesAuthorization/BadAuthorization.jsp" ).forward(req,res);
                    }
                }else{
                    req.setAttribute("message","Not all data is entered");
                    getServletContext().getRequestDispatcher("/pagesAuthorization/BadAuthorization.jsp" ).forward(req,res);
                }

            } catch (NumberFormatException e) {
                req.setAttribute("message","The data entered is not correct");
                getServletContext().getRequestDispatcher("/pagesAuthorization/BadAuthorization.jsp" ).forward(req,res);
            }
        }

    }
}
