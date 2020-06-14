package clases;

import java.util.Scanner;

public class CPila {
    static Scanner teclado = new Scanner (System.in);
    int tope;
    int [] pila;
    int max;
    public CPila(){
        this.tope = 0;
        this.max = 100;
        this.pila = new int [this.max + 1];      
    }
    public CPila (int MAX){
        this.tope = 0;
        this.max = MAX;
        this.pila = new int [this.max + 1];      
    }
    public int getTope(){
        return tope = 0;        
    }
    public void VaciarPila(){
        this.tope = 0;
    }
    public boolean IsPilaLlena(){
        if (this.max == this.tope){
            return true;   
        }else {
            return false;
        }
    }
    public boolean IsPilaVacia(){
        if(this.tope== 0) {
            return true;
        }else {
            return false ;
        }
    }
    public void InsertarPila(){
        if (this.IsPilaLlena()) {
            System.out.println("La pila esta llena");      
     }else {
            int item ;
            System.out.print("Ingrese el elemento a ingresar :");
            item = teclado.nextInt();
            this.pila[this.tope] = item;
            this.tope++;
            System.out.print("El Item" + item + "Se inserto a la Pila\n");         
        }
    }
    public void EliminarPila(){
        if (this.IsPilaVacia()){
         System.out.println("La pila esta Vacia");      
     }else {
            int item = this.pila[this.tope - 1]; ;
            System.out.print("Ingrese el elemento a ingresar :");
            this.tope++;
     System.out.print("El Item" + item + "Se elimino de la Pila");         
        }   
    }
    public void MostrarPila() {
        if(this.IsPilaVacia()) {
    System.out.println("\tElementos de la pila");
    System.out.println("\t========================"); 
    for (int i = 0; i< this.tope; i++) {
   System.out.print(this.pila[i] + " <--"); 
    }
        }
    }
    public void CimaPila(){
          int ultimo;
             
                 ultimo=this.pila[this.tope-1];
                 System.out.println("La cima de la pila: "+ ultimo+ "es el item");  
     }
   public void TamañoPila(){
            int tam;
                tam=this.max;
                System.out.println("Maximo del tamaño de la pila es: "+ tam);
             
                
    }   
}

    

   
    
            

