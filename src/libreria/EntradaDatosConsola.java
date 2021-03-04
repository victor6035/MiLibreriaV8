package libreria;

import java.util.Scanner;

public class EntradaDatosConsola implements DatosDeEntrada{
    @Override
    public void intruducirDatos() {

        System.out.println("Introduce datos de entrada");
        String datos;

        Scanner sc = new Scanner(System.in);
        datos = sc.nextLine();
    }
}
