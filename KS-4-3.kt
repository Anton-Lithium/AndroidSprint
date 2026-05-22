const val SUN_WETHER = true
const val OPEN_TURP = true
const val AIR_HUMIDITY = 20
const val WINTER = "зима"
fun main() {
    val sunWetherNow = true
    val openTrupNow = true
    val airHumidityNow = 20
    val season = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых?" +
            "${sunWetherNow == SUN_WETHER && openTrupNow == OPEN_TURP &&
                    airHumidityNow == AIR_HUMIDITY && season != WINTER}")
}