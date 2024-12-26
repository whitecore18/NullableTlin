fun printFavoriteBook(bookTitle: String?) {
    if (bookTitle == null) {
        println("У меня нет любимой книги")
    } else {
        println("Моя любимая книга: $bookTitle")
    }
}

fun DivideIfWhole(numerator: Int, denominator: Int): Int? {
    if (denominator == 0) {
        return null // избегаем деления на ноль
    }
    return if (numerator % denominator == 0) {
        numerator / denominator
    } else {
        null
    }
}

fun main() {

    printFavoriteBook("1984")
    printFavoriteBook(null)

    val array = arrayOf("Привет", "как", null, "дела")

    val filteredArray = array.filterNotNull()

    println("Элементы массива без null:")
    for (element in filteredArray) {
        println(element)
    }

    val result1 = DivideIfWhole(10, 2) ?: 0
    println("Результат деления 10 на 2: $result1")

    val result2 = DivideIfWhole(10, 3) ?: 0
    println("Результат деления 10 на 3: $result2")

    val result3 = DivideIfWhole(10, 0) ?: 0
    println("Результат деления 10 на 0: $result3")
}