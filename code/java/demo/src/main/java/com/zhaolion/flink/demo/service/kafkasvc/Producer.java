package com.zhaolion.flink.demo.service.kafkasvc;

import com.zhaolion.flink.demo.proto.event.UserDurationEvent;
import io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;

import java.util.Properties;

public class Producer {
    private volatile boolean isRunning;
    private final String brokers;

    private final String topic;

    public Producer(String brokers, String topic) {
        this.brokers = brokers;
        this.topic = topic;
        this.isRunning = true;
    }

    public void run() {
        KafkaProducer<String, UserDurationEvent> producer = new KafkaProducer<>(getProperties());
    }

    private Properties getProperties() {
        final Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, brokers);
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaProtobufSerializer.class);

        return props;
    }
}
