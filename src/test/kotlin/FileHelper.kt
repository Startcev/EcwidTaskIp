import java.io.File
import java.io.InputStream

// класс для работы с файлами
class FileHelper {

    // функция получения списка строк из файла по указанному пути
    fun getTextLine(filePath: String): List<String> {
        val inputStream: InputStream = File(filePath).inputStream()
        val lineList = mutableListOf<String>()

        inputStream.bufferedReader().useLines { lines ->
            lines.forEach {
                lineList.add(it)
            }
        }
        return lineList
    }
}