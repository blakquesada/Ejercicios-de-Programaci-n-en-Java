
package pkgswitch;


public class Switch {

    
    public static void main(String[] args) {
        
        int dia = 5;
        String NombreDia;
        
        switch(dia){
            case 1: NombreDia = "lunes";
            break;
            
            case 2: NombreDia = "martes";
            break;
            
            case 3: NombreDia = "miercoles";
            break;
            
            case 4: NombreDia = "jueves";
            break;
            
            case 5: NombreDia = "viernes";
            break;
            
            case 6: NombreDia = "sabado";
            break;
            
            case 7: NombreDia = "domingo";
            break;
            
            default: NombreDia = "dia de la semana invalido";
            break;
            
        }
        System.out.println("el dia de la semana seleccionado es:"+ NombreDia);
    }
    
}
