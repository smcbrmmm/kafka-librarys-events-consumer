package com.example.Libraryeventsconsumer.Consumer;


import com.example.Libraryeventsconsumer.Model.LibraryEvent;
import com.example.Libraryeventsconsumer.Service.LibraryEventService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingConsumerAwareMessageListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventConsumerManualOffset implements AcknowledgingMessageListener<Integer,String> {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    LibraryEventService libraryEventService;


    @Override
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord, Acknowledgment acknowledgment) {
        log.info("Message is {}",consumerRecord);
        acknowledgment.acknowledge();
    }

    @Override
    public void onMessage(ConsumerRecord<Integer, String> data, Consumer<?, ?> consumer) {
        AcknowledgingMessageListener.super.onMessage(data, consumer);
    }

    @Override
    public void onMessage(ConsumerRecord<Integer, String> data, Acknowledgment acknowledgment, Consumer<?, ?> consumer) {
        AcknowledgingMessageListener.super.onMessage(data, acknowledgment, consumer);
    }
}
