trait MyTrait
{
    def pet() : Unit
    def pet_color() : Unit
}
  
// MyClass inherits trait
class MyClass extends MyTrait
{
      
    // Implementation of methods of MyTrait
    def pet() = {
        println("Pet: Dog")
    }
      
    def pet_color() = {
        println("Pet_color: White")
    }
      
    // Class method
    def pet_name() = {
        println("Pet_name: Dollar")
    }
} 
  
object Main 
{
      
    // Main method
    def main(args: Array[String]) = {
        val obj = new MyClass();
        obj.pet();
        obj.pet_color();
        obj.pet_name();
    }
}
