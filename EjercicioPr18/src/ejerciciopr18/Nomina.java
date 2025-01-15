package ejerciciopr18;

public class Nomina {
   
        public double nhtm;
        public double vht;
        public double retencion;
    
    // Constructor
    public Nomina(double nhtm, double vht,double retencion) {
        this.nhtm = nhtm;
        this.vht=vht;
        this.retencion=retencion;
    }

    
    // Método para calcular el salario bruto
    public double obtenerSalarioBruto() {
        return nhtm*vht;
    }
    
    // Método para calcular el salario neto
    public double obtenerSalarioNeto() {
        return (nhtm*vht)-((nhtm*vht*retencion)/100);
    }
    
}
