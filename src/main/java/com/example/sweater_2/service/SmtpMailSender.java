package com.example.sweater_2.service;

import org.springframework.stereotype.Service;

@Service
public class SmtpMailSender {
    public void send(String emailTo, String subject, String message) {
        // Вместо отправки письма выводим информацию в консоль
        System.out.println("=== Письмо отправлено (имитация) ===");
        System.out.println("От: " + "your-email@example.com"); // Имя отправителя можно указать статически
        System.out.println("Кому: " + emailTo);
        System.out.println("Тема: " + subject);
        System.out.println("Сообщение: " + message);
        System.out.println("===================================");
    }
}

