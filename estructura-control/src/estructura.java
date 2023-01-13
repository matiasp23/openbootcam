public class estructura {
    public static void main(String[] args){
 
    int numeroIF=0;
    int numerowhile=1;
    int numerofor=0;
    var estacion="invierno";

    if( numeroIF==0 ) {
        System.out.println("El número es igual a cero");
    
    }
        else if( numeroIF>0) {
            System.out.println("El número es positivo");
        }

        else {
            System.out.println("El número es negativo");
        }


    while (numerowhile<3){
        System.out.println("El numero "+numerowhile+" es menor que tres");
        numerowhile++;
    } 
    
    do {
        System.out.println("El numero es "+numerowhile);
        numerowhile++;
    } while (numerowhile<3);

    for(numerofor=0; numerofor<=3; numerofor++){
        System.out.println("El valor de la variable es "+numerofor);
    }

    switch(estacion) {
        case "verano":
        case "primavera":
        case "invierno":
        case "otroño":
        System.out.println("La estaciones es "+estacion);
        break;
        default:
        System.out.println("No es una estacion");

    }

    }

}

