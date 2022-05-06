package main;

import static clasesmatematicas.Matematicas.calcularFactorial;
import static clasesmatematicas.Matematicas.calcularRecargo;
import modelo.Producto;

public class Main {

    public static void main(String[] args) {
        //creo un producto
       Producto producto1 = new Producto("producto1", 20);
       
        //uso el metodo de la clase modelo
        System.out.println(calcularRecargo(producto1));
       
       //uso el metodo de la clase clasematematicas
        System.out.println( calcularFactorial(5));
      
    }

}
