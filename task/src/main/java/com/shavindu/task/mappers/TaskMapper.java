package com.shavindu.task.mappers;

import com.shavindu.task.domain.dto.TaskDto;
import com.shavindu.task.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);

}
