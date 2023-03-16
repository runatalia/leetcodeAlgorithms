package complexNumbers;

public interface ComplexNumbers {
    ComplexNumbers sum(ComplexNumbersImpl complexNumbers);

    ComplexNumbers minus(ComplexNumbersImpl complexNumbers);

    ComplexNumbers multiply(ComplexNumbersImpl complexNumbers);

    double abs();
}
