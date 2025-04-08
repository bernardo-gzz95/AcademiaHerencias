package ejemplos.de.herencia;

public class Vehiculo {
    String marca;
    int año;
    int kilometraje = 0;

    public Vehiculo(String marca,int año){
        this.marca = marca;
        this.año = año;
    }

    public Vehiculo(String marca, int año,int kilometraje){
        this.marca = marca;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    public void imprimirDatos(){
        System.out.println("El vehiculo es marca: " + this.marca + " del año " + this.año + " Kilometrae: " + this.kilometraje);
    }
}