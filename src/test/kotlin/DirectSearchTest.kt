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

        val ipAddressCount = IpAddressCounter.getCountUniqueIpAddress(smallFilePatch)

        val correctCount = FileHelper().getTextLine(correctSmallFilePath).size.toLong()

        assertEquals(ipAddressCount, correctCount)
    }
}