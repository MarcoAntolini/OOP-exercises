class Recognizer {

    int nextExpectedInt = 1;

    boolean check1(int i) {
        if (i == 1) {
            nextExpectedInt = 2;
            return true;
        }
        return false;
    }

    boolean check2(int i) {
        if (i == 2) {
            nextExpectedInt = 3;
            return true;
        }
        return false;
    }

    boolean check3(int i) {
        if (i == 3) {
            nextExpectedInt = 4;
            return true;
        }
        return false;
    }

    boolean check4(int i) {
        if (i == 4) {
            nextExpectedInt = 1;
            return true;
        }
        return false;
    }

    int nextExpectedInt() {
        return nextExpectedInt;
    }

    void reset() {
        nextExpectedInt = 1;
    }

}