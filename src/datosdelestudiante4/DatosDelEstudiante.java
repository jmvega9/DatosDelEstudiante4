/*
 * Implemente un algoritmo que le permita solicitar el ingreso por teclado
el nombre de la universidad, el departamento, la carrera, el nombre de la materia,
nombres completos del estudiante, nivel, numero de cedula, pais, ciudad,
canton, provincia, ID, sexo.
 */
package datosdelestudiante4;

/**
 *
 * @author Jessica Maribel Vega Masapanta
 */
import java.util.Scanner;
public class DatosDelEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner (System.in);
        System.out.println("Ingrese el nombre de la universidad:");
        String nombreuniversidad=objeto.nextLine();
                
        System.out.println("Ingrese el departamento:");
        String departamento=objeto.nextLine();
        
        System.out.println("Ingrese la carrera:");
        String carrera=objeto.nextLine();
        
        System.out.println("Ingrese el nombre de la materia:");
        String nombremateria=objeto.nextLine();
        
        System.out.println("Ingrese el nombre completo del estudiante:");
        String nombreestudiante=objeto.nextLine();
        
        System.out.println("Ingrese el nivel:");
        String nivel=objeto.nextLine();
        
        System.out.println("Ingrese el numero de cedula:");
        String cedula=objeto.nextLine();
        
        System.out.println("ingrese el pais de origen:");
        String pais=objeto.nextLine();
        
        System.out.println("Ingrese la ciudad:");
        String ciudad=objeto.nextLine();
        
        System.out.println("Ingrese el canton:");
        String canton=objeto.nextLine();
        
        System.out.println("Ingrese la provinvia:");
        String provincia=objeto.nextLine();
        
        System.out.println("Ingrese su ID:");
        String ID=objeto.nextLine();
        
        System.out.println("Ingrese el tipo de sexo:");
        String sexo=objeto.nextLine();
        
        System.out.println("Bienvenidos a la Universidad"+ nombreuniversidad);
        
    }
    
}

