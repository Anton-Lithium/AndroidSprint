import java.time.LocalDate
const val AGE_OF_MAJORITY = 18
fun main() {
    val currentYear = LocalDate.now().year
    println("В каком году Вы родились?")
    val yearBirth = readln().toInt()
    if (currentYear - yearBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ запрещен.")
}