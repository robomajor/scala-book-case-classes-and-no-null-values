import scala.util.{Try,Success,Failure}

object TrySuccessFailure extends App {

  def toInt(s: String): Try[Int] = Try(Integer.parseInt(s.trim))

  println(toInt("1"))
  println(toInt("a"))

  toInt("x") match {
    case Success(i) => println(i)
    case Failure(s) => println(s"Failed. Reason: $s")
  }
}
