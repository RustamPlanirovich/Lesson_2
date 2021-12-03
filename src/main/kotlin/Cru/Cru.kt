package Cru

enum class Cru(val level: Int) {

    CRU(80), PREMIER(90), GRAND(100);

    override fun toString() = when (this) {
        CRU -> "Base cru"
        PREMIER -> "Premier cru"
        GRAND -> "Grand cru"
    }

}

fun main() {
    println(Cru.PREMIER)
    println(Cru.PREMIER.level)
    Cru.values().forEach { println(it) }
    val cru = Cru.valueOf("CRU")
    println(cru)
}