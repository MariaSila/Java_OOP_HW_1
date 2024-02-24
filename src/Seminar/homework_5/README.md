В домашней работе внесены изменения:
1. Метод delete
    * реализован в UserRepository
    * добавлен в UserController
    * добавлен case DELETE в UserView
2. Метод readUser
    * скопирован из UserController в UserRepository
    * исправлен в UserController
    * добавлен в GBRepository   
3. В метод findById вынесен повторяющийся код (поиск id) из методов: readUser, update, delete
4. Пакет dao
    * методы класса FileOperation перенесены в UserRepository
    * методы из Operation перенесены в GBRepository 
    * в UserRepository удалено поле FileOperation и все ссылки на него, а также исправлен конструктор
    * в Main удалена строка new FileOperation(DB_PATH)
5. Метод createUser хотела перенести в User, но Scanner меня остановил. Затрудняюсь в решении, поэтому оставила где был