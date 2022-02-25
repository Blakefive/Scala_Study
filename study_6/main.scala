object main extends App{
    def addThenDouble(a: Int, b: Int) = {
        val sum = a + b
        val doubled = sum * 2
        doubled
    }
    println(addThenDouble(2,3))

}