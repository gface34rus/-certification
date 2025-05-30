# SkyPro Certification Project

## Описание
Этот проект представляет собой систему для фильтрации и обработки данных о рейсах. Он разработан с использованием Java и фреймворка Spring Boot. Основная цель проекта - предоставить возможность фильтрации рейсов по различным критериям, таким как время прибытия, время вылета и другие параметры.

## Структура проекта
C:\Users\gface\IdeaProjects\SkyPro\certification ├── .gitignore ├── certification.iml~ └── src └── com └── gridnine └── testing ├── ArrivalBeforeDepartureFilter.java ├── DepartureBeforeNowFilter.java ├── FlightFilter.java ├── FlightFilterService.java ├── GroundTimeExceedsTwoHoursFilter.java ├── Main.java └── TestClasses.java

COPY

## Установка
1. Убедитесь, что у вас установлен [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) версии 11 или выше.
2. Установите [Maven](https://maven.apache.org/download.cgi) для управления зависимостями.
3. Клонируйте репозиторий:
   ```bash
   git clone <URL_вашего_репозитория>
Перейдите в директорию проекта:
cd certification
Соберите проект с помощью Maven:
mvn clean install
Запуск
Для запуска приложения используйте следующую команду:
mvn spring-boot:run
Использование
После запуска приложения вы можете отправлять HTTP-запросы к API для фильтрации рейсов. Примеры запросов можно найти в разделе Тестирование.

Тестирование
Для тестирования функциональности проекта вы можете использовать Postman или cURL. Примеры запросов:

Получение всех рейсов:
GET http://localhost:8080/flights
Фильтрация рейсов по времени прибытия:
GET http://localhost:8080/flights?arrivalBefore=2025-05-30T16:00:00
