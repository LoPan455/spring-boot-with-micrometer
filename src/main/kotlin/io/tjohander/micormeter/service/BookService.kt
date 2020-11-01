package io.tjohander.micormeter.service

import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service

@Service
class BookService() {

    var books: Int = 100

    fun booksCount(): Int {
        return books++
    }

    @Bean
    fun booksGauge(registry: MeterRegistry) = Gauge
            .builder("books", books)
            { books.toDouble() }
            .register(registry)
}