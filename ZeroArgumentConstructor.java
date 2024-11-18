// A-1 Q-31
public class ZeroArgumentConstructor {
    // Zero-argument constructor
    public ZeroArgumentConstructor() {
        System.out.println("This is a zero-argument constructor.");
    }

    public static void main(String[] args) {
        // Create an object of the class, which calls the zero-argument constructor
        ZeroArgumentConstructor obj = new ZeroArgumentConstructor();
    }
}
