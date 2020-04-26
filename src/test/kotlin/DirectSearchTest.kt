import org.junit.Test

class DirectSearchTest {

    companion object {
        private const val smallFilePatch = "src\\test\\kotlin\\ListIpAddress.txt"
        private const val correctSmallFilePath = "src\\test\\kotlin\\ListFilteredIpAddress.txt"
    }

    // маленький тест на проверку прямой фильтрации
    @Test
    fun smallDirectionSearchTest() {

        val listIp = FileHelper().getTextLine(smallFilePatch)

        val listUniqueIpAddress = IpAddressFilter().launchDirectSearch(listIp)

        val correctList = FileHelper().getTextLine(correctSmallFilePath)

        assert(listUniqueIpAddress == correctList)
    }
}