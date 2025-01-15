package ejerciciopr19;
public class TrianguloEquilatero {

    public int lado;
    
    // Constructor
    public TrianguloEquilatero(int lado) {
        this.lado = lado;
    }

    
    // Método para calcular el perimetro
    public double obtenerPerimetro() {
        return lado*3;
    }

    // Método para calcular la altura
    public double obtenerAltura() {
        return (lado*Math.sqrt(3))/2;
    }

    // Método para calcular el area
    public double obtenerArea() {
        return (lado*((lado*Math.sqrt(3))/2))/2;
    }
    
}
