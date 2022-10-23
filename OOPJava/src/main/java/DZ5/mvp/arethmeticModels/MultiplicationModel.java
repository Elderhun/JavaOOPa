package DZ5.mvp.arethmeticModels;

public final class MultiplicationModel extends Arethmetic {
    @Override
    public void setFirst(int first) {
        super.setFirst(first);
    }

    @Override
    public void setSecond(int second) {
        super.setSecond(second);
    }

    @Override
    public int getActionResult() {
        return first * second;
    }


    public static void main(String[] args) {
        MultiplicationModel multiplicationModel = new MultiplicationModel();

        multiplicationModel.setFirst(1);
        multiplicationModel.setSecond(1);
        if (multiplicationModel.getActionResult() != 1) {
            throw new AssertionError("Incorrect test result");
        }

        multiplicationModel.setFirst(2);
        multiplicationModel.setSecond(2);
        if (multiplicationModel.getActionResult() != 4) {
            throw new AssertionError("Incorrect test result");
        }

        multiplicationModel.setFirst(2);
        multiplicationModel.setSecond(3);
        if (multiplicationModel.getActionResult() != 6) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
