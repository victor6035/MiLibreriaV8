package libreria;

import javax.swing.*;

public class Ventana implements DatosDeSalida {

    private String mensaje;

    public Ventana(){

    }

    public Ventana(String mensaje){

        this.mensaje= mensaje;
    }



    @Override
    public void visualizar() {
        JOptionPane.showMessageDialog(null,"sale por una ventana"+mensaje);
    }
}
