class Main {

    companion object {

        // путь до файла
        private const val filePath = "C:\\Users\\Serge\\Desktop\\EcwidTask\\listIpAddres.txt"


        @JvmStatic
        fun main(args: Array<String>) {

            val listIp = FileHelper().getTextLine(filePath)

            val listUniqueIp = IpAddressFilter().launchDirectSearch(listIp)

            Log.message(listUniqueIp)
        }
    }
}