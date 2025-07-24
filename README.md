
<p align="center">
  <a href="https://loylabs.ru/" target="_blank">
    <img src="media/screens/Logo.png" width="200" alt="LoyLabs Logo">
  </a>
</p>

# Проект по автоматизации тестовых сценариев для сайта компании [LoyLabs](https://loylabs.ru/)

## Содержание
- [Технологический стек](#-технологический-стек)
- [Web-тесты](#-web-тесты)
- [Запуск тестов в Jenkins](#-запуск-тестов-в-jenkins)
- [Allure-отчет](#-allure-отчет)
- [Уведомления в Telegram](#-уведомления-в-telegram)
- [Видео с запуском тестов в Selenoid](#-видео-с-запуском-тестов-в-selenoid)

## 💻 Технологический стек

<div align="center">
  <table>
    <tr>
      <!-- Первая строка -->
      <td align="center" width="110">
        <a href="https://www.jetbrains.com/idea/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" width="48" height="48" alt="IntelliJ IDEA" />
        </a>
        <br>IDEA
      </td>
      <td align="center" width="110">
        <a href="https://www.java.com" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="48" height="48" alt="Java" />
        </a>
        <br>Java
      </td>
      <td align="center" width="110">
        <a href="https://junit.org/junit5/" target="_blank">
          <img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="48" height="48" alt="JUnit 5" />
        </a>
        <br>JUnit 5
      </td>
      <td align="center" width="110">
        <a href="https://gradle.org/" target="_blank">
          <img src="https://cdn.simpleicons.org/gradle/02303A" width="48" height="48" alt="Gradle" />
        </a>
        <br>Gradle
      </td>
      <td align="center" width="110">
        <a href="https://selenide.org/" target="_blank">
          <img src="https://selenide.org/images/selenide-logo.png" width="48" height="48" alt="Selenide" />
        </a>
        <br>Selenide
      </td>
    </tr>
    <tr>
      <!-- Вторая строка -->
      <td align="center" width="110">
        <a href="https://aerokube.com/selenoid/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/docker/docker-original.svg" width="48" height="48" alt="Selenoid" />
        </a>
        <br>Selenoid
      </td>
      <td align="center" width="110">
        <a href="https://docs.qameta.io/allure/" target="_blank">
          <img src="https://avatars.githubusercontent.com/u/5879127?s=200&v=4" width="48" height="48" alt="Allure" />
        </a>
        <br>Allure
      </td>
      <td align="center" width="110">
        <a href="https://www.jenkins.io/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/jenkins/jenkins-original.svg" width="48" height="48" alt="Jenkins" />
        </a>
        <br>Jenkins
      </td>
      <td align="center" width="110">
        <a href="https://github.com/" target="_blank">
          <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" width="48" height="48" alt="GitHub" />
        </a>
        <br>GitHub
      </td>
    </tr>
  </table>
</div>

- Тесты написаны на **Java** с использованием фреймворка **Selenide** в **IntelliJ IDEA**  
- Сборка проекта осуществляется через **Gradle**  
- Запуск тестов в контейнерах **Selenoid**  
- Интеграция с **Jenkins** + автоматическая отправка отчетов в **Telegram**  

---

## 🌐 Web-тесты

### Основные проверки
- ✅ Проверка отображения логотипа компании"
- ✅ Открываем страницу Кейсы и отображается заголовок Кейсы
- ✅ Открываем страницу Новости и видим заголовок Новости
- ✅ Открываем страницу Карьера и проверяем наличие вакансий
- ✅ Открываем страницу Контакты и отображается заголовок Контакты

---

## [<img src="media/logo/Jenkins.svg" width="40" height="40" alt="Jenkins"> Запуск тестов в Jenkins](https://jenkins.autotests.cloud/job/035-Azkeww-hw14/)

### Локальный запуск
```bash
gradle clean loylabs_test
```


### Удаленный запуск (Jenkins)

```bash
clean loylabs_test
"-Dselenoid_host=${SELENOID_HOST}"
-Dselenoid_login=${SELENOID_LOGIN}
-Dselenoid_password=${SELENOID_PASSWORD}
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DscreenResolution=${SCREEN_RESOLUTION}"
```



## [<img src="media/logo/Allure_Report.svg" width="40" height="40" alt="Allure"> Allure-отчет](https://jenkins.autotests.cloud/job/035-Azkeww-hw14/9/allure/)

### Главная страница Allure-отчета
<img src="media/screens/allure_report_1.png" width="800" alt="Allure">

### Пример отчета о выполнении тестов
Содержит в себе:
- Шаги теста
- Скриншот страницы на последнем шаге
- Page Source
- Логи браузерной консоли
- Видео прогона автотестов
<img src="media/screens/allure_report_2.png" width="800" alt="Allure">


## <img src="media/logo/Telegram.svg" width="40" height="40" alt="Telegram"> Уведомления в Telegram

### После завершения сборки, бот, созданный в Telegram, автоматически обрабатывает и отправляет сообщение с результатом

<p align="center">
<img src="media/screens/tg_notification.png" width="600" alt="Allure">
</p>

## <img src="media/logo/Selenoid.svg" width="40" height="40" alt="Selenoid"> Видео с запуском тестов в Selenoid

<p align="center">
  <img src="media/screens/selenoid.gif" width="600" alt="Selenoid Demo">
</p>































