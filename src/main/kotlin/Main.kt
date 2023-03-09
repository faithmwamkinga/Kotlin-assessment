fun main() {
//word("Maybe","Cat")
    //println(word(word1.indexof))
    vocabulary()
    println(vocabulary())




    var calculator = Calculator()
    println(calculator.addition(45,56))
    println(calculator.subtraction(86,23))
    println(calculator.division(40,2))
    println(calculator.multiplication(78,67))
}
//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
//fun word (word1:String, word2:String):String{
 //return word
//}
//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun vocabulary():String{
    var first =  arrayOf("dog", "cow")
    var second = arrayOf("elephant", "lion")
    var third = arrayOf("$first $second")
    return vocabulary()



}

class Calculator(){
    fun addition(num1:Int, num2:Int){
        var sum = num1 + num2
        println(sum)
    }
fun subtraction (num3:Int, num4:Int){
    var difference = num3 - num4
    println(difference)
}
    fun division (num5:Int, num6:Int){
        var dividing = num5 / num6
        println(dividing)

    }
    fun multiplication(num7:Int, num8:Int){
        var product = num7 * num8
        println(product)
    }
}