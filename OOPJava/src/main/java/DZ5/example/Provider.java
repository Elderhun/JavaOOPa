package DZ5.example;

public class Provider {

    public static SomeInterface provide() {
        return new Implementation();
    }
}
