
package Control_de_personal;
import java.util.Scanner;
public class Recursos_Humanos {

    private Scanner desde_teclado;
    private String Nombre,Direccion_t,NumEdificio;
    private int Cargo,edad;
    private double Salario,salario_Final,AFP,ISSS,ISR;
    

    
   public void inicializar() {
        desde_teclado=new Scanner(System.in);
        System.out.print("Ingrese el nombre del trabajador:");
        Nombre=desde_teclado.next();
        System.out.print("Ingrese la edad del trabajador:");
        edad=desde_teclado.nextInt();
        System.out.print("Ingrese el salario bruto:");
        Salario=desde_teclado.nextDouble();
        System.out.print("Ingrese 1 si su cargo es por servicio y ingrese 2 si su cargo es permanente:");
        Cargo =desde_teclado.nextInt();
          System.out.print("Ingrese la direccion del trabajador:");
        Direccion_t=desde_teclado.next();
          System.out.print("Ingrese el numero de edificio:");
        NumEdificio=desde_teclado.next();
    }

    public void imprimir_datos() {
        System.out.println("\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Los datos del trabajador son los siguientes");
        System.out.println("Nombre:" + Nombre);
        System.out.println("Edad:" + edad + "años");
         System.out.println("direccion: " + Direccion_t);
         System.out.println("numero de edificio :" +NumEdificio );
    }
    public void cargo() {
        if (Cargo==1) {
            ISR= (Salario * 0.10);
             salario_Final= (Salario-ISR);
             System.out.println("");
            System.out.print("El cargo del trabajador " + Nombre + " es por servicio y su salario final es : $" + salario_Final + "\n");
            
        } else if(Cargo==2){
             ISR= (Salario * 0.10);
             ISSS= (Salario* 0.14);
             AFP= (Salario * 0.10);
             salario_Final= (Salario-ISR-ISSS-AFP);
           
            System.out.print("\n" + "El cargo del empleado " + Nombre + " es permanente y su salario final es : $" + salario_Final + "\n");
        }
        }
    public static void main(String[] args) {
        Edificio objeto= new Edificio();
        Recursos_Humanos datosPersona1es;
        datosPersona1es=new Recursos_Humanos();
        datosPersona1es.inicializar();
        datosPersona1es.imprimir_datos();
        datosPersona1es.cargo();
        
         System.out.println("");
         
        objeto.getUbicacion();
        objeto.getNombre();
        objeto.getCantidad_Dep();
        objeto.getCantidadDePisos();
        
         
         Codigo_de_Area  codigo= new Codigo_de_Area();
         codigo.getCcomputos();
         codigo.getBiblioteca();
         codigo.getCanchaB();
         codigo.getLabo();
         codigo.getZona_Verde();
         
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
}
}



