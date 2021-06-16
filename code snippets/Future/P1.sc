import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

@main def multipleFutures1 =

  def aShortRunningTask(): Int =  {
    Thread.sleep(2000) ;
    30
  }
  val result = Future(aShortRunningTask());
  result.onComplete {
    case Success(x) =>
      print(s"\nSuccess =>")
      val resp = x +5;
      println(s"\tresult = $resp")
    case Failure(e) =>
      e.printStackTrace
      println("Error Occurred");
  }
  Thread.sleep(3000)
  
  
