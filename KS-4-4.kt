fun main() {
    val trainingDayNumber = 5
    val isOddDay = trainingDayNumber % 2 > 0
    println("Упражнения для рук: $isOddDay\n" +
            "Упражнения для ног: ${!isOddDay}\n" +
            "Упражнения для спины: ${!isOddDay}\n" +
            "Упражнения для пресса: $isOddDay ")
}