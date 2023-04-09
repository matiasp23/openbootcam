//estructura de control if else

if (true) {
    console.log("Es verdadero")
}

if(false){
    console.log("Es verdadero")
} else {
    console.log("Es falso")
}

let saldo = 50;
let efectivo = 20;

if (efectivo<saldo){
    console.log("Puedes sacar dinero")
} else {
    console.log("Saldo insuficiente")
}


// if else if

let nota = 2;

if(nota===5) {
    console.log("Aprobado sobresaliente");
} else if(nota===4){
    console.log("Aprobado");
} else if(nota<3){
    console.log("No aprobaste")
}

// Sentencia switch

switch(nota){
    case 5:
        console.log("Aprobaste genial");
        break;
    case 4:
        console.log("Aprobado por poco");
        break;
    case 3:
        console.log("Lastima, no aprobaste");
        break;      
    default:
        console.log("Default")
        break;
}
