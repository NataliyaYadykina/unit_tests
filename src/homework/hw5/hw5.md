# ДЗ №5

--------

## Задание 1

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

### Решение:

- тесты геттеров
- тесты сеттеров
- также следующие:

addContactPositiveTest() {

Юнит-тест:

проверяет положительный сценарий добавления нового контакта

}

addContactNegativeTest() {

Юнит-тест:

проверяет отрицательный сценарий добавления нового контакта

}

editContactPositiveTest() {

Юнит-тест:

проверяет положительный сценарий изменения контакта

}

editContactNegativeTest() {

Юнит-тест:

проверяет отрицательный сценарий изменения контакта

}

removeContactPositiveTest() {

Юнит-тест:

проверяет положительный сценарий удаления контакта

}

removeContactNegativeTest() {

Юнит-тест:

проверяет отрицательный сценарий удаления контакта

}

printSortedContactsListPositiveTest() {

Интеграционный тест:

проверяет положительный сценарий вывода списка контактов из базы данных, отсортированного по алфавиту

}

printSortedContactsListNegativeTest() {

Интеграционный тест:

проверяет отрицательный сценарий вывода списка контактов из базы данных, отсортированного по алфавиту

}

searchContactPositiveTest() {

Интеграционный тест:

проверяет положительный сценарий функции поиска пользователя в базе данных

}

searchContactNegativeTest() {

Интеграционный тест:

проверяет отрицательный сценарий функции поиска пользователя в базе данных

}

contactBookTest() {

Сквозной тест:

проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление

}

## Задание 2

Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.
""Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".
""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".
""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

### Решение:

""Проверка того, что функция addContact корректно добавляет новый контакт в список контактов""

Это юнит-тест. Он проверяет поведение одной конкретной функции (в данном случае, функции добавления контакта) и не включает в себя взаимодействие с другими частями системы.

""Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов""

Это интеграционный тест. Он проверяет взаимодействие между различными частями системы, в данном случае между пользовательским интерфейсом и внутренней базой данных контактов.

""Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление""

Это сквозной тест. Он охватывает полный цикл работы с контактом, включая все этапы: создание, редактирование и удаление. Такой тест имитирует реальное использование системы и позволяет проверить ее работоспособность в целом.