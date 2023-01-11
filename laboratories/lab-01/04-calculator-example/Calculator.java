class Calculator {

    int nOpDone;
    double lastRes;

    public void build() {
        nOpDone = 0;
        lastRes = 0;
    }

    public double add(double a, double b) {
        nOpDone++;
        lastRes = a + b;
        return lastRes;
    }

    public double sub(double a, double b) {
        nOpDone++;
        lastRes = a - b;
        return lastRes;
    }

    public double mul(double a, double b) {
        nOpDone++;
        lastRes = a * b;
        return lastRes;
    }

    public double div(double a, double b) {
        nOpDone++;
        lastRes = a / b;
        return lastRes;
    }
}