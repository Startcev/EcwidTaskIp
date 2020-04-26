class Main {

    companion object {

        // путь до файла
        private const val filePath = "C:\\Users\\Serge\\Desktop\\EcwidTask\\listIpAddres.txt"

        @JvmStatic
        fun main(args: Array<String>) {

            FileHelper.getTextLine(filePath)
        }
    }
}