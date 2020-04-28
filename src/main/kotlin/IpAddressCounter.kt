import java.io.File
import java.io.InputStream

/**
 * содержит алгоритм для подсчета уникальных ip адресов
 */
class IpAddressCounter {

    companion object {

        private const val fileBannedIpAddress = "bannedList.txt"

        // находится ли адресс в списке заблокированных
        private fun isIpAddressBanned(ipAddress: String): Boolean {
            val inputStreamBannedList: InputStream = File(fileBannedIpAddress).inputStream()

            inputStreamBannedList.bufferedReader().useLines { bannedLines ->

                bannedLines.forEach { bannedIpAddress ->

                    if (ipAddress == bannedIpAddress) return true
                }
            }
            return false
        }

        // записать в заблокированные адреса
        private fun writeToBannedAddresses(ipAddress: String) {
            val bannedFileWriter = File(fileBannedIpAddress).bufferedWriter()
            bannedFileWriter.newLine()
            bannedFileWriter.write(ipAddress)
            bannedFileWriter.close()
        }

        // проверка совпадения адреса
        private fun checkingIfAddressMatches(
            ipAddress: String,
            indexIpAddress: Int,
            filePath: String
        ): Boolean {
            val inputStream: InputStream = File(filePath).inputStream()

            inputStream.bufferedReader().useLines { lines ->

                if (!isIpAddressBanned(ipAddress)) {

                    lines.forEachIndexed { index, s ->

                        if (indexIpAddress != index) {

                            if (ipAddress == s) {

                                writeToBannedAddresses(ipAddress)
                                return true
                            }
                        }
                    }
                    return true
                } else return false
            }
        }

        // получить колличество уникальных адресов
        fun getCountUniqueIpAddress(filePath: String): Long {
            File(fileBannedIpAddress).createNewFile()
            val inputStream: InputStream = File(filePath).inputStream()
            var count = 0L

            inputStream.bufferedReader().useLines { lines ->
                lines.forEachIndexed { indexIpAddress, ipAddress ->
                    if (checkingIfAddressMatches(ipAddress, indexIpAddress, filePath)) count++
                }
            }
            File(fileBannedIpAddress).delete()
            return count
        }
    }
}