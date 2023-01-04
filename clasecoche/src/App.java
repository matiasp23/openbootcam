public class App {
    public static void main(String[] args) {
        coche coche1 = new coche();
        coche1.AñadirPuerta();
        System.out.println(coche1.puertas);
    }
}

class coche {
    public int puertas = 4;

    public void AñadirPuerta(){
        this.puertas++;
    }
}