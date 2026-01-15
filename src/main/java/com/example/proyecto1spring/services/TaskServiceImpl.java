package com.example.proyecto1spring.services;

import com.example.proyecto1spring.entities.Task;
import com.example.proyecto1spring.repositories.TaskRepository;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> findAllByOrderByTitleAsc(String orden) {
        return List.of();
    }

    @Override
    public Optional<Task> findById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public Optional<Task> findByTitle(String title) {
        return taskRepository.findByTitle(title);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        taskRepository.deleteAll();
    }

    @Override
    public @Nullable List<Task> findAllOrderByTitle(String order) {
        if (order.equals("asc")) {
            return taskRepository.findAllByOrderByTitleAsc();
        } else {
            return taskRepository.findAllByOrderByTitleDesc();
        }
    }
}