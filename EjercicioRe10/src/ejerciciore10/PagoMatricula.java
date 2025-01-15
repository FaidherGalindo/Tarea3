package ejerciciore10;

public class PagoMatricula {
    
    double patrimonio;
    double estrato;
    double pagmat = 50000;
    String inscripcion;
    String nombres;
    

    PagoMatricula(double patrimonio,double estrato,double pagmat){
        this.patrimonio=patrimonio;
        this.estrato=estrato;
        this.pagmat=pagmat;
    
    }

public double pago_por_matricula(double patrimonio, double estrato,double pagmat){

    if ((patrimonio>2000000) && (estrato>3)){
        pagmat = pagmat+0.03*patrimonio;
        return pagmat; 
    }
    
    else{
    return pagmat;
    } 
        
}    


public static String limpiar_campo(){
    return "";
}

public static String obtener_inscripcion(String inscripcion){
    return inscripcion;
}


public static String obtener_nombres(String nombres){
    return nombres;
}
}
