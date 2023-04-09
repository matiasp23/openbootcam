//Bucles

/*for (inicializacion; condicion; actualizacion ) {
    //esto es el bucle
}
*/

/*for (let i=0; i<10; i++){
  console.log("El valor de i es"+i)
}

let lista = [1,5,6,8,4,10,6];
for(let i=0; i<lista.length; i++){
    console.log(lista[i])
}

//estructura for....of

for (let valor of lista){
    console.log(valor)
}*/


//estructura forEach

let lista = [1,5,6,8,4,10,6];

lista.forEach(valor => {
    console.log(valor)
})

//Estructura for...in

let persona = {
    Nombre:"Matias",
    Edad:33,
    Altura:170
} 

for(let propiedad in persona) {
    console.log(persona[propiedad]);
}


