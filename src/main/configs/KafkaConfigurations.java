package main.configs;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.core.StreamsBuilderFactoryBean;

import java.util.Properties;

@Configuration
public class KafkaConfigurations {


    @Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public StreamsConfig getKafkaProps() {

        Properties properties = new Properties();

        properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "test-topic-input");
        properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        return new StreamsConfig(properties);
    }


    @Bean("streamBuilderBean")
    public StreamsBuilderFactoryBean app1StreamBuilderFactoryBean() {
        return new StreamsBuilderFactoryBean(getKafkaProps());
    }

}
