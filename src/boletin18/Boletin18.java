package boletin18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {
        // Inicializamos objeto Buzon
        Buzon buzon=new Buzon();
        boolean exit=true;
        // Metodo para cargar o crear el arraylist
        buzon.cargarCorreos();
// Variable con inicializada con el número de opciones
        int opcion=7;

        // Bucle para trabajar con la app
        do {
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
            */
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n "
                        +"1) Mostrar cantidad de Correos\n "
                        +"2) Añadir un nuevo Correo\n"
                        +"3) Mostrar si hay mensajes sin leer\n"
                        +"4) Mostrar primer correo sin leer\n"
                        +"5) Mostrar el Correo que desee\n"
                        +"6) Eliminar el Correo que desee\n"
                        +"7) Salir"));

         

            switch (opcion) {
                case 1:
                    System.out.println(buzon.numeroDeCorreos()+" correos");
                    break;
                case 2:
                    buzon.engage(new Correo(JOptionPane.showInputDialog("Contenido del correo")));
                    break;
                case 3:
                    if (buzon.porLer()==false) {
                        System.out.println("Quedan correos sin leer");
                    } else {
                        System.out.println("Todos los correos leidos");
                    }
                    break;

                case 4:

                    System.out.println(buzon.amosaPrimerNoLeido());
                    break;
                case 5:
                    System.out.println(buzon.amosa(Integer.parseInt(JOptionPane.showInputDialog("Posicion del correo"))));
                    break;

                case 6:
                    buzon.elimina(Integer.parseInt(JOptionPane.showInputDialog("Posicion del correo")));
                    break;
                case 7:

                    exit=false;
                    break;

            }
               } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit=false;
            }

        } while (exit==true);
    }

}
