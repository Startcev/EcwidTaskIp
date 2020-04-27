import java.io.File
import java.io.InputStream

/**
 * содержит алгоритмы для подсчета уникальных ip адресов
 */
class IpAddressCounter {

    companion object {

        // функция получения списка строк из файла по указанному пути
        private fun getListIpAddress(filePath: String): List<String> {
            val inputStream: InputStream = File(filePath).inputStream()
            val lineList = mutableListOf<String>()

            inputStream.bufferedReader().useLines { lines ->
                lines.forEach {
                    lineList.add(it)
                }
            }
            return lineList
        }

        // получить колличество используя функцию прямого выбора
        fun getIpAddressSizeFromMutableList(filePath: String): Int {
            val listIpAddress = getListIpAddress(filePath)
            val listUniqueIp = mutableListOf<String>()
            // проходимся по списку адресов
            listIpAddress.forEach { ipAddress ->

                // проверяем содержится ли адрес в списке
                if (!listUniqueIp.contains(ipAddress)) {

                    // добавляем адресс
                    listUniqueIp.add(ipAddress)
                }
            }
            return listUniqueIp.size
        }

        // получить колличество используя hashSet
        fun getIpAddressSizeFromHashSet(filePath: String): Int {
            val inputStream: InputStream = File(filePath).inputStream()
            val lineList = mutableSetOf<String>()

            inputStream.bufferedReader().useLines { lines ->
                lines.forEach {
                    lineList.add(it)
                }
            }
            return lineList.size
        }
    }
}