fun main() {
    val trainingDayNumber = 5
    val isEvenDay = trainingDayNumber % 2 == 0
    println("Упражнения для рук:    $isEvenDay\n" +
            "Упражнения для ног:    ${!isEvenDay}\n" +
            "Упражнения для спины:  ${!isEvenDay}\n" +
            "Упражнения для пресса: $isEvenDay")
}