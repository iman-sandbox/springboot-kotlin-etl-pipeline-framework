package com.example.etlspringautomation.documents

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document as ES_Document

@ES_Document(indexName = "events")
data class EventDocument(
    @Id
    val id: String? = null,
    val timestamp: Long,
    val data: Map<String, Any>
) : Document