package DZ5.mvp;

import java.io.PrintStream;
import java.util.Scanner;

public class ViewImpl implements View {

    private final Scanner scn;

    private final PrintStream out;

    public ViewImpl(Scanner scn, PrintStream out) {
        this.scn = scn;
        this.out = out;
    }

    @Override
    public int getValue(String message) {
        out.print(message);
        return scn.nextInt();
    }

    @Override
    public void print(String message, int res) {
        out.print(message+res);
    }
}
