/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
public class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
        this.punto1 = new Punto(0, 0, "A");
        this.punto2 = new Punto(10, 0, "B");
        this.punto3 = new Punto(5, 10, "C");
    }

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
    }

    public Triangulo(Triangulo t) {
        this.punto1 = t.punto1;
        this.punto2 = t.punto2;
        this.punto3 = t.punto3;
    }

    public double calcularPerimetro() {
        double a = distancia(punto1, punto2);
        double b = distancia(punto2, punto3);
        double c = distancia(punto3, punto1);
        return a + b + c;
    }

    public double calcularArea() {
        double a = distancia(punto1, punto2);
        double b = distancia(punto2, punto3);
        double c = distancia(punto3, punto1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public String tipoTriangulo() {
        double a = distancia(punto1, punto2);
        double b = distancia(punto2, punto3);
        double c = distancia(punto3, punto1);
        if (a == b && b == c) return "Equilátero";
        if (a != b && b != c && a != c) return "Escaleno";
        return "Isósceles";
    }

    public boolean equals(Triangulo t) {
        return this.punto1.equals(t.punto1) && this.punto2.equals(t.punto2) && this.punto3.equals(t.punto3);
    }

    public String toString() {
        return String.format("ab: (%f, %f) -> (%f, %f); bc: (%f, %f) -> (%f, %f); ac: (%f, %f) -> (%f, %f)",
                punto1.obtenerX(), punto1.obtenerY(), punto2.obtenerX(), punto2.obtenerY(),
                punto2.obtenerX(), punto2.obtenerY(), punto3.obtenerX(), punto3.obtenerY(),
                punto1.obtenerX(), punto1.obtenerY(), punto3.obtenerX(), punto3.obtenerY());
    }

    private double distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.obtenerX() - p1.obtenerX(), 2) + Math.pow(p2.obtenerY() - p1.obtenerY(), 2));
    }
}
