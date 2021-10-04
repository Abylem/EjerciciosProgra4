package com.example.abbyrproject

class Dado(var valor:Int) {
    fun comprobarDado(){
     if (valor>0&&valor<8){
         println(valor)
     }else{
         valor=1
         println("El valor del dado es: "+valor)
     }
 }
    fun GenNum(){
        MosNumAle(numAle= (1..6).random())
    }
    fun MosNumAle(numAle:Int){
        println("El numero aleatorio entre 1 y 6 es de: "+numAle)
    }
}