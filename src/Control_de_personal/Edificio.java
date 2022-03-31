
package Control_de_personal;

public class Edificio {
    
    String Ubicacion;
    String nombre;
    String cantidad_Departamentos;
    String cantidadDePisos;
    
    public Edificio(){
        
    }

    public Edificio(String Ubicacion, String nombre, String cantidad_Departamentos, String cantidadDePisos) {
        this.Ubicacion = Ubicacion;
        this.nombre = nombre;
        this.cantidad_Departamentos = cantidad_Departamentos;
        this.cantidadDePisos = cantidadDePisos;
    }

    public String getUbicacion() {
        System.out.println("Km 64 1/2 , desvío Hacienda El Nilo, sobre autopista a Zacatecoluca y Usulután, El Salvador ");        
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        
        this.Ubicacion = ubicacion;
    }

    public String getNombre(){ 
        System.out.println("ITCA - FEPADE Edificio C");
        return nombre;
    }

    public void setNombre(String nombree) {
        this.nombre = nombree;
    }

     
    public String getCantidad_Dep() {
        System.out.println("Cuatro departamentos ");
        return cantidad_Departamentos;
    }

    public void setCantidad_Dep(String cantidadDepartamentos) {
        this.cantidad_Departamentos = cantidadDepartamentos;
    }

    public String getCantidadDePisos() {
        System.out.println("tres pisos en el edificio C Y dos pisos en el edificio B");
        return cantidadDePisos;
    }

    public void setCantidadDePisos(String cantidadpisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    

    

   
    }




