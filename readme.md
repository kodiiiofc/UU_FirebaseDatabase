# Домашнее задание по теме "FirebaseDatabase"

## Приложение «Контакты в Firebase»

Необходимо написать приложение, в котором в базу данных реального времени **Realtime Firebase database** можно записывать и считывать контакты пользователя. Список контактов необходимо реализовать на основе списка `RecyclerView`. Под контактом понимается имя пользователя и телефон. Приложение, должно отрабатывать регистрацию и вход на экран контактов. Реализовать приложение нужно, используя навигацию между экранами приложения, которыми являются фрагменты и хостом для них является активити. Логика добавления и считывания базы данных может быть аналогична тематике отработанного занятия.

Для работы приложения необходимо создать навигационный граф, расположенный в главном активити.

Пункты назначения – фрагменты:

На фрагменте регистрации должны быть:

1. Поля ввода почты, пароля, подтверждение пароля.
2. Кнопка «Зарегистрироваться».
3. Поле вывода «Уже есть аккаунт», по нажатию на который происходит переход на фрагмент входа в систему.

На фрагменте входа должны быть:

1. Поля ввода почты и пароля.
2. Кнопка «Войти».
3. Поле вывода «Необходима регистрация», по нажатию на которое происходит переход на фрагмент регистрации.

На фрагменте контактов должны быть:

1. Поля ввода имени и контакта.
2. Кнопка «Сохранить».
3. Список сохраненных в базе данных контактов. Его необходимо реализовать на основе `RecyclerView`. Кнопка «Назад».
4. Меню с пунктом «Exit» для выхода из приложения.

**Усложненный уровень.** 
Необходимо реализовать удаление контакта по нажатию на элемент списка. Удаление происходит в базе данных, экран «перерисовывается» и на нем отображаются обновленные данные базы данных.

## Видео к домашнему заданию по теме "FirebaseDatabase"

[Запись работы приложения](https://github.com/user-attachments/assets/ed27850f-dc83-4da6-8621-6a80f3685ee4)
