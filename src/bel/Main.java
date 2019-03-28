
package bel;


public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        //metodo que llena el array con las 20 cocheras con estado libre
        garage.llenarCocheras();
        
        System.out.println("++++++++++++++++++");
        garage.alquilarCochera("fija", 2);
        System.out.println("++++++++++++++++++");
        garage.alquilarCochera("movil", 7);
        System.out.println("++++++++++++++++++");
        garage.devolverCochera(2);
        System.out.println("++++++++++++++++++");
        garage.devolverCochera(1);
        System.out.println("++++++++++++++++++");
        
        
    }
}
