package com.shavindu.task.services;

import com.shavindu.task.domain.entities.TaskList;

import java.util.List;

public interface TaskListService {
    List<TaskList> listTaskLists();
}
