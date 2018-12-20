package node;

public interface MathProcessing {
    String SEPARATER = " ";
    String getKeyword(); // add
    char getSymbol();
    double doCalculation(double leftVal, double rightVal);
}
