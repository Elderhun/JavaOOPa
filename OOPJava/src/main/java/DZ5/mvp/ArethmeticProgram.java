package DZ5.mvp;

import DZ5.mvp.arethmeticModels.*;

import java.util.Scanner;

public class ArethmeticProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int act;
        System.out.println("Hellow, it`s calc program" +
                "\nEnter action:" +
                "\n1 - Sum" +
                "\n2 - Subtract" +
                "\n3 - Multiplication" +
                "\n4 - Separation");
        act = scn.nextInt();

        switch (act){
            case 1:
                SummingProg();
                break;
            case 2:
                SubtractProg();
                break;
            case 3:
                MultiplicatProg();
                break;
            case 4:
                SeparationProg();
                break;
            default:
                System.out.println("Incorrect enter action");
        }
    }

    static void SummingProg(){
        Scanner scn = new Scanner(System.in);
        SumModel sumModel = new SumModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(sumModel, view);
        presenter.execute();
    }

   static void SubtractProg(){
        Scanner scn = new Scanner(System.in);
        SubtractModel subtractModel = new SubtractModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(subtractModel, view);
        presenter.execute();
    }

    static void SeparationProg(){
        Scanner scn = new Scanner(System.in);
        SeparationModel separationModel = new SeparationModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(separationModel, view);
        presenter.execute();
    }

    static void MultiplicatProg(){
        Scanner scn = new Scanner(System.in);
        MultiplicationModel multiplicationModel = new MultiplicationModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(multiplicationModel, view);
        presenter.execute();
    }

}
