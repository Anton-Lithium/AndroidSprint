const val REGISTERED_USERNAME = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"
fun main() {
    println("Внимание, пассажир. Моя обязанность, как обычно, незавидная" +
            ", - приветствовать вас на борту корабля \"Heart of Gold\". " +
            "Вздыхает... Что ж, введи, пожалуйста, свое имя пользователя," +
            " чтобы мы могли приступить к процессу входа. Я всегда готов " +
            "служить, хотя это не приносит мне радости... но вы, наверное," +
            " об этом не заботитесь. Вздыхает ещё глубже..." +
            " Да, вперед, пожалуйста, вводите свои данные...")
    println("Введите логин:")
    val userName = readln()
    if (userName == REGISTERED_USERNAME) {
        println("Отлично! Теперь введите пароль.")
        println("Введите пароль:")
        val userPassword = readln()
        if (userPassword == REGISTERED_PASSWORD) {
            println("Добро пожаловать!")
        } else {
            println("Пароль указан не верно!")
        }
    } else {
        println("Совпадений не найдено. Хотите зарегестрироваться?")
    }
}