
package boletin18;

public class Correo {
    private String contenido;
    private boolean leido;

    public Correo(String contenido) {
        this.contenido=contenido;
        this.leido=false;
    }

    public String getContenido() {
        return contenido;
    }

    public void setLeido(boolean leido) {
        this.leido=leido;
    }

    public boolean isLeido() {
        return leido;
    }

    @Override
    public String toString() {
        return "Correo{"+"contenido="+contenido+", leido="+leido+'}';
    }
    

    
    
}
