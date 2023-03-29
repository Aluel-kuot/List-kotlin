fun main() {
    //quiz1

    //quiz2
    println(people())
    //quiz3
    person()
    //quiz4
    persons()
    //quiz5
    cars()
}
//questions
//quiz1
fun words (){
    val evenIndices=listOf("one","two","three","four","five","six","seven","eight","nine","ten")
//    val even= evenIndices.filter {evenIndex -> evenIndex 2==0}



}
//quiz2
fun people():Double{
    val heights=listOf(1.3,2.0,1.5,2.1)
    var height=heights.average()
     var total=heights.sum()
    return height
    return total
}
//quiz3
data class Persons(var name:String,var age:Int,var height:Double,var weight:Double)
    fun person() {
        val person1 = Persons("Alice", 15, 1.5, 50.8)
        val person2 = Persons("Peter", 20, 2.0, 60.0)
        val person3 = Persons("Mary", 17, 1.8, 53.6)
        val personsDetails =listOf(person1, person2, person3)
        println(personsDetails)
        val people= personsDetails.sortedByDescending { person ->person.age }
        println(people)
}
//quiz4
//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go. (1 points)

data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun persons() {
    val person1 = Person("Alice", 15, 1.5, 50.8)
    val person2 = Person("Peter", 20, 2.0, 60.0)
    val person3 = Person("Mary", 17, 1.8, 53.6)
    val personsDetails = listOf(person1, person2, person3)
    println(personsDetails)
    val person4=Person("Joy",16,2.3,60.6)
    val person5=Person("Diing",23,1.8,70.0)
val added=listOf(person4,person5)
    println(added)


}
//quiz5
data class Cars(var registration:String,var mileage:Double)
fun cars(){
    val toyota = Cars("KCD 379C", 6000.77)
    val probox = Cars("KBA 769D", 7000.6)
    val bus = Cars("KCB 432A", 8000.0)
    val vehicles = listOf(toyota, probox, bus)
    println(vehicles)


}
