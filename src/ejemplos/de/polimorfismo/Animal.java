package ejemplos.de.polimorfismo;

public class Animal {
    //Atributo de clase publico por lo tanto es accesible cuando creas los objetos
    public String nombre;

    //Funcion simple y generica
    public void haceSonido(){
        System.out.println("Sonido generico");
    }
}

class Perro extends Animal{

    //Esta siendo sobreescrita y esto se liga mediante la anotacion de @Override
    @Override
    public void haceSonido(){
        System.out.println("Guau!");
    }

    //Esta es otra funcion que se puede acceder con los objetos de tipo Perro, se llama igual que la de arriba
    //pero se toma como una funcion diferente porque nos esta pidiendo el parametro boolan isAHusky
    //a esto se le lama Sobre Carga de Metodos ya que le estamos cargando mas funciones al mismo nombre
    public void haceSonido(boolean isAHusky){
        System.out.println("HHHHHAAAAAAAAAAAAA!!!");
    }
}

class Gato extends Animal{
    @Override
    public void haceSonido(){
        System.out.println("Miau!");
    }
}

//Clase principal que ejecuta el codigo de esta clase
class AnimalMain {
    public static void main(String[] args) {

        //Creacion de objetos
        Perro a1 = new Perro();
        Perro A1 = new Perro();
        Gato a2 = new Gato();
        Animal a3 = new Gato();

        //Como el atributo es publico se puede acceder desde el objeto como en este caso y hasta cambiarle el valor
        //cosa que no debe de suceder por practicas de seguridad.
        a1.nombre = "Firulais";
        System.out.println(a1.nombre);

        //Aqui esta ejecutado el mismo metodo en todos los casos, pero debido a los diferentes constructores
        //usados para crear los objetos como Perro() y Gato() se pueden obtener variaciones dependiendo de
        //las Clases a las que pertenecen y como se estan heredando
        a1.haceSonido();
        A1.haceSonido(true);
        a2.haceSonido();
        a3.haceSonido();
    }
}
