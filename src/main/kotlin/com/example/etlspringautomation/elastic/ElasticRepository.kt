package com.example.etlspringautomation.elastic

import com.example.etlspringautomation.documents.Document
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface ElasticRepository<T : Document, ID> : ElasticsearchRepository<T, ID>