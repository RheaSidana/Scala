// Trait 
trait Bird
{
    def bird_type() : Unit
    def bird_color() : Unit
    def bird_sound() : Unit 
}
trait Activity {
    def can_walk(): Unit
    def can_fly(): Unit
}
// MyClass inherits trait
class Parrot extends Bird with Activity
{
      
    // Implementation of methods of Animal
    def bird_type() = {
        println("Bird_type: Parrot")
    }
      
    def bird_color() = {
        println("Bird_color: Green")
    }
  
    def bird_sound() = {
        println("Bird_sound : Talk")
    }
    
    //implementation of methods of Activity
    def can_walk() = {
        println("Can Walk : Yes ")
    }
  
    def can_fly() = {
        println("Can Fly : Yes ")
    }
      
    // Class method
    def name() = {
        println("Parrot_name: Mickey")
    }
} 
  
object Main 
{
      
    // Main method
    def main(args: Array[String]) = {
        val obj = new Parrot();
        obj.bird_type();
        obj.bird_color();
        obj.name();
        obj.bird_sound();
        obj.can_walk();
        obj.can_fly();
    }
}
