import scala.io.StdIn.readInt

object main extends App{
    var a = 0;
    var v: List[Int] = List()
    for(a <- 0 to 9){
        var N = readInt()
        if(a+1 == 1 || a+1 == 4 || a+1 == 7){
            v = v:+N
        }
    }
    for(a <- 0 to 2){
        print(v(a))
        print(" ")
    }
}
