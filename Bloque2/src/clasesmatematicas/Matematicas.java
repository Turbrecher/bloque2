package clasesmatematicas;

import modelo.Producto;

/**
 * Clase que contiene diferentes métodos matemáticos.
 * @author Victor
 */
public class Matematicas {

    /**
     * Metodo que calcula el factorial de un numero.
     * @param numero es el numero al que se le va a calcular el factorial
     * @return  el factorial del numero pasado por parametro
     */
    public static int calcularFactorial(int numero) {
        int factorial = 1;

        for (int i = numero; i > 0; i--) {
            factorial *= i;
        }

        return factorial;
    }

    /**
     * Metodo que calcula el recargo que se le va a aplicar al precio de un producto
     * @param producto es el producto al que se le va a aplicar el recargo
     * @return el precio final del producto con el recargo aplicado y los gastos de envio
     */
    public static float calcularRecargo(Producto producto) {
        final float PORCENTAJE_RECARGO = 1.16f;
        final short LIMITE = 300;
        final short GASTOS_ENVIO = 10;
        float recargo = 0;
        if (producto.getPrecio() > LIMITE) {
            recargo = producto.getPrecio() * PORCENTAJE_RECARGO;
        }
        recargo += GASTOS_ENVIO;

        return recargo;
    }

}
