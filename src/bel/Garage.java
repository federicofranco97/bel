
package bel;

import java.util.ArrayList;


public class Garage {
    
    //Crea un array de cocheras
    ArrayList<Cochera>cocheras = new ArrayList<>();
    
    
    //lleno 20 cocheras numeradas del 1 al 20
    public void llenarCocheras(){
        
        for(int i=1;i<21;i++){
            cocheras.add(new  Cochera(i));
        }
    }
    
    
    /*
        accion de alquilar una cochera a un cliente donde se pide como
        parametro el tipo (fija o movil) , y la cochera que se quiere
        alquilar, por lo que tenes que chekear si esta libre o no
    
    */
    public void alquilarCochera(String tipoCochera,int numeroCochera){
        //si esta libre la alquilo sino tiro que esta ocupada
        //por lo que le seteo el estado a la cochera que me pasan x parametro
        
        
        int numeroArray= numeroCochera-1; // como los arrays empiezan en cero, y las cocheras en 1 hay que restarle 1 al numero que entra x parametro
        
        int posicionCochera=-1; //aca guardo en que posicion del array esta el numero de cochera que llega por param.
        
        //Recorro la lista de cocheras, y si la encuentra, guarda en la variable posicionCochera el lugar en donde la encontro
        for(int i=0;i<cocheras.size();i++){
            int aux = cocheras.get(i).getNumero();
            if(aux == numeroArray){
                posicionCochera=aux;
            }
        }
        
        //Filtro para que si la cochera que se ingresa no existe salga del metodo
        if(posicionCochera==-1){
            System.out.println("La cochera no se encontro!");
            return;
        }
        
        
        
        // cocheras.get(posicionCochera)  <---- eso trae la cochera que se pidio x parametro 
        
        
        //si la cochera esta libre, le setea el estado que se pasa por parametro y tira un msj
        if(cocheras.get(posicionCochera).getEstado().equals("libre")){
            
            cocheras.get(posicionCochera).setEstado(tipoCochera);
            System.out.println("La cochera "+cocheras.get(posicionCochera).getNumero()+" fue alquilada con exito!");
            
        }else{
            //si no esta libre tira msj
            System.out.println("La cochera seleccionada no esta libre!");
        }
        
    }
    
    
    //metodo para devolver una cochera si esta tomada. (liberarla)
    public void devolverCochera(int numeroCochera){
        int posicionCochera=-1; //aca guardo en que posicion del array esta el numero de cochera que llega por param.
        int numeroArray= numeroCochera-1; // como los arrays empiezan en cero, y las cocheras en 1 hay que restarle 1 al numero que entra x parametro
        //Recorro la lista de cocheras, y si la encuentra, guarda en la variable posicionCochera el lugar en donde la encontro
        for(int i=0;i<cocheras.size();i++){
            int aux = cocheras.get(i).getNumero();
            if(aux == numeroArray){
                posicionCochera=aux;
            }
        }
        
        //Filtro para que si la cochera que se ingresa no existe salga del metodo
        if(posicionCochera==-1){
            System.out.println("La cochera no se encontro!");
            return;
        }
        
        //igual que el metodo de arriba pero chekea que no este libre con el ! y la setea libre y tira msj
        if(!( cocheras.get(posicionCochera).getEstado().equals("libre"))){
            cocheras.get(posicionCochera).setEstado("libre");
            System.out.println("La cochera "+cocheras.get(posicionCochera).getNumero() +" fue devuelta con Exito!");
        }else{
            System.out.println("La cochera no esta prestada por lo que no se puede devolver!");
        }
    }
    
}
