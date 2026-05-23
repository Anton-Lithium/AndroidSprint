fun main() {
    val trainingDayNumber = 5
    println("Упражнения для рук: ${trainingDayNumber % 2 > 0}\n" +
            "Упражнения для ног: ${!(trainingDayNumber % 2 > 0)}\n" +
            "Упражнения для спины: ${!(trainingDayNumber % 2 > 0)}\n" +
            "Упражнения для пресса: ${trainingDayNumber % 2 > 0}")
}