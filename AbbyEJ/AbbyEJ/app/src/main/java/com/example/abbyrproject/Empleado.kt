package com.example.abbyrproject

class Empleado(val nombre:String,val sueldo:Int,val Area:String,val Cargo:String,
               val tiempoTrabajo:Int) {
    fun comprobarSueldo(){
        if(sueldo<0||tiempoTrabajo<0){
            println("El valor ingresado en sueldo es:$sueldo y no puede ser menor que 0")
        }else{
            println("El sueldo es: $"+(sueldo+25*tiempoTrabajo))
        }
    }
    fun comprobarAreaCargo(){
        if(Area==""&&Cargo==""){
            println("El valor ingresado en Area y sueldo estan vacios por favor ingrese un valor")
        }else{
            println("El area es: $Area\nEl cargo que desempeña es: $Cargo")
        }
    }


}