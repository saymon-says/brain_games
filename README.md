### Hexlet tests and linter status:
[![Actions Status](https://github.com/saymon-says/java-project-lvl1/workflows/Java_Cl/badge.svg)](https://github.com/saymon-says/java-project-lvl1/actions)
[![Maintainability](https://api.codeclimate.com/v1/badges/b136b40dfe468edf8d06/maintainability)](https://codeclimate.com/github/saymon-says/java-project-lvl1/maintainability)
![example workflow](https://github.com/saymon-says/java-project-lvl1/actions/workflows/gradle.yml/badge.svg)

### Описание
____
«Игры разума» — набор из пяти консольных игр, построенных по принципу популярных мобильных приложений для прокачки мозга. Каждая игра задает вопросы, на которые нужно дать правильные ответы. После трех правильных ответов считается, что игра пройдена. Неправильные ответы завершают игру и предлагают пройти ее заново. 
### Реализованные игры:
___
* Калькулятор. Арифметические выражения, которые необходимо вычислить.
* Прогрессия. Поиск пропущенных чисел в последовательности чисел.
* Определение четного числа.
* Определение наибольшего общего делителя.
* Определение простого числа.
### Технологии и подход к разработке
___
* утилита Make
* java-core, настройка окружения
* контроль качества кода осуществлялся с помощью линтера eslint, а также утилиты CodeClimate;
* используется Github Aсtions;
* архитектура проекта построена на принципе переиспользования логики, что позволит добавить при необходимости новую игру. (принцип открытости\закрытости)
### Требования
___
* OpenJDK_16
* Gradle 7.2
* Make
### Запуск
___
В терминале папки проекта выполнить команду `make install` & `make run-dist`, приложение консольное.
### Пример работы
___
![brain-game](https://user-images.githubusercontent.com/43708964/125470841-f09a7789-9db8-460f-a71c-31bab9be9f7b.gif)
