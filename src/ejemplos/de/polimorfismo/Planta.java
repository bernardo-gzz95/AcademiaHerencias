package ejemplos.de.polimorfismo;

public class Planta {
    //El atributo es privado, por lo tanto para acceder a el tenemos que crear un setter para cambiar informacion
    //o un getter para obtenerla
    private String nombre;

    public void imprimirNombre(){
        System.out.println("Este es el nombre de la planta: " + this.nombre);
    }

    //Setter para cambiar el nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

class Suculenta extends Planta{
    private int riego;
    private String especie;

    @Override
    public void imprimirNombre(){
        System.out.println("Soy de categoria suculenta mi especie es: " + this.especie + " y necesito un riego de " + getRiego() + "veces a la semana");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }
}

//Clase principal que ejecuta el codigo de esta clase
class PlantaMain {
    public static void main(String[] args) {

        //Se crea un objeto de tipo Suculenta para crear una etiqueta
        Suculenta planta1 = new Suculenta();

        //Utilizacion de getters y setters para poner nombres
        planta1.setEspecie("Plantalus especius");
        planta1.setRiego(2);

        //Usamos la funcion para imprimir los nombres que es la supuesta "etiqueta de supermercado"
        planta1.imprimirNombre();
    }
}