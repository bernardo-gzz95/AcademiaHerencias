import ejemplos.de.herencia.Bicicleta;
import ejemplos.de.herencia.Vehiculo;

public class HerenciaMain {

    public static void main(String[] args) {

        Vehiculo carro = new Vehiculo("Mazda", 2025);
        carro.imprimirDatos();

        Bicicleta bici = new Bicicleta("Apache", 2024);
        bici.imprimirDatos();

        Vehiculo carroUsado = new Vehiculo("Nissan", 2020, 50000);
        carroUsado.imprimirDatos();

    }
}