# 🤖 Bot de Telegram con Spring Boot

Bot de Telegram desarrollado con Spring Boot para la asignatura de Desarrollo de Aplicaciones Distribuidas.

## 📋 Descripción

Este proyecto implementa un bot de Telegram llamado **BryanBOOT** (@bryanboot_bot) utilizando Spring Boot y la API de Telegram Bots. El bot puede recibir y responder mensajes, además de ejecutar comandos personalizados.

## 🛠️ Tecnologías Utilizadas

- Java 21
- Spring Boot 2.7.14
- Maven
- Telegram Bots API 6.1.0

## 📦 Requisitos Previos

- JDK 11 o superior
- Maven 3.6+
- Cuenta de Telegram
- Token de bot de Telegram (obtenido de @BotFather)

## ⚙️ Configuración

1. Clona este repositorio:
```bash
git clone https://github.com/TU_USUARIO/telegram-bot-spring.git
cd telegram-bot-spring
```

2. Configura `application.properties` con tus credenciales:
```properties
telegram.bot.username=tu_bot_username
telegram.bot.token=tu_bot_token
```

3. Compila el proyecto:
```bash
mvn clean install
```

4. Ejecuta la aplicación:
```bash
mvn spring-boot:run
```

## 🚀 Uso

El bot responde a los siguientes comandos:

- `/start` - Inicia la conversación con el bot
- `/help` - Muestra los comandos disponibles
- `/info` - Información sobre el bot
- Mensajes de texto - El bot responde confirmando que recibió el mensaje

## 📁 Estructura del Proyecto
```
telegram-boot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/demo/
│   │   │       ├── TelegramBootApplication.java
│   │   │       ├── config/
│   │   │       │   └── BotConfig.java
│   │   │       └── service/
│   │   │           └── TelegramBotService.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

## 🔧 Características

- ✅ Respuesta automática a mensajes
- ✅ Comandos personalizados
- ✅ Logs en consola para debugging
- ✅ Arquitectura modular con Spring Boot

## 👨‍💻 Autor

**Bryan López Ruiz**
- Instituto Tecnológico de Salina Cruz
- Ingeniería en TIC's - 8° Semestre
- Desarrollo de Aplicaciones Distribuidas
- Profesor: Alfonso Miguel

## 📅 Fecha

Febrero 2026

## 📝 Licencia

Este proyecto fue desarrollado con fines educativos.