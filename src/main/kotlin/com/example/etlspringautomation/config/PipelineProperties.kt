package com.example.etlspringautomation.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "etl.pipeline")
data class PipelineProperties(
    var scheduleCron: String = "0 0/5 * * * ?",
    var alertFailureThreshold: Int = 3,
    var alertChannels: List<String> = listOf("#alerts")
)