
package main;
import java.util.ArrayList;


public class Aerolinea {
    private String nombre;
    private String pais;
    private ArrayList<Vuelo> listavuelo;

    public Aerolinea() {
    }

    public Aerolinea(String nombre, String pais, ArrayList<Vuelo> listavuelo) {
        this.nombre = nombre;
        this.pais = pais;
        this.listavuelo = listavuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Vuelo> getListavuelo() {
        return listavuelo;
    }

    public void setListavuelo(ArrayList<Vuelo> listavuelo) {
        this.listavuelo = listavuelo;
    }
    
    public void agregarVuelo(Vuelo V){
        listavuelo.add(V);
    }
    
    public Vuelo buscarVuelo(String codigo){
        
        for (Vuelo v: listavuelo) {
            if (v.getCodigo().equals(codigo)) {
                return v;
            }
            
        }
        return null;
    }
    
    public void mostrarVuelos(){
        for (Vuelo v: listavuelo) {
            System.out.println(v);
            
        }
    }
    
    public int totalPasajeros(){
        int total = 0;
        
        for (Vuelo v: listavuelo) {
            total += v.getPasajeros();
            
        }
        return total;
    }
    
    
}
