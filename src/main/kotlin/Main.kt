/**
 * A programme for a basic calculator operations
 * @author amina.m
 * @since 14/12/2025
 */
fun main() {
    var opcion: Int

    do {
        mostraMenu()
        opcion = triaOpcioMenu()
        gestionaMenu(opcion)
    } while (opcion != 0)
}

/**
 * A function to display the  menu options
 * @author amina.m
 * @since 14/12/2025
 */
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
        | 8 -> Valor Absolut
        | 9 -> SumaiMultiplica Pair
        | 10 -> Max,Min i Mitjana
        | 0 -> Sortir
    """.trimIndent())

}
/**
 * A function to manage User's selection of the menu options
 * @author amina.m
 * @since 14/12/2025
 * @return the option of menu (Int)
 */
fun triaOpcioMenu(): Int {
    println("Elige una opcion del menu")
    return learNumAmbRango(0, 10)
}

/**
 * A function to manage all the options of menu
 * @author amina.m
 * @since 14/12/2025
 * @param opcio the option of menu to do the operation (Int)
 */
/* ---------- Gestion del Menu ---------- */
fun gestionaMenu(opcio: Int) {
    when (opcio) {
        1 -> {
            val (num, num2) = leerDosElements()
            val resultat = suma(num, num2)
            println("Resultat: $resultat")
        }
        2 -> {
            val (num, num2) = leerDosElements()
            val resultat = resta(num, num2)
            println("Resultat: $resultat")
        }
        3 -> {
            val (num, num2) = leerDosElements()
            val resultat = multiplicacio(num, num2)
            println("Resultat: $resultat")
        }
        4 -> {
            val (num, num2) = leerDosElements()
            if (num2 == 0) {
                println("No se puede dividir con 0")
            } else {
                val resultat = divisio(num, num2)
                println("Resultat: $resultat")
            }
        }
        5 -> {
            val a = leerUnElement()
            val resultat = quadratt(a)
            println("Resultat: $resultat")
        }
        6 -> {
            val a = leerUnElement()
            if (a < 0) {
                println("No se puede hacer arrel quadrat de un numero negativo")
            } else {
                val resultat = arrelQuadrada(a)
                println("Resultat: $resultat")
            }
        }
        7 -> {
            val a = leerUnElement()
            if (a < 0) {
                println("El factorial no puede ser negativo")
            } else {
                val resultat = factorial(a)
                println("Resultat: $resultat")
            }
        }
        8 -> {
            val a = leerUnElement()
            val resultat = valorAbsolut(a)
            println("Resultat: $resultat")
        }
        9 -> {
            val (num, num2) = leerDosElements()
            val resultat = sumayproduct(num, num2)
            println("Resultat: $resultat")
        }
        10 -> {
            val (min, max, media) =  analisisVector(1,12,125,129,1244,123,123)
            println("Valor Min: $min")
            println("Valor Max: $max")
            println("Valor Mintjana: $media")
        }
        0 -> println("Sortir del programma")
    }
}

/**
 * This method is used to check that a number is within a given range
 * @author amina.m
 * @since 14/12/2025
 * @param min Minimun value of the range (Int)
 * @param max Maximum value of the range (Int)
 * @return num the number after checking its within range (Int)
 */
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
/**
 * This method is used to read a number (Int)
 * @author amina.m
 * @since 14/12/2025
 * @return a whole number (Int)
 */
fun leerUnElement(): Int {
    var num: Int?
    do {
        println("Introduce un numero:")
        num = readln().toIntOrNull()
        if (num == null) println("Error: introduceun numero entero")
    } while (num == null)
    return num

}
/**
 * This method is used to read two numbers at a time
 * @author amina.m
 * @since 14/12/2025
 * @return a Pair of values type of Int
 */
fun leerDosElements(): Pair<Int, Int> {
    val a = leerUnElement()
    val b = leerUnElement()
    return Pair(a, b)
}
/**
 * This method is used add two numbers (Int)
 * @author amina.m
 * @param a a number (Int)
 * @param b a number (Int)
 * @since 14/12/2025
 * @return a whole number (Int)
 */
fun suma(a: Int, b: Int): Int{
    return a + b
}
/**
 * This method is used to subtract two numbers (Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @param b a number (Int)
 * @return a whole number (Int)
 */
fun resta(a: Int, b: Int): Int{
    return a - b
}
/**
 * This method is used to multiply two numbers (Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @param b a number (Int)
 * @return a whole number (Int)
 */
fun multiplicacio(a: Int, b: Int): Int{
    return  a * b
}
/**
 * This function is used to divide two numbers (Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @param b a number (Int)
 * @return a whole number (Int)
 */
fun divisio(a: Int, b: Int): Int {
    return a / b
}
/**
 * This function is used to calculate the square of a numbers (Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @return a whole number (Int)
 */
fun quadratt(a: Int): Int {
    return  a * a
}
/**
 * This function is used to give the square root of a  number (Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @return a whole number (Int)
 */
fun arrelQuadrada(a: Int): Double {
    return kotlin.math.sqrt(a.toDouble())
}
/**
 * This function is used to calculate the factorail of a number(Int)
 * @author amina.m
 * @since 14/12/2025
 * @param a a number (Int)
 * @return a whole number (Int)
 */
fun factorial(a: Int): Int {
    var resultat = 1
    for (i in 1..a) {
        resultat *= i
    }
    return resultat
}
/**
 * This function is used to calculate the absolute value of a number (Int)
 * @author amina.m
 * @since 16/12/2025
 * @param a a number (Int)
 * @return a whole number (Int)
 */
fun valorAbsolut(a: Int): Int{
    var absolut : Int
    if(a > 0){
        absolut = a
    }else {
        absolut = a * -1
    }
    return absolut
}
/**
 * This function is used to calculate the sum and product of numbers and return a pair(Float)
 * @author amina.m
 * @since 16/12/2025
 * @param a a number  (Float)
 * @param b a number  (Float)
 * @return a pair of numbers (Float)
 */
fun sumayproduct(a: Int,b:Int): Pair<Int,Int>{
    var sum : Int = a + b
    var product : Int = a + b
    var result = Pair(sum,product)
    return result
}
/**
 * This function is used to calculate the min, max and average of an array(Float)
 * @author amina.m
 * @since 16/12/2025
 * @param numarray a number array (Float)
 * @return a pair of numbers (Float)
 */
fun analisisVector(vararg numarray : Int): Triple<Int, Int, Int>{
    var min : Int = numarray[0]
    var max : Int = numarray[0]
    var sum : Int = 0

    for(i in 0 until numarray.size){
        sum += numarray[i]
        if(min > numarray[i]){
            min = numarray[i]
        }
        if(max < numarray[i]){
            max= numarray[i]
        }
    }
    var mitjana = sum/numarray.size
    return Triple(min,max,mitjana)
}