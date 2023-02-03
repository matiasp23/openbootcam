public class app {
    public static void main(String[] args){
        
        cliente cliente = new cliente();
        System.out.println(cliente.nombre="Matias");
        System.out.println(cliente.edad=33);
        System.out.println(cliente.telefono=155222333);
        System.out.println(cliente.credito=100);

        trabajador trabajador = new trabajador();
        System.out.println(trabajador.nombre="Hugo");
        System.out.println(trabajador.edad=30);
        System.out.println(trabajador.telefono=155333444);
        System.out.println(trabajador.Salario=200);
    }
}
    
class persona {
    int edad;
    String nombre;
    int telefono;
}

class cliente extends persona{
    int credito;
}


class trabajador extends persona {
    int Salario;
}
