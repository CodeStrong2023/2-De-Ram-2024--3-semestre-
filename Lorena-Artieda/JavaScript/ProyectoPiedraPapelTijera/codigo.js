//1 SERA PIEDRA / 2 SERA PAPEL / 3 SERA TIJERA

function aleatorio(min,max){
    return Math.floor(Math.random()*(max - min +1) + min)
}

function eleccion(jugada){
    let resultado = ""
    if(jugada ==1){
        resultado = "Piedra ✊"
    } 
    else if(jugador ==2){
        resultado = "Papel🖐"
    }
    else if(jugador ==3){
        resultado = "Tijera ✌"
    }
    else {
        resultado = "Mal elegido"
    }
    return resultado
}

    let jugador = 0
    let pc = 0
    let triunfos = 0
    let perdida = 0

    

    while(triunfos < 3 && perdida<3){
        pc = aleatorio(1,3)
        jugador = prompt("Elige : 1 piedra, 2 papel 3 tijera")
        
        //Alert("Elige jugador"+ jugador)
    
    alert("Pc elige: "+ eleccion(pc))
    alert("Tu eliges: "+ eleccion(jugador))
    
    //Combate

    if (pc == jugador){
        alert ("Empate")
    }
    else if( jugador == 1 && pc ==3){
        alert("Ganaste!!!")
        triunfos++
    }
    else if(jugador == 2 && pc ==1){
        alert("Ganaste!")
        triunfos++
    }
    else if(jugador == 3 && pc ==2){
        alert("Ganaste!!")
        triunfos++

    }
    else{
        alert("Perdistee!!")
        perdidas++
    }
    }
    

    alert("Ganaste! "+ triunfos + " veces. Perdiste: "+ perdida+ " veces.")