fun main() {
    fun printFavoriteBook(book: String?) {
        if (book == null) {
            println("У меня нет любимой книги")
        } else {
            println("Моя любимая книга: $book")
        }
    }

    fun divideIfWhole(dividend: Int, divisor: Int): Int? {
        return if (divisor == 0) {
            null // деление на ноль
        } else {
            if (dividend % divisor == 0) {
                dividend / divisor
            } else {
                null
            }
        }
    }

    fun countDivisions(dividend: Int, divisor: Int): Int {
        if (divisor == 0) {
            return 0 // деление на ноль
        }
        var count = 0
        var current = dividend
        while (current % divisor == 0) {
            count++
            current /= divisor
        }
        return count
    }

    val array = arrayOf("Привет", "как", null, "дела")
    val filteredArray = array.filterNotNull()
    println("Ненулевые элементы массива:")
    filteredArray.forEach { println(it) }

    printFavoriteBook("1984")
    printFavoriteBook(null)

    val dividend = 20
    val divisor = 5
    val result = divideIfWhole(dividend, divisor)
    println("Результат деления $dividend на $divisor: $result")

    val count = countDivisions(100, 10)
    println("Количество делений 100 на 10 без остатка: $count")
}