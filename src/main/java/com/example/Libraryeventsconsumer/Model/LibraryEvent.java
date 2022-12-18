package com.example.Libraryeventsconsumer.Model;

import com.example.Libraryeventsconsumer.Constants.LibraryEventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("LibraryEvent")
public class LibraryEvent {

    private Integer libraryEventId;
    private LibraryEventType libraryEventType;
    private Book book;
}
