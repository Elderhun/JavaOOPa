package DZ5.mvp.arethmeticModels;

public final class SubtractModel extends Arethmetic {
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
        return first - second;
    }

    public static void main(String[] args) {
        SubtractModel subtractModel = new SubtractModel();

        subtractModel.setFirst(1);
        subtractModel.setSecond(1);
        if (subtractModel.getActionResult() != 0) {
            throw new AssertionError("Incorrect test result");
        }

        subtractModel.setFirst(1);
        subtractModel.setSecond(2);
        if (subtractModel.getActionResult() != -1) {
            throw new AssertionError("Incorrect test result");
        }

        subtractModel.setFirst(2);
        subtractModel.setSecond(3);
        if (subtractModel.getActionResult() != -1) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
