package libreria;

public class FactoriasSalida {

    public static DatosDeSalida getProductoSalida(int opcion){
        switch (opcion){
            case 1:
                return new Consola();
            case 2:
                return new Ventana();
            default:
                return null;
        }
    }
}
