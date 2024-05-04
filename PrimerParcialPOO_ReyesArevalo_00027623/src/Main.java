import Animales.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal>  pacientes = new ArrayList<Animal>();
        Scanner op = new Scanner(System.in);
        int id = 0;
        int op1;
        do {
        System.out.println("\t.:Bienvenida/o a MascoHealth:.");
        System.out.println("Por favor escoge una opcion :)");
        System.out.println("1. Agregar un paciente");
        System.out.println("2. Eliminar un paciente");
        System.out.println("3. Consultar listado de pacientes");
        System.out.println("0. Salir");
        op1 = op.nextInt();

            switch (op1) {
                case 1:
                    Scanner ing = new Scanner(System.in);
                    System.out.println("Inserte el nombre:  ");
                    String nombre = ing.nextLine();
                    System.out.println("Inserte la especie:  ");
                    String especie = ing.nextLine();
                    System.out.println("Inserte la raza:  ");
                    String raza = ing.nextLine();
                    System.out.println("Inserte la edad:  ");
                    int edad = ing.nextInt();
                    if (especie == "Gato" || especie == "gato"){
                        boolean garras;
                        System.out.println("Posee garras?S/N  ");
                        String garras1 = ing.nextLine();
                        if (garras1 == "S" || garras1 == "s"){
                            garras = true;
                        }
                        else{
                            garras = false;
                        }
                        Gato gato1 = new Gato(id, edad, especie, nombre, raza, garras);
                        pacientes.add(gato1);
                    } else if (especie == "Camaleon" || especie == "camaleon") {
                        boolean lengua;
                        System.out.println("Posee lengua?S/N  ");
                        String lengua1 = ing.nextLine();
                        if (lengua1 == "S" || lengua1 == "s"){
                            lengua = true;
                        }
                        else{
                            lengua = false;
                        }
                        Camaleon camaleon1 = new Camaleon(id, edad, especie, nombre, raza, lengua);
                        pacientes.add(camaleon1);
                    }
                    id++;
                    break;
                case 2:
                    Scanner id1 = new Scanner(System.in);
                    System.out.println("Ingrese id del paciente: ");
                    int id2 = id1.nextInt();
                    for(int i=0;i<=pacientes.size();i++){
                        if(pacientes.get(i).getId()==id2){
                            pacientes.remove(i);
                        }

                    }


                    break;
                case 3:
                    for(int i=0;i<=pacientes.size();i++){
                        System.out.println(pacientes.get(i).getNombre()", " + pacientes.get(i).getEspecie()", " + pacientes.get(i).getRaza()", " + pacientes.get(i).getEdad()", ");
                        System.out.println(pacientes.get(i).hacerSonido(););
                    }
                    break;

            }
        }while(op1 != 0);

    }


}