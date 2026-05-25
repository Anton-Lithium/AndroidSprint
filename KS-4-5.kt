const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50

fun main() {
    val isDamage = readln().toBoolean()
    val crew = readln().toInt()
    val provisions = readln().toInt()
    val isWeatherGood = readln().toBoolean()

    val isHullIntact = !isDamage
    val hasEnoughCrew = crew in CREW_MIN..CREW_MAX
    val hasRecommendedCrew = crew == CREW_MAX
    val hasSufficientProvisions = provisions > PROVISION_MIN
    val isWeatherSafe = isWeatherGood

    val canDepartLongVoyage = (isHullIntact && hasEnoughCrew && hasSufficientProvisions && isWeatherSafe)
            || (!isHullIntact || (hasRecommendedCrew && hasSufficientProvisions && isWeatherSafe))

    if (canDepartLongVoyage) {
        println("Корабль готов к отплытию")
    } else {
        println("Корабль не готов к отплытию")
    }
}