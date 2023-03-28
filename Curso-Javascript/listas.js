//lista, array, arreglo

const lista = [1, "hola", true, undefined, null];
const lista2 = new Array(1, "hola", true, undefined, null);
const lista3 = new Array(); 
lista3[0] = "Elemento indice cero";
const lista4 = [lista, lista2, lista3];

//console.log(lista4);

//objetos

const movil = {
    altura: 10,
    anchura: 5,
    marca: "xiaomi",
    color: "blanco",
    contactos: ["Matias", "Ezequiel", "Marcos"],
    tarjeta: {
        marca: "king",
        almacenamiento: 128
    }
}

// a continuación se cambia el valor del atributo "altura"

movil.altura = 15;

//console.log(movil.altura);
//console.log(movil.tarjeta.marca);


//fechas
// liberia de apoyo Moment.js
const ahora = new Date();
console.log(ahora);

