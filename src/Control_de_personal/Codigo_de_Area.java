
package Control_de_personal;

public class Codigo_de_Area {
   
    String Ccomputos;
    String Biblioteca;
    String Zona_Verde;
    String Labo,CanchaB;
    
    public Codigo_de_Area(){
        
    }

    public Codigo_de_Area(String Ccomputos, String Biblioteca, String Zona_Verde, String Labo, String CanchaB) {
        this.Ccomputos = Ccomputos;
        this.Biblioteca = Biblioteca;
        this.Zona_Verde = Zona_Verde;
        this.Labo = Labo;
        this.CanchaB = CanchaB;
    }

    public String getCcomputos() {
        return Ccomputos;
    }

    public void setCcomputos(String Ccomputos) {
        this.Ccomputos = Ccomputos;
    }

    public String getBiblioteca() {
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZona_Verde() {
        return Zona_Verde;
    }

    public void setZona_Verde(String Zona_Verde) {
        this.Zona_Verde = Zona_Verde;
    }

    public String getLabo() {
        return Labo;
    }

    public void setLabo(String Labo) {
        this.Labo = Labo;
    }

    public String getCanchaB() {
        return CanchaB;
    }

    public void setCanchaB(String CanchaB) {
        this.CanchaB = CanchaB;
    }
    
    
    
    

    

    

    
}



