package Animales;

public class Camaleon extends Animal implements Alimentacion, Banio{
    private boolean lengua;

    public Camaleon(int id, int edad, String especie, String nombre, String raza, boolean garras) {
        super(id, edad, especie, nombre, raza);
        this.lengua = garras;
    }

    public boolean isLengua() {
        return lengua;
    }

    public void setLengua(boolean lengua) {
        this.lengua = lengua;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Sonido de camaleon");
    }

    @Override
    public void metodoAlimentacion() {
        System.out.println("Su dieta puede estar basada en pequenios insectos como los grillos");
    }

    @Override
    public void metodoDeBanio() {
        System.out.println("El banio consiste en colocar al individuo en agua templada durante al menos 20 minutos");
    }
}
