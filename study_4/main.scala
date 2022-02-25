import scala.io.StdIn.readLine

object main extends App{
    val name = readLine()
    def check(namec:String): String = namec match{
        case "1" => "1,check"
        case "2" => "2,check"
    }
    val check1 = check(name)
    println(check1)
}