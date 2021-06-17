import java.util.concurrent.TimeUnit
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

@main def multipleFutures1 =
  
  def myFutureNumber(): Int = {
    Thread.sleep(2000)
    23
  }
  
  val myFutureNumberF: Future[Int] = Future {
    myFutureNumber()
  }
  //println("Before maxWaitTime");
  val maxWaitTime: FiniteDuration = Duration(3, TimeUnit.SECONDS)
  //println("After maxWaitTime");
  val magicNumber: Int = Await.result(myFutureNumberF, maxWaitTime)
  //println("After magicNumber");
  myFutureNumberF.onComplete{
    case Success(x) =>
      println("Number : "+(x*9));
    case Failure(e) =>
      e.printStackTrace
  }
  
