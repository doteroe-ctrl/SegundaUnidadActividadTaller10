package Vehiculos;

public class Bicicleta extends Vehiculo{
    @Override
    public void moverse(){
        System.out.println("Soy una bici y me estoy moviendo");
    }
    //@Override
    //public void frenar(){ //da error porque tienen diferente firma
      //  System.out.println("La bici frena");
    //}
    public void frenar(){ //aunque si funciona, es mala practica no usar @Override
        //porq podria ser dificil de detectar cuando hayan errores
        System.out.println("La bici frena");
    
    }
}