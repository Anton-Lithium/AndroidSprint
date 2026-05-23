const val IS_WEATHER_SUNNY = true
const val IS_AWNING_OPEN = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {
    val sunWeatherNow = true
    val isAwningOpenNow = true
    val airHumidityNow = 20
    val season = "зима"
    val result = sunWeatherNow == IS_WEATHER_SUNNY && isAwningOpenNow == IS_AWNING_OPEN &&
            airHumidityNow == FAVORABLE_AIR_HUMIDITY && season != WINTER_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}