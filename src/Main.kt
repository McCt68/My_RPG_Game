//
fun main() {

    createAdventurer()

    // git test 1


    //creating a charecter object
//    var valentin = Character("Valentin", 52)
//
//    valentin.getClassType()
//
//    valentin.getClassType()
//
//    // we can access this directly because it is public in the constructor
//    println(valentin.classType)
    // println(valentin.hitPoints) - Can not access this because it is private in the constructor

//    var Tuznelda = Cleric("Tuznelda")
//    Tuznelda.getClassType()
}

fun createAdventurer(){
    println("Hello please enter class type: 1 = Cleric, 2 = Warrior, 3 = Magician: ")
    var readNumber = readLine()
    var adventurer = readNumber?.toInt()
    when (adventurer ){
        1 -> Cleric("Cleric_1", 25)
        2 -> Warrior("Warrior_1", 25)
        3 -> Magician("Magician_1", 25)
        else -> println("That is not a numeric input!")
        //var firstCleric = Cleric("Bente", 25)

    }

}