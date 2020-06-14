package clases;

import java.util.Scanner;

public class AplicaPila {
    static Scanner teclado = new Scanner(System.in);
    public static CPila Pila;
public static void main (String [] args )   {
    MenuPila();
}
static void creaPila() {
    int tam;
    System.out.print("Ingrese tamaño de la pila :");
    tam = teclado.nextInt();
    Pila = new CPila(tam);
    System.out.println("pila creada .... \n");
}
public static void MenuPila() {
    int Opcion;
    int opcion;
    do{
     System.out.println("\n Menu de Opciones");
            System.out.println("=====================");
            System.out.println("[1] Crea Pila"); 
            System.out.println("======================");
            System.out.println("[2] Ingresar Datos - [Apilar] ");
            System.out.println("[3] Mostrar Datos -  [Desapilar]");
            System.out.println("[4] Mostrar Pila");
            System.out.println("[5] Eliminar Pila");
            System.out.println("[6] Mostrar Cima de la Pila");
            System.out.println("[7] Mostrar tamaño de la Pila");
            System.out.println("=======================");        
            System.out.println("0<- Salir");    
  System.out.print("\nIngrese una alternativa: ");
            opcion = teclado.nextInt();
            System.out.println();
            
            switch (opcion) {
                 case 1: 
                    creaPila();
                    break;
                case 2: 
                   Pila.InsertarPila();
                    break;
                case 3: 
                    Pila.EliminarPila();
                    break;
                case 4: 
                    Pila.MostrarPila();
                    break;  
                case 5: 
                    Pila.VaciarPila();
                    System.out.println("\n");
                    break; 
                case 6 : 
                    Pila.CimaPila();
                    System.out.println("\n");
                    break;
                 case 7 : 
                    Pila.TamañoPila();
                    break;
                    
                case 0:
                System.out.println("Saliendo del Sistema.....");
                 System.exit(0);
                break;
                
                default:
                 System.out.println("Ingrese Opcion Correcta.....");
                 System.out.println("\n");
            }
        }while (opcion!=0);
        }
}
           