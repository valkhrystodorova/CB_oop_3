public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new ColorPrinter();
        printer1.print("Hello");
        printer2.print("Hello");
    }
}
