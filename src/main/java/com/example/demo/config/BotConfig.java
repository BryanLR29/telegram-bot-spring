package com.example.demo.config;
import com.example.demo.service.TelegramBotService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

// se encarga de registrar tu bot para que Telegram lo reconozca y pueda recibir mensajes.
@Configuration
public class BotConfig {
	
//Configura y registra tu bot (TelegramBotService) con la API de Telegram usando Spring Boot.
    @Bean
    public TelegramBotsApi telegramBotsApi(TelegramBotService bot) throws TelegramApiException {
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(bot);
        return api;
    }
}