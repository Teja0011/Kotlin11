/*fun main() {

    val radius = 5

    for (i in -radius..radius) {
        for (j in -radius..radius) {

            val distance = i * i + j * j

            if (distance >= radius * radius - 2 &&
                distance <= radius * radius + 2
            ) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
}*/
//Star Pattern

fun main() {

    for (i in 0 until 6) {

        for (j in 0 until i) {
            print(" ")
        }

        for (j in i until 6) {
            print("* ")
        }

        println()
    }
}