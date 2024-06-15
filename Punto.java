/*
 * @author Guevara Thomas Fausto Yahel
 * @version 1.0
 * @date 12-Abril-2024 
 */
public class Punto {
    private double coorX;
    private double coorY;
    private String id;
 
    Punto() {
       this.coorX = 0.0;
       this.coorY = 0.0;
       this.id = "O";
    }
 
    Punto(double var1, double var3, String var5) {
       this.coorX = var1;
       this.coorY = var3;
       this.id = var5;
    }
 
    Punto(Punto var1) {
       this.coorX = var1.obtenerX();
       this.coorY = var1.obtenerY();
       this.id = var1.obtenerId();
    }
 
    public double obtenerX() {
       return this.coorX;
    }
 
    public double obtenerY() {
       return this.coorY;
    }
 
    public String obtenerId() {
       return this.id;
    }
 
    public void asignarX(double var1) {
       this.coorX = var1;
    }
 
    public void asignarY(double var1) {
       this.coorY = var1;
    }
 
    public void asignarId(String var1) {
       this.id = var1;
    }
 
    public String toString() {
       return "  " + this.id + " : (" + this.coorX + ", " + this.coorY + ")";
    }
 
    public boolean equals(Punto var1) {
       return this.coorX == var1.obtenerX() && this.coorY == var1.obtenerY() ? this.id.equals(var1.obtenerId()) : false;
    }
 }
 