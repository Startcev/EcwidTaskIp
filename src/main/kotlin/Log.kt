/**
 * вспомогательный класс для вывода логов
 */
object Log {

    // принимает сообщение и печает строку в консоль
    fun message(message: String) {
        println(message)
    }

    // принимает лист сообщений и циклом выводит в консоль
    fun message(message: List<String>) {
        message.forEach {
            println(it)
        }
    }
}