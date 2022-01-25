public class Quadrilateros {

    public static void area(double a) {
        double quadrado = a * a;
    System.out.println("Área quadrado: "+quadrado);
    }

    public static void area(double a, double b) {
        double retangulo = a * b;
        System.out.println("Área do retângulo: "+retangulo);
    }

    public static void area(double B, double b, double h) {
        double trapezio = ((B + b) * h)/2;
        System.out.println("Área do trapézio: "+trapezio);
    }
}
