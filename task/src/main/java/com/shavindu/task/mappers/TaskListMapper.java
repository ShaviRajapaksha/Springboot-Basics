package com.shavindu.task.mappers;

import com.shavindu.task.domain.dto.TaskListDto;
import com.shavindu.task.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);
    TaskListDto toDto(TaskList taskList);

}
