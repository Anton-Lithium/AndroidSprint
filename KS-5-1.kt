fun main() {
    val firstNumber = (0..10).random()
    val secondNumber = (0..10).random()
    println("Подтвердите, что вы не робот, сложите два числа: $firstNumber + $secondNumber")
    val resultNumber = readln().toInt()
    if (resultNumber == (firstNumber + secondNumber)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}