object main extends App{
    def countcheck(N: Int): Int = {
        var check = 0
        for(i <- 0 until N; if N % i == 0)
            check = check + 1
        return check
    }
    var count = 0
    for(i <- 0 to 1000; if countcheck(i) == 1)
        count = count + 1
    println(count)
}