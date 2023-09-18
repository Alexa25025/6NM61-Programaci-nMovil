import kotlin.math.pow
//Declarar una variable const val con el valor de PI
const val PI = 3.1416
fun main() {
    //Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo
    //Se asigna DOUBLE por defecto
    val Decimal = 5.894f
    println(Decimal)
    //Volver flotante a la variable decimal

    //Multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    val r = PI*Decimal.pow(2)

    //Para el ejemplo anterior, utilizar un String Template para imprimir el texto
    // "El perímetro del círculo es: [resultado]" siendo resultado nuestra variable perímetro.
    println("El perímetro del círculo es: $r")
}