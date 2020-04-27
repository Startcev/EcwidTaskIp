class Main {

    companion object {

        // путь до файла
        private const val filePath = "C:\\Users\\Serge\\Desktop\\EcwidTask\\listIpAddres.txt"


        @JvmStatic
        fun main(args: Array<String>) {

            val ipAddressCount = IpAddressCounter.getIpAddressSizeFromHashSet(filePath)
            Log.message(ipAddressCount.toString())

            val ipAddressCountV2 = IpAddressCounter.getIpAddressSizeFromMutableList(filePath)
            Log.message(ipAddressCountV2.toString())
        }
    }
}