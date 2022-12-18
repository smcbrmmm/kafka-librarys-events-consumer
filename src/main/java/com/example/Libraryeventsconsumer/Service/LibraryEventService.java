package com.example.Libraryeventsconsumer.Service;

import com.example.Libraryeventsconsumer.Model.LibraryEvent;
import com.example.Libraryeventsconsumer.Repository.LibraryEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryEventService {

    @Autowired
    LibraryEventRepository libraryEventRepository;

    public void save(LibraryEvent libraryEvent){
        libraryEventRepository.save(libraryEvent);
    }

}
