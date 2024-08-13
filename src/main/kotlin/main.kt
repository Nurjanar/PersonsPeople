fun main() {
    println("Введите количество likes : ")
    val input = readlnOrNull()
    val persons = arrayOf("людям", "человеку")
    if (!input.isNullOrEmpty()) {
        val likes = input.toInt()
        val lastDigit = likes % 10
        if (lastDigit == 1) {
            println("Понравилось $likes ${persons.get(1)}")
        } else {
            println("Понравилось $likes ${persons.get(0)}")
        }
    }
}