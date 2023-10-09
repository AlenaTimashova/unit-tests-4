1. почему тестовые заглушки полезны при написании модульных тестов?

Юнит-тест нужен для тестирование маленького конкретного куска когда, поэтому нужно его изолировать от тесно связаннного кода (зависимостей). 
Это гарантирует, что за результат теста будет отвечать только тестируемый модуль, что упрощает выявление и исправление багов.
Повышается гибкость теста, экономится память, потому что заменяется реальный объект дублером, высокая скорость работы

2. Какой тип заглушки нужен для того, чтобы проверить, что метод был вызван с определенными аргументами?
 Dummy

3. Какой тип заглушки нужен, если нужно вернуть определенное значение иил исключение в ответ на вызов метода

Mock

4. Какой тип заглушки нужен для имитации взаимодействия с внешним API или базой данных?

Fake