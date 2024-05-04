package Animales;

public class Gato extends Animal implements Alimentacion, Banio{
    private boolean garras;

    public Gato(int id, int edad, String especie, String nombre, String raza, boolean garras) {
        super(id, edad, especie, nombre, raza);
        this.garras = garras;
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void metodoAlimentacion() {
        System.out.println("Se le recomienda darle whiskas si le esta dando sobras de su comida no le va a durar mucho");
    }

    @Override
    public void metodoDeBanio() {
        System.out.println("A diferencia de lo que se cree, no es necesario que se les de un banio tan seguido el banio puede realizarse 1 vez al mes con agua tibia y el jabon especial MascoHealth");
    }
}
