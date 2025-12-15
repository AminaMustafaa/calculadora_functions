fun main() {
    var opcion: Int

    do {
        mostraMenu()
        opcion = triaOpcioMenu()
        gestionaMenu(opcion)
    } while (opcion != 0)
}

/* --------- Main Menu ---------- */
fun mostraMenu() {
    println("""
        |---- CALCULADORA ----
        | 1 -> Sumar
        | 2 -> Restar
        | 3 -> Multiplicar
        | 4 -> Dividir
        | 5 -> Quadrat
        | 6 -> Arrel quadrada
        | 7 -> Factorial
        | 0 -> Sortir
    """.trimIndent())

}

fun triaOpcioMenu(): Int {
    println("Elige una opcion del menu")
    return learNumAmbRango(0, 7)
}

/* ---------- Gestion del Menu ---------- */
fun gestionaMenu(opcio: Int) {
    when (opcio) {
        1 -> {
            val (num, num2) = learDosElements()
            val resultat = suma(num, num2)
            println("Resultat: $resultat")
        }
        2 -> {
            val (num, num2) = learDosElements()
            val resultat = resta(num, num2)
            println("Resultat: $resultat")
        }
        3 -> {
            val (num, num2) = learDosElements()
            val resultat = multiplicacio(num, num2)
            println("Resultat: $resultat")
        }
        4 -> {
            val (num, num2) = learDosElements()
            if (num2 == 0) {
                println("No se puede dividir con 0")
            } else {
                val resultat = divisio(num, num2)
                println("Resultat: $resultat")
            }
        }
        5 -> {
            val a = learUnElement()
            val resultat = quadratt(a)
            println("Resultat: $resultat")
        }
        6 -> {
            val a = learUnElement()
            if (a < 0) {
                println("No se puede hacer arrel quadrat de un numero negativo")
            } else {
                val resultat = arrelQuadrada(a)
                println("Resultat: $resultat")
            }
        }
        7 -> {
            val a = learUnElement()
            if (a < 0) {
                println("El factorial no puede ser negativo")
            } else {
                val resultat = factorial(a)
                println("Resultat: $resultat")
            }
        }
        0 -> println("Sortir del programma")
    }
}

/* ---------- Operations for input ---------- */
fun learNumAmbRango(min: Int, max: Int): Int {
    var num: Int?
    do {
        num = readln().toIntOrNull()
        if (num == null || num < min || num > max) {
            println("Introduce un numero entero entre $min y $max")
        }
    } while (num == null || num < min || num > max)
    return num
}

fun learUnElement(): Int {
    var num: Int?
    do {
        println("Introduce un numero:")
        num = readln().toIntOrNull()
        if (num == null) println("Error: introduceun numero entero")
    } while (num == null)
    return num

}

fun learDosElements(): Pair<Int, Int> {
    val a = learUnElement()
    val b = learUnElement()
    return Pair(a, b)
}

/* ---------- Calculator Operations ---------- */
fun suma(a: Int, b: Int): Int{
    return a + b
}

fun resta(a: Int, b: Int): Int{
    return a - b
}

fun multiplicacio(a: Int, b: Int): Int{
    return  a * b
}

fun divisio(a: Int, b: Int): Int {
    return a / b
}

fun quadratt(a: Int): Int {
    return  a * a
}

fun arrelQuadrada(a: Int): Double {
    return kotlin.math.sqrt(a.toDouble())
}

fun factorial(a: Int): Int {
    var resultat = 1
    for (i in 1..a) {
        resultat *= i
    }
    return resultat
}