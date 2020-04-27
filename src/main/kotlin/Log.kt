/**
 * вспомогательный класс для вывода логов
 */
object Log {

    // принимает сообщение и печает строку в консоль
    fun message(message: String) {
        println("[INFO] $message")
    }

    // принимает лист сообщений и циклом выводит в консоль
    fun message(message: List<String>) {
        message.forEach { _ ->
            println("[INFO] $message")
        }
    }
}