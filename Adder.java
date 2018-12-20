package node;

public class Adder implements MathProcessing {

    private double leftVal;
    private double rightVal;

    public Adder(){}

    public Adder(double leftVal, double rightVal){

        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    @Override
    public String getKeyword() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return leftVal + rightVal;
    }
}
