fun main() {
    val currentNumber1 =12 //(0..42).random()
    val currentNumber2 =21 //(0..42).random()
    println("Добро пожаловать в лотерею!")
    println("Вам нужно угадать два числа от 0 до 42.")
    println("Если угадаете хотя бы одно — получите утешительный приз!")
    print("Введите первое число (от 0 до 42):")
    val userNumber1 = readln().toInt()
    print("Введите второе число (от 0 до 42):")
    val userNumber2 = readln().toInt()
    //val firstCoincidence = (currentNumber1 == userNumber1) || (currentNumber2 == userNumber1)
    //val secondCoincidence = (currentNumber1 == userNumber2) || (currentNumber2 == userNumber2)
    if ((currentNumber1 == userNumber1 && currentNumber2 == userNumber2) ||
        (currentNumber2 == userNumber1 && currentNumber1 == userNumber2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (currentNumber1 == userNumber1 || currentNumber2 == userNumber2 ||
        currentNumber1 == userNumber2 || currentNumber2 == userNumber1) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}