import org.junit.Assert.assertEquals
import org.junit.Test

class DirectSearchTest {

    companion object {
        private const val smallFilePatch = "src\\test\\kotlin\\ListIpAddress.txt"
        private const val correctSmallFilePath = "src\\test\\kotlin\\ListFilteredIpAddress.txt"
    }

    // маленький тест на проверку прямой фильтрации
    @Test
    fun directPassAlgorithmTest() {

        val ipAddressCount = IpAddressCounter.getIpAddressSizeFromMutableList(smallFilePatch)

        val correctCount = FileHelper().getTextLine(correctSmallFilePath).size

        assertEquals(ipAddressCount, correctCount)
    }

    @Test
    fun hashSetAlgorithmTest() {

        val ipAddressCount = IpAddressCounter.getIpAddressSizeFromHashSet(smallFilePatch)

        val correctCount = FileHelper().getTextLine(correctSmallFilePath).size

        assertEquals(ipAddressCount, correctCount)
    }
}