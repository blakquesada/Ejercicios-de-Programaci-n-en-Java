
package peliculas;


public class Pelicula {
   private String titulo;
    private String clasificacion;
    private int duracion;
    private int boletosDisponibles;
    private double precio;
    private String genero;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }
    
    public Pelicula(String titulo ,String clasificacion, int duracion) {
       this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String clasificacion, int duracion, int boletosDisponibles, double precio, String genero) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.boletosDisponibles = boletosDisponibles;
        this.precio = precio;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getBoletosDisponibles() {
        return boletosDisponibles;
    }

    public void setBoletosDisponibles(int boletosDisponibles) {
        this.boletosDisponibles = boletosDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    public void vender(int cantidad){
        if (cantidad <= boletosDisponibles) {
            boletosDisponibles -= cantidad;
            System.out.println("valor total:" + boletosDisponibles);
            
        }else{
            System.out.println("no se puede vender boletos");
        }
    }
    
    
    
    public String toString(){
        return "pelicula:" + titulo
                + "\n clasificacion:" + clasificacion
                + "\n duracion:" + duracion
                + "\n boletos disponibles:" + boletosDisponibles
                + "\n precio" + precio
                + "\n genero:" + genero;
    }
    
    
}
