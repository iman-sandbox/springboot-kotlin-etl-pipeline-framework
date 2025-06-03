package com.example.etlspringautomation.documents

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document as ES_Document

@ES_Document(indexName = "information")
data class InformationDocument(
    @Id
    val id: String,
    val info: Map<String, Any>
) : Document