package FourUnit.Power;

public class Pwr {
    double b;
    int e;
    double val;

    /**
     * This is a constructor which takes two parameters:
     * base and exp.
     */
    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;

        val = 1;
        if (exp == 0) return;

        for ( ; exp > 0; exp--) {
            val = val * base;
        }
    }

    // This method is geter. It gets meaning of "val"
    double getPwr() {
        return val;
    }
}
