/*clase Buzon debe incluír os seguintes métodos públicos:
a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
b) void engade (Correo c), que engade c ao buzon
c) boolean porLer(), que determina se quedan correos por ler
d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
f) void elimina(int k), que elimina o correo k-ésimo*/
package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Buzon {

    private ArrayList<Correo> listaC=new ArrayList<Correo>();
    Correo e1=new Correo("hola1");
    Correo e2=new Correo("hola2");
    Correo e3=new Correo("hola3");
    Correo e4=new Correo("hola4");
    Correo e5=new Correo("hola5");
    Correo e6=new Correo("hola6");

    public void cargarCorreos() {
        listaC.add(e1);
        listaC.add(e2);
        listaC.add(e3);
        listaC.add(e4);
        listaC.add(e5);
        listaC.add(e6);
    }

    public int numeroDeCorreos() {
        return listaC.size();
    }

    public void engage(Correo c) {
        listaC.add(c);
    }

    public boolean porLer() {
        /*false es que no han sido leidos, true es que han sido leidos
        Si devuelve true es que todos los correos han sido leidos, si devuelve false es que 1 o + de 1 no han sido 
        leidos.
         */
        boolean leidos=false;

        for (int i=0; i<listaC.size(); i++) {

            if (listaC.get(i).isLeido()==true) {
                leidos=true;
            } else {
                leidos=false;
            }

        }
        return leidos;
    }

    public String amosaPrimerNoLeido() {

        for (int i=0; i<listaC.size(); i++) {

            if (listaC.get(i).isLeido()==false) {

                listaC.get(i).setLeido(true);
                return listaC.get(i).getContenido();
            }

        }
        return "Todos los mensajes leidos";
    }
    /*
    Try y catch para atrapar las excepciones de cuando le pase una posición que no exista
    */
    public String amosa(int k) {

        try {
            return listaC.get(k).getContenido();
        } catch (IndexOutOfBoundsException exception) {
            return "Error no encontrada la posición";

        }
    }

    public void elimina(int k) {

        try {
            listaC.remove(k);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Error no encontrada la posición");

        }

    }
}
