package libreria;

public class Consola implements DatosDeSalida{

    private String mensaje;

    public Consola(){

    }

    public Consola(String mensaje){
        this.mensaje= mensaje;
    }




    @Override
    public void visualizar() {
        System.out.println("sale por consola"+mensaje);
    }
}
