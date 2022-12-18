package com.example.Libraryeventsconsumer.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {

    private int bookId;
    private String bookName;
    private String bookAuthor;
}
