package strings

fun String.lastCharOf() : Char = get(length - 1)

fun List<String>.firstElement(): String = get(0)

fun String.allMatchesOf(pattern: String) : List<String> {
    val ret = mutableListOf<String>()
//    val html = "<html><head>hello</head><h1><p>Great!<br></html>"
//    val regexp = """<[^>/]+>"""
    val found = pattern.toRegex().findAll(this)
    for (result in found) {
//        println(result.value)
        ret.add(result.value)
    }
    return ret
}

fun main(){

    val html = "<html><head>hello</head><h1><p>Great!<br></html>"
    val regexp = """<[^>/]+>"""
    html.allMatchesOf(regexp).forEach{println(it)}
    println("Java".lastCharOf())
    println(listOf("one", "two").firstElement())
}

