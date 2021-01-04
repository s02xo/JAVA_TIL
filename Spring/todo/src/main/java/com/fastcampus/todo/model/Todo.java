package com.fastcampus.todo.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    Long id;
    String title;
    String description;
    String owner;
    String category;
    LocalDate dueDate;

}