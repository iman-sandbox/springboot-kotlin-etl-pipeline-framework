package com.example.etlspringautomation.pipeline

import com.example.etlspringautomation.config.DocumentType
import com.example.etlspringautomation.documents.Document
import com.example.etlspringautomation.elastic.ElasticRepository
import com.example.etlspringautomation.extraction.ExtractionSource

abstract class Pipeline<T : Document>(
    private val source: ExtractionSource<T>,
    private val repository: ElasticRepository<T, String>,
    private val documentType: DocumentType
) {

    abstract fun transform(input: T): T

    fun run() {
        val extracted = source.extract()
        val transformed = transform(extracted)
        when (documentType) {
            DocumentType.EVENT -> repository.save(transformed)
            DocumentType.INFORMATION -> repository.save(transformed)
        }
    }
}