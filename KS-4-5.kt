fun main() {
    val hull = readln().toBoolean()
    val crew = readln().toInt()
    val provisions = readln().toInt()
    val isStorming = readln().toBoolean()

    val isHullIntact = !hull
    val hasEnoughCrew = crew in 55..70
    val hasRecomendedCrew = crew == 70
    val hasSufficientProvisions = provisions > 50
    val isWeatherSafe = !isStorming

    val canDepartLongVoyage = (isHullIntact && hasEnoughCrew && hasSufficientProvisions && isWeatherSafe)
            || (isHullIntact || (hasRecomendedCrew && hasSufficientProvisions && isWeatherSafe))

    if (canDepartLongVoyage) {
        println("Корабль готов к отплытию")
    } else {
        println("Корабль не готов к отплытию")
    }
}