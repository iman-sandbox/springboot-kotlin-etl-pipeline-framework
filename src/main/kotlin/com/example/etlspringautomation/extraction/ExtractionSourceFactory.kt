package com.example.etlspringautomation.extraction

import org.springframework.stereotype.Component

@Component
class ExtractionSourceFactory {
    fun <T> create(sourceType: String, config: Map<String, Any>): ExtractionSource<T> {
        return when (sourceType.lowercase()) {
            "kafka" -> KafkaSource(config["topic"] as String) as ExtractionSource<T>
            "queryapi" -> QueryApiSource(config["url"] as String) as ExtractionSource<T>
            else -> throw IllegalArgumentException("Unsupported source type: $sourceType")
        }
    }
}

// Example stub implementations
class KafkaSource<T>(private val topic: String) : ExtractionSource<T> {
    override fun extract(): T {
        throw NotImplementedError("Kafka extraction not implemented")
    }
}

class QueryApiSource<T>(private val url: String) : ExtractionSource<T> {
    override fun extract(): T {
        throw NotImplementedError("Query API extraction not implemented")
    }
}