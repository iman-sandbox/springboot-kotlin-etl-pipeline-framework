package com.example.etlspringautomation.scheduler

import com.example.etlspringautomation.pipeline.Pipeline
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled

@Configuration
@EnableScheduling
class SchedulerConfig {

    // Example fixed delay scheduled method; real usage would wire pipelines and schedule dynamically
    @Scheduled(fixedDelayString = "\${etl.pipeline.scheduleDelay:300000}")
    fun scheduledRun() {
        // Placeholder for scheduled pipeline runs
    }
}