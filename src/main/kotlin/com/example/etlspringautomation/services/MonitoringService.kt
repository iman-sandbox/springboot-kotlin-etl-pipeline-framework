package com.example.etlspringautomation.services

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class MonitoringService {
    private val logger = LoggerFactory.getLogger(MonitoringService::class.java)

    @KafkaListener(topics = ["pipeline-execution-events"])
    fun listen(message: String) {
        logger.info("Received pipeline execution event: \$message")
        // TODO: process and alert if needed
    }
}