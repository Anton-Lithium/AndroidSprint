fun main() {
    val currentNumber1 =(0..42).random()
    val currentNumber2 =(0..42).random()
    println("Добро пожаловать в лотерею!")
    println("Вам нужно угадать два числа от 0 до 42.")
    println("Если угадаете хотя бы одно — получите утешительный приз!")
    print("Введите первое число (от 0 до 42):")
    val userNumber1 = readln().toInt()
    print("Введите второе число (от 0 до 42):")
    val userNumber2 = readln().toInt()
    if ((currentNumber1 == userNumber1 && currentNumber2 == userNumber2) ||
        (currentNumber2 == userNumber1 && currentNumber1 == userNumber2)) {
        println("Поздравляем! Вы выиграли главный приз!\nЗагаданные числа $currentNumber1 и $currentNumber2")
    } else if (currentNumber1 == userNumber1 || currentNumber2 == userNumber2 ||
        currentNumber1 == userNumber2 || currentNumber2 == userNumber1) {
        println("Вы выиграли утешительный приз!\nЗагаданные числа $currentNumber1 и $currentNumber2")
    } else {
        println("Неудача!\nЗагаданные числа $currentNumber1 и $currentNumber2")
    }
}