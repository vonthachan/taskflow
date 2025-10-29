package com.voon.taskflow.dto;

import com.voon.taskflow.entity.TaskPriority;
import com.voon.taskflow.entity.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDate dueDate;
    private Long projectId;
    private String projectName;
    private Long assignedUserId;
    private String assignedUsername;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}