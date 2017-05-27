import java.util.*

/**
 * Created by drwill on 5/18/17.
 */


data class Person(var name:String = "John Doe", var age:Int = 17);

open class Rectangle(var height: Int=5, var width: Int=5){
    fun getArea(): Int = height*width
    override fun toString(): String {
        return "Rectangle(height=$height, width=$width)"
    }
    fun getPerimeter():Int = (2*height)+(2*width)
}

class Square(var side:Int=5):Rectangle(side,side){
    override fun toString(): String {
        return "Square(side=$side)"
    }
}

fun main(args: Array<String>) {

    val jane = Person("Jane", 42)
    val john = Person()
    println("Hello World!")
    println(jane.name)

    println(jane)
    jane.name = "Bob"

    println(jane)
    println(john)

    val obj1 = Rectangle(4,5)
    println("Area of "+obj1+" is "+obj1.getArea())
    println("Perimeter of "+obj1+" is "+obj1.getPerimeter())

    val obj2 = Square(7)
    println("Area of "+obj2+" is "+obj2.getArea())
    println("Perimeter of "+obj2+" is "+obj2.getPerimeter())

    var obj3:Rectangle = Square(8)

    println(obj3)

    obj3 = Square()

    println(obj3)

    val names = ArrayList<String>()

    println("\nMy collection of names:\n")
    names.add("Carl")
    names.add("Will")
    names.add("Bob")
    names.add("Alex")
    names.add("Tom")

    for (name in names) println("My name is "+name)

    names.sort()
    println("\nAnd now sorted:\n")

    for (name in names) println("My name is "+name)

    var sentence = "This is a test of the emergency broadcast system."

    var words:ArrayList<String> = sentence.split(" ") as ArrayList<String>

    words.sort()

    for (word in words) println("The words are: "+word)

    Collections.sort(words, String.CASE_INSENSITIVE_ORDER);

    for (word in words) println("The words are: "+word)




}

