package com.shavindu.task.services.impl;

import com.shavindu.task.domain.entities.TaskList;
import com.shavindu.task.repositories.TaskListRepository;
import com.shavindu.task.services.TaskListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskListServiceImpl implements TaskListService {

   private final TaskListRepository taskListRepository;

    public TaskListServiceImpl(TaskListRepository taskListRepository) {
        this.taskListRepository = taskListRepository;
    }

    @Override
    public List<TaskList> listTaskLists() {
        return taskListRepository.findAll();
    }
}
