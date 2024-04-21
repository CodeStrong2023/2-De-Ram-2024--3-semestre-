//Ciclo While

let contador = 0;
while(contador<3){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

//Ciclo do while

contador=0;
do{ console.log(contador)
    contador++;
}while(contador<3)
console.log("Fin del ciclo do while")

//Ciclo for

for(let i= 0; i<3; i++){
    console.log(i);
}
console.log("Fin del ciclo For");

//Uso de la palabra reservada BREAK

for(let i =0 ; i<10;i++){
    if(i%2 ==0){
        console.log(i);
        break;
    }
}
console.log("Termina el ciclo al encontrar los pares");

//Uso de la palabra reservada CONTINUE y de las etiquetas LABEL
inicio:
for(let i=0; i<10;i++){
    if(i%2 !== 0){
        continue inicio;//Ignora los numeros impares
    }
    console.log(i);       
}
console.log("Termina el ciclo for");



 


