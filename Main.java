/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
public class Main {
    public static void main(String[] args) {
        // Probar Rectangulo
        Punto p1 = new Punto(0, 0, "A");
        Punto p2 = new Punto(5, 5, "B");
        Rectangulo r1 = new Rectangulo(p1, p2);
        System.out.println("Es cuadrado: " + r1.esCuadrado());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        System.out.println("Área: " + r1.calcularArea());

        // Probar Triangulo
        Triangulo t1 = new Triangulo();
        System.out.println("Perímetro del triángulo por defecto: " + t1.calcularPerimetro());
        System.out.println("Área del triángulo por defecto: " + t1.calcularArea());
        System.out.println("Tipo de triángulo por defecto: " + t1.tipoTriangulo());
        System.out.println("Descripción del triángulo por defecto: " + t1.toString());
    }
}
