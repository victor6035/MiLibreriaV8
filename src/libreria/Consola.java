package libreria;

public class Consola {

    private String mensaje;

    public Consola(String mensaje){
        this.mensaje= mensaje;
    }

    public  void visualizar(String mensaje){

        System.out.println("sale por consola"+mensaje);
    }


}
