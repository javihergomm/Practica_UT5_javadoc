package Zoologico;

public class main {
    public static void main(String[] args) {
        // Crear algunos animales
        Animal leon = new Animal("León", 5);
        Animal tigre = new Animal("Tigre", 4);

        // Crear un zoo
        Zoo zoo = new Zoo("Zoológico de ejemplo", "Ciudad Ejemplo");

        // Agregar animales al zoo
        zoo.agregarAnimal(leon);
        zoo.agregarAnimal(tigre);

        // Hacer que los animales hagan sonido
        System.out.println(leon.getNombre() + " hace: " + leon.hacerSonido());
        System.out.println(tigre.getNombre() + " hace: " + tigre.hacerSonido());

        // Eliminar un animal del zoo
        zoo.eliminarAnimal(leon);
    }
}
