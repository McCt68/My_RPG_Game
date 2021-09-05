//
fun main() {

    createAdventurer("Cleric1")
    createAdventurer("Warrior1")


    // Create char from class
    //var realCleric = Cleric("realCleric")
    //realCleric.getClassType()
}

fun createAdventurer(nameHolder:String){
    println("Please enter Character name: ")
    var readCharName = readLine().toString()
    println("Please enter class type: 1 = Cleric, 2 = Warrior, 3 = Magician: ")
    var readNumber = readLine()
    var adventurer = readNumber?.toInt()
    when (adventurer ){
        1 -> Cleric(readCharName)
        2 -> Warrior(readCharName)
        3 -> Magician(readCharName)
        4 -> Character("testClass")
        else -> println("That is not a numeric input!")

    }

}