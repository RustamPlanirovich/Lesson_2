fun fizzBuzz(data: Int): String {

    when {
        data % 3 == 0 && data % 5 == 0 -> return "$data: FizzBuzz"
        data % 3 == 0 -> return "$data: Fizz"
        data % 5 == 0 -> return "$data: Buzz"
        else -> return "$data: "
    }
}

fun main(){

    for (i in 1..25) {
        println(fizzBuzz(i))
    }
}
