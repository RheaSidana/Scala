trait Animal
{
    def pet_animal() : Unit
    def pet_color() : Unit
    def pet_sound() : Unit 
}

// MyClass inherits trait
class Dog extends Animal
{
      
    // Implementation of methods of MyTrait
    def pet_animal() = {
        println("Pet_animal: Dog")
    }
      
    def pet_color() = {
        println("Pet_color: White")
    }
      
    // Class method
    def pet_name() = {
        println("Pet_name: Dollar")
    }
  
    def pet_sound() = {
        println("Pet_sound : Bhow Bhow")
    }
} 
  
object Main 
{
      
    // Main method
    def main(args: Array[String]) = {
        val obj = new Dog();
        obj.pet_animal();
        obj.pet_color();
        obj.pet_name();
        obj.pet_sound();
    }
}
