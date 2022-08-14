import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calc = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {

        int result = calc.calculatePolishNotation("2 2     + ");
        assertEquals(result,4,"Сложение работает неверно");

        result = calc.calculatePolishNotation("2 -2     + ");
        assertEquals(result,0,"Сложение работает неверно с отрицательными числами");

        result = calc.calculatePolishNotation("5 4     - ");
        assertEquals(result,1,"Вычитание работает неверно");

        result = calc.calculatePolishNotation("-5 4     - ");
        assertEquals(result,-9,"Вычитание работает неверно с отрицательными числами");

        result = calc.calculatePolishNotation("4 2     * ");
        assertEquals(result,8,"Умножение работает не верно");

        result = calc.calculatePolishNotation("4 -1     * ");
        assertEquals(result,-4,"Некорректная работа с отрицательными числами при умножении");

        result = calc.calculatePolishNotation("4 5 2 2     + - *");
        assertEquals(result,4, "Некорректная работа с последовательностью");

        result = calc.calculatePolishNotation("-4 5 2 2     + - *");
        assertEquals(result,-4, "Некорректная работа отрицательными числами в последовательности");
    }
}