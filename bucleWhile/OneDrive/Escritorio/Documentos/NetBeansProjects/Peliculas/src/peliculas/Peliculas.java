
package peliculas;

public class Peliculas {


    public static void main(String[] args) {
       Pelicula pelicula1 = new Pelicula("delta", "buena" , 1, 80,14000,"ficcion");
         Pelicula pelicula2 = new Pelicula("matrix", "buena" , 2, 90,14500,"ficcion");
         System.out.println("------------------------------------------------------------------------");
       Cliente n1 = new Cliente();
       n1.pedirDatos();
        System.out.println("------------------------------------------------------------------------------");
        
        
        System.out.println(pelicula1.toString());
        System.out.println("-----------------------------------------------------------------------------");
        
        
         System.out.println(pelicula2.toString());
         System.out.println("-------------------------------------------------------------------------------");
         
         System.out.println("cual pelicula decea elegir 1 para deltaFORCE 2 para matrix");
        if (n1.equals(n1)) {
            pelicula1.vender(40);
             System.out.println(pelicula1.toString());
        }else
            if(n1.equals(2)){
                pelicula2.vender(30);
             System.out.println("--------------------------------------------------------------------------------");
        
        System.out.println(pelicula2.toString());
        }
        
   
        
        
        
        
        
        
        
        
        
        pelicula1.getBoletosDisponibles();
       
       
    }
    
}
