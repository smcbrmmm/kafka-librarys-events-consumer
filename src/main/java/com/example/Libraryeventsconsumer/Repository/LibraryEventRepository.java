package com.example.Libraryeventsconsumer.Repository;

import com.example.Libraryeventsconsumer.Model.LibraryEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryEventRepository extends MongoRepository<LibraryEvent, String> {

}
