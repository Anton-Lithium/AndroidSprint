const val IS_WEATHER_SUNNY = true
const val IS_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "зима"
    val isFavorableConditions = isSunnyWeather == IS_WEATHER_SUNNY && isAwningOpen == IS_AWNING_OPEN &&
            airHumidity == FAVORABLE_AIR_HUMIDITY && season != WINTER_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}