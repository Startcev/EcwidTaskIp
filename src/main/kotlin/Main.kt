class Main {

    companion object {

        // путь до файла
        private const val filePath = "src\\test\\kotlin\\ListIpAddress.txt"


        @JvmStatic
        fun main(args: Array<String>) {

            val ipAddressCount = IpAddressCounter.getCountIpUniqueAddress(filePath)
            Log.m(ipAddressCount)
        }
    }
}