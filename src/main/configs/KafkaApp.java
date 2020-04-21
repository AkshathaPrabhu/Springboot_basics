package main.configs;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class KafkaApp {
    @Bean
    public KStream<String, String> startProcessing(@Qualifier("streamBuilderBean") StreamsBuilder kStreamBuilder) {

        KStream<String, String> stream = kStreamBuilder.stream("test-topic-input");
        stream.mapValues(v -> {
            System.out.println("Processing :: " + v);
            return v;
        })
            .to("test-topic-output");
        return stream;
    }
}