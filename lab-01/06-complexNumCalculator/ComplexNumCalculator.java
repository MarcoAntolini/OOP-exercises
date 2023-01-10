class ComplexNumCalculator {

    int nOpDone;
    ComplexNum lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = new ComplexNum();
        this.lastRes.build(0, 0);
    }

    void add(ComplexNum num1, ComplexNum num2) {
        this.lastRes.build(num1.re, num1.im);
        this.lastRes.add(num2);
        this.nOpDone++;
    }

    void sub(ComplexNum num1, ComplexNum num2) {
        this.lastRes.build(num1.re, num1.im);
        this.lastRes.re -= num2.re;
        this.lastRes.im -= num2.im;
        this.nOpDone++;
    }

    void mul(ComplexNum num1, ComplexNum num2) {
        this.lastRes.build(num1.re, num1.im);
        double re = this.lastRes.re;
        double im = this.lastRes.im;
        this.lastRes.re = re * num2.re - im * num2.im;
        this.lastRes.im = re * num2.im + im * num2.re;
        this.nOpDone++;
    }

    void div(ComplexNum num1, ComplexNum num2) {
        this.lastRes.build(num1.re, num1.im);
        double re = this.lastRes.re;
        double im = this.lastRes.im;
        this.lastRes.re = (re * num2.re + im * num2.im) / (num2.re * num2.re + num2.im * num2.im);
        this.lastRes.im = (im * num2.re - re * num2.im) / (num2.re * num2.re + num2.im * num2.im);
        this.nOpDone++;
    }

}