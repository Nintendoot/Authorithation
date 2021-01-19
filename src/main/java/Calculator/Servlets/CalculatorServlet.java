package Calculator.Servlets;

import Calculator.Modul.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/calc", name = "CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    double result;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pagesCalculator/Calculator.jsp").forward(req, res);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String oneNumber = req.getParameter("FirstNumber");

        String twoNumber = req.getParameter("SecondNumber");
        String simbol = req.getParameter("simbol");

        Calculator calc = new Calculator();
        result = calc.simbolOperation(simbol, Double.parseDouble(oneNumber), Double.parseDouble(twoNumber));
        req.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/pagesCalculator/Calculator.jsp").forward(req, res);

    }
}
