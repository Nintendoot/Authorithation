package Calculator.Filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(servletNames = "CalculatorServlet")
public class DateFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        if (req.getMethod().equals("POST")) {
            try {
                if (!req.getParameter("FirstNumber").isEmpty() && !req.getParameter("SecondNumber").isEmpty()) {
                    chain.doFilter(req, res);
                } else {
                    getServletContext().getRequestDispatcher("/pagesCalculator/Calculator.jsp").forward(req, res);
                }
            } catch (NumberFormatException e) {
                res.sendRedirect("/pagesCalculator/Calculator.jsp");
            }
        }else{
            res.sendRedirect("/pagesCalculator/Calculator.jsp");
        }


    }
}
