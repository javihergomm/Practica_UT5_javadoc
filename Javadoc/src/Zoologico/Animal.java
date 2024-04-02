package Zoologico;

public class Animal {
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Animal.
     * @param nombre El nombre del animal.
     * @param edad La edad del animal en años.
     */
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del animal.
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del animal.
     * @param nombre El nuevo nombre del animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la edad del animal.
     * @return La edad del animal en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para establecer la edad del animal.
     * @param edad La nueva edad del animal en años.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que representa el sonido que hace el animal.
     * @return El sonido característico del animal.
     */
    public String hacerSonido() {
        return "¡Grrrr!";
    }
}
