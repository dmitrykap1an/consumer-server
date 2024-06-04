package ru.kaplaan.consumer.domain.properties.email

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties(prefix = "rabbit.mail-server.send-vacancy-response")
data class SendVacancyResponseProperties
    @ConstructorBinding constructor(
        val queueName: String,
        val routingKey: String
    )