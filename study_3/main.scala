object main extends App{
    val people = List(
        "Bill",
        "Candy",
        "Karen",
        "Leo",
        "Regina"
    )
    people.foreach(println)
    val ratings = Map(
        "Lady in the Water" -> 3.0,
        "Snakes on a Plane" -> 4.0,
        "You, Me and Dupree" -> 3.5
    )
    for ((name,ratings) <- ratings) println(s"Movie: $name, Rating: $ratings")
    ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
}
}