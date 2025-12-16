fun main(){
   var result=  analisisVector2(2.0F,3.0F,4.0F,5.0F,6.0F,78.0F,)
    println(result)
    var result2 = valorAbsolut2(-2)
    println(result2)
}
fun analisisVector2(vararg a : Float): Triple<Float, Float, Float>{
    var min : Float = a[0]
    var max : Float = a[0]
    var sum : Float = 0.0f

    for(i in 0 until a.size){
        sum =+ a[i]
        if(min > a[i]){
            min = a[i]
        }
        if(max < a[i]){
            max= a[i]
        }
    }
    var mitjana = sum/a.size
    return Triple(min,max,mitjana)

}
fun valorAbsolut2(a: Int): Int{
    var absolut : Int
    if(a > 0){
        absolut = a
    }else {
        absolut = a * -1
    }
    return absolut
}