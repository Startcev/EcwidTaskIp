/**
 * содержит алгоритмы для фильтрации ip адресов
 */
class IpAddressFilter {

    // запуск функции прямого выбора. Принимает список адресов и возвращает список уникальных адресов
    fun launchDirectSearch(listIpAddress: List<String>): List<String> {
        val listUniqueIp = mutableListOf<String>()
        val listBannedIp = mutableListOf<String>()

        // проходимся по списку адресов
        listIpAddress.forEach { ipAddress ->

            // проверяем есть ли адрес в списке запрещенных или уже находившихся
            if (!listBannedIp.contains(ipAddress)) {

                // проверяем содержится ли адрес в списке
                if (listUniqueIp.contains(ipAddress)) {

                    // убираем и добавляем в черный список
                    listUniqueIp.remove(ipAddress)
                    listBannedIp.add(ipAddress)
                } else {

                    // добавляем адресс
                    listUniqueIp.add(ipAddress)
                }
            }
        }
        return listUniqueIp
    }
}