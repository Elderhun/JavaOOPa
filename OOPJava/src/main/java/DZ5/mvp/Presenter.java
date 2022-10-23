package DZ5.mvp;

import DZ5.mvp.arethmeticModels.*;

import java.util.ArrayList;
import java.util.List;

public class Presenter {

    private final Arethmetic model;

    private final View view;

    public Presenter(Arethmetic model, View view) {
        this.model = model;
        this.view = view;
    }


    public void execute() {
        model.setFirst(view.getValue("Enter first number "));
        model.setSecond(view.getValue("Enter second number "));

        view.print("Action result is ", model.getActionResult());
    }

    private static class MockView implements View {

        private int count = 0;



        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

        @Override
        public void print(String message,int res) {
            message=message+res;
            if (!message.equals("Action result is "+res)) {
                throw new AssertionError("Incorrect");
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        SumModel sumModel = new SumModel();
        SubtractModel subtractModel = new SubtractModel();
        SeparationModel separationModel = new SeparationModel();
        MultiplicationModel multiplicationModel = new MultiplicationModel();

        MockView mockView = new MockView();

        Presenter presenter1 = new Presenter(sumModel, mockView);
        Presenter presenter2 = new Presenter(subtractModel, mockView);
        Presenter presenter3 = new Presenter(separationModel, mockView);
        Presenter presenter4 = new Presenter(multiplicationModel, mockView);
        List<Presenter> list = new ArrayList<>();

        list.add(presenter1);
        list.add(presenter2);
        list.add(presenter3);
        list.add(presenter4);

        for (Presenter el : list) {
            el.execute();
        }
    }
}