fun main() {
    val firstNumber = 2
    val secondNumber = 3
    println("Подтвердите, что вы не робот, сложите два числа: $firstNumber + $secondNumber")
    val resultNumber = readln().toInt()
    if (resultNumber == (firstNumber + secondNumber)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}