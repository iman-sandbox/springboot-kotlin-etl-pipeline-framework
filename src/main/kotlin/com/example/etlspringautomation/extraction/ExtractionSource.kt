package com.example.etlspringautomation.extraction

interface ExtractionSource<T> {
    fun extract(): T
}