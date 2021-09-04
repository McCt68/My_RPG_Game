class Cleric(name: String, hitPoints:Int = 15)
// Using : nameOfBaseClass() to inherent from a base ( Super ) Class
// Note this will execute the init block of the Super class. We can also use methods from the Super Class now.{
    :Character(classType = "Cleric")
{
    // Init block of Class Cleric. will execute when we create a Cleric Object
    init {
        println("Hello I am a Cleric named: $name")

    }

//    // method to change name
//    fun nameChange(newName: String){
//        name = newName
//    }
}