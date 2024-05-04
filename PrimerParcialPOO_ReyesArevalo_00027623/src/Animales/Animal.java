package Animales;

public abstract class Animal {
    private  String nombre;
    private String especie;
    private String raza;
    private int edad;
    private int id;

    public Animal(int id, int edad, String especie, String nombre, String raza) {
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
        this.raza = raza;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void hacerSonido();
}
