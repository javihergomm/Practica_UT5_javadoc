package Zoologico;

public class Zoo {
    private String nombre;
    private String ubicacion;

    /**
     * Constructor de la clase Zoo.
     * @param nombre El nombre del zoo.
     * @param ubicacion La ubicación del zoo.
     */
    public Zoo(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    /**
     * Método para obtener el nombre del zoo.
     * @return El nombre del zoo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del zoo.
     * @param nombre El nuevo nombre del zoo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la ubicación del zoo.
     * @return La ubicación del zoo.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Método para establecer la ubicación del zoo.
     * @param ubicacion La nueva ubicación del zoo.
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * Método para agregar un animal al zoo.
     * @param animal El animal a agregar al zoo.
     */
    public void agregarAnimal(Animal animal) {
        System.out.println("Se ha agregado el animal " + animal.getNombre() + " al zoo " + nombre);
    }

    /**
     * Método para eliminar un animal del zoo.
     * @param animal El animal a eliminar del zoo.
     */
    public void eliminarAnimal(Animal animal) {
        System.out.println("Se ha eliminado el animal " + animal.getNombre() + " del zoo " + nombre);
    }
}
