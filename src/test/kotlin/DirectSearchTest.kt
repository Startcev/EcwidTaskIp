import org.junit.Assert.assertEquals
import org.junit.Test

class DirectSearchTest {

    companion object {
        private const val smallFilePatch = "src\\test\\kotlin\\ListIpAddress.txt"
        private const val correctSmallFilePath = "src\\test\\kotlin\\ListFilteredIpAddress.txt"
    }

    // маленький тест на проверку прямой фильтрации
    @Test
    fun smallTest() {

        val ipAddressCount = IpAddressCounter.getCountIpUniqueAddress(smallFilePatch)

        val correctCount = FileHelper().getTextLine(correctSmallFilePath).size.toLong()

        assertEquals(ipAddressCount, correctCount)
    }

    @Test
    fun bigFileTest() {

        val filePath = smallFilePatch

        val ipAddressCount = IpAddressCounter.getCountIpUniqueAddress(filePath)

        Log.s(ipAddressCount)
    }
}