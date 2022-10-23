package DZ5.mvp.arethmeticModels;

public final class SumModel extends Arethmetic {


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
        return first + second;
    }

    public static void main(String[] args) {
        SumModel sumModel = new SumModel();

        sumModel.setFirst(1);
        sumModel.setSecond(1);
        if (sumModel.getActionResult() != 2) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(1);
        sumModel.setSecond(2);
        if (sumModel.getActionResult() != 3) {
            throw new AssertionError("Incorrect test result");
        }

        sumModel.setFirst(2);
        sumModel.setSecond(3);
        if (sumModel.getActionResult() != 5) {
            throw new AssertionError("Incorrect test result");
        }
    }
}
