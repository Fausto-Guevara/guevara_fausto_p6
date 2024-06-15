/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
public class Rectangulo {
    private Punto punto1;
    private Punto punto2;

    public Rectangulo(Punto p1, Punto p2) {
        this.punto1 = p1;
        this.punto2 = p2;
    }

    public boolean esCuadrado() {
        return Math.abs(punto1.obtenerX() - punto2.obtenerX()) == Math.abs(punto1.obtenerY() - punto2.obtenerY());
    }

    public double calcularPerimetro() {
        double largo = Math.abs(punto1.obtenerX() - punto2.obtenerX());
        double ancho = Math.abs(punto1.obtenerY() - punto2.obtenerY());
        return 2 * (largo + ancho);
    }

    public double calcularArea() {
        double largo = Math.abs(punto1.obtenerX() - punto2.obtenerX());
        double ancho = Math.abs(punto1.obtenerY() - punto2.obtenerY());
        return largo * ancho;
    }

    public Rectangulo cuadrilateroMinimo(Rectangulo r) {
        double x1 = Math.min(this.punto1.obtenerX(), r.punto1.obtenerX());
        double y1 = Math.min(this.punto1.obtenerY(), r.punto1.obtenerY());
        double x2 = Math.max(this.punto2.obtenerX(), r.punto2.obtenerX());
        double y2 = Math.max(this.punto2.obtenerY(), r.punto2.obtenerY());
        return new Rectangulo(new Punto(x1, y1, ""), new Punto(x2, y2, ""));
    }

    public boolean equals(Rectangulo r) {
        return this.punto1.equals(r.punto1) && this.punto2.equals(r.punto2);
    }
}
