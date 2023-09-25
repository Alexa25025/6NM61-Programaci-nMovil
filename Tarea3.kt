fun main() {
   var x1 = 4f
    var y1= 3f
    var x2= -3f
    var y2= -2f

    val m = (y2 - y1)/(x2 - x1)

    println("La pendiente es: $m")

    //Del ejercicio anterior,
    //responder: ¿Por qué el resultado obtenido difiere del resultado esperado?
    // Respuesta : Que las variables asignadas las está tomando como dato tipo entero cuando deberia ser flotante pára los decimales
}