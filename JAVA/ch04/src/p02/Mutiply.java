package p02;

public class Mutiply implements ArithmathicOperator {
    @Override
    public int operate(int x, int y) {
        return x * y;
    }

    @Override
    public long operate(long x, long y) {
        return x * y;
    }

    @Override
    public double operate(double x, double y) {
        return x * y;
    }
}
