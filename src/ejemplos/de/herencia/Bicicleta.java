package ejemplos.de.herencia;

public class Bicicleta extends Vehiculo{
    String categoria;

    public Bicicleta(String marca, int año) {
        super(marca, año);
    }

    @Override
    public  void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Categoria: Bicis de montaña");
    }

}
