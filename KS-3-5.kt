fun main() {
    val chessMove = "D2-D4;0"
    val param = chessMove.split("-",";")
    val startTurn = param[0]
    val finishTurn = param[1]
    val numTurn = param[2]
    println(startTurn)
    println(finishTurn)
    println(numTurn)
}