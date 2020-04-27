/**
 * вспомогательный класс для вывода логов
 */
class Log {

    companion object {

        // принимает сообщение сообщая, что действие завершено
        fun <T> s(message: T) {
            println("[SUCCESS] $message")
        }


        // принимает сообщение и печает строку в консоль
        fun <T> m(message: T) {
            println("[INFO] $message")
        }

        // принимает лист сообщений и циклом выводит в консоль
        fun <T> m(message: List<T>) {
            message.forEach { _ ->
                println("[INFO] $message")
            }
        }
    }
}