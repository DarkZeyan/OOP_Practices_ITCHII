package eva2_6_herencia_e_interfaces;

/**
 *
 * @author user
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(){
        nombre = " ";
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
