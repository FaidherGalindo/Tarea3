package ejerciciore7;

public class Validar {
    
    double a,b;
    
    public static String validar(double a, double b){
        if (a>b){
            return "A es mayor que B";
        }
        else if(a==b){
            return "A es igual que B";
        }
        else{
            return "A es menor que B";
        }
    }       
    public static String limpiar_campo(){
        return "";
    }    
}
    
    
   