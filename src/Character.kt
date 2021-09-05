open class Character(

    // this name var can be accessed directly on the created object outside the class
    public var classType: String,
    ) {
    init {
        println("Created a new character of type $classType")
    }

    // getName
    fun getClassType(){
        println("I am a $classType")
    }

    // batle
    fun battle(char_1:Character, char_2:Character){

    }



}