package DZ5.mvp.arethmeticModels;

public final class SeparationModel extends Arethmetic {

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
        return first / second;
    }

    public static void main(String[] args) {
        SeparationModel separationModel = new SeparationModel();

        separationModel.setFirst(1);
        separationModel.setSecond(1);
        if (separationModel.getActionResult() != 1) {
            throw new AssertionError("Incorrect test result");
        }

        separationModel.setFirst(2);
        separationModel.setSecond(2);
        if (separationModel.getActionResult() != 1) {
            throw new AssertionError("Incorrect test result");
        }

        separationModel.setFirst(3);
        separationModel.setSecond(6);
        if (separationModel.getActionResult() != 0) {
            throw new AssertionError("Incorrect test result");
        }
    }

}
