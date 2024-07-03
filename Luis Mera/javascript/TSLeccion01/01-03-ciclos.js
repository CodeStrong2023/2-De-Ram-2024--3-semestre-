//while
let contador = 0;
while(contador<3){
    console.log(contador);
    contador++;
}
console.log("Fin de ciclo while");

// do while
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin de ciclo while");

//for
for(let contando = 0; contando < 3; contando++){
    console.log(contando);
}

console.log("fin ciclo for")

//break
for(let contando = 0; contando <= 10; contando++ ){

    if(contando % 2==0){
        console.log(contando);
        break;
    }
}
console.log("fin del ciclo for")

do{
    console.log(conteo);
    conteo++;
    break;
}while(conteo < 3);
console.log("Fin de ciclo while");

// continue

for(let contando = 0; contando <= 10; contando++){

    if(contando % 2!==0){
        continue; // continua a la siguien iteración
    }
    console.log(contando)
}
console.log("termina el ciclo")

// etiquetas labels
inicio:
for(let contando = 0; contando <= 10; contando++){

    if(contando % 2!==0){
        break inicio; // continua a la siguien iteración
    }
    console.log(contando)
}
console.log("termina el ciclo")