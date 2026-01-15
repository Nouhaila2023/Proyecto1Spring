package com.example.proyecto1spring.services;

import com.example.proyecto1spring.entities.Task;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public interface TaskService {


    List<Task> findAll();
    List<Task> findAllOrderByTitle(String order);
    Optional<Task> findById(Long id);
    Optional<Task> findByTitle(String title);

    Task saveTask(Task task);

    void deleteTask(Long id);
    void deleteAll();
}