package libreria;

import javax.swing.*;

public class EntradaDatosVentana implements DatosDeEntrada{
    @Override
    public void intruducirDatos() {

        String datos= JOptionPane.showInputDialog(null,"Introduce datos de entrada");

    }

}
