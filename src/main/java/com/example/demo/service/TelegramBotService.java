package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

//La clase se extiende TelegramLongPollingBot, lo que significa que el bot recibirá actualizaciones usando el long polling 
//(consulta periódica al servidor de Telegram).

@Service
public class TelegramBotService extends TelegramLongPollingBot {

    @Value("${telegram.bot.username}")
    private String botUsername;

    @Value("${telegram.bot.token}")
    private String botToken;

    @Override
    public String getBotUsername() {
        return botUsername;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    //método que se llama cada vez que llega un mensaje al bot.
    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String mensaje = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();
            String nombre = update.getMessage().getFrom().getFirstName();

            //  MOSTRAR EN CONSOLA LO QUE RECIBE EL BOT
            System.out.println("====================================");
            System.out.println("MENSAJE RECIBIDO:");
            System.out.println("Usuario: " + nombre);
            System.out.println("Mensaje: " + mensaje);
            System.out.println("====================================");

            String respuesta = "";

            //  respuestas de el bot en telegram., se puede modificar como quieras , este es un ejemplo clasico.
            if (mensaje.equalsIgnoreCase("/start")) {
                respuesta = "¡Hola " + nombre + "! 👋 Soy BryanBOOT. ¿En qué puedo ayudarte?";
            } else if (mensaje.toLowerCase().contains("hola")) {
                respuesta = "¡Hola " + nombre + "! ¿Cómo estás? 😊";
            } else if (mensaje.equalsIgnoreCase("/help")) {
                respuesta = "Comandos disponibles:\n/start - Iniciar\n/help - Ayuda\n/info - Información";
            } else if (mensaje.equalsIgnoreCase("/info")) {
                respuesta = " Bot creado con Spring Boot\n Desarrollo de Aplicaciones Distribuidas";
            } else {
                respuesta = "Recibí tu mensaje: " + mensaje;
            }
            
            SendMessage message = new SendMessage();
            message.setChatId(chatId);
            message.setText(respuesta);

            try {
                execute(message);
            } catch (Exception e) {
                System.err.println("❌ ERROR al enviar mensaje:");
                e.printStackTrace();
            }
        }
    }
}