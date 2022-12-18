package com.example.Libraryeventsconsumer.Consumer;

import com.example.Libraryeventsconsumer.Model.LibraryEvent;
import com.example.Libraryeventsconsumer.Repository.LibraryEventRepository;
import com.example.Libraryeventsconsumer.Service.LibraryEventService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LibraryEventConsumer {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    LibraryEventService libraryEventService;

    @KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecord<Integer,String> consumerRecord) throws JsonProcessingException {

        LibraryEvent event = objectMapper.readValue(consumerRecord.value(), LibraryEvent.class);
        libraryEventService.save(event);

        log.info("Message is {}",consumerRecord);
    }

}
