package Calculator.Modul;

public class Calculator {
    double result;
    public Calculator() {
    }

    public double sum(double one, double two) {
         result = one + two;
        return result;
    }

    public double minus(double one, double two) {
      result = one - two;
        return result;
    }

    public double umnoz(double one, double two) {
         result = one * two;
        return result;
    }

    public double del(double one, double two) {
         result = one / two;
        return result;
    }

    public double simbolOperation(String simbol, double one, double two) {
        double result = 0;
        switch (simbol) {
            case "+":
                result = sum(one, two);
                break;
            case "-":
                result = minus(one, two);
                break;
            case "*":
                result = umnoz(one, two);
                break;
            case "/":
                result = del(one, two);
                break;
        }
        return result;
    }
}
