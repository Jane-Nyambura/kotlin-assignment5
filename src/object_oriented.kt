fun main() {
    var jane=Human("Nyambura",20,50.5)
    println(jane.name)
    println(jane.age)
    println(jane.weight)
    println(jane.eat(30))
    println(jane.speak("i am enough"))
    jane.birthday()
    var nyambura= Student("joy","wanjira","joy@gmail.com,",4566778,"jklmn")
    println(nyambura.firstName)
    println(nyambura.email)


}
class Human(var name:String,var age:Int,var weight:Double) {
    fun eat(foodWeight: Int): Double {
        println("I am eating $foodWeight kgs of food")
        weight = foodWeight + weight
        return weight
    }

    fun speak(speech: String): String {
        return speech
    }

    fun birthday() {
        age += 1
        println(age)
    }
}
data class Student(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String){}
