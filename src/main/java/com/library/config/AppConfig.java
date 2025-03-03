package com.library.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.library") // Укажите базовый пакет для сканирования компонентов
public class AppConfig {
}