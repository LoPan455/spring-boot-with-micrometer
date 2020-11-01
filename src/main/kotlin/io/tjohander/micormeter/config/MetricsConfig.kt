package io.tjohander.micormeter.config

import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.security.SecureRandom

@Configuration
class MetricsConfig() {

    @Bean
    fun random() = SecureRandom()

    @Bean
    fun simpleGauge(registry: MeterRegistry) = Gauge
            .builder("simple", random())
            { it.nextInt(100).toDouble() }
            .register(registry)

}