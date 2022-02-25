object main extends App{
    class Socket(var timeout: Int = 2000, var linger: Int = 3000){
        override def toString = s"timeout: $timeout linger: $linger"
        println(this)
    }
    val q1 = new Socket()
    val q2 = new Socket(1000)
    val q3 = new Socket(4000,5000)
}
