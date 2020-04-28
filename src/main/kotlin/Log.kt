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
        fun <T> i(message: T) {
            println("[INFO] $message")
        }
    }
}