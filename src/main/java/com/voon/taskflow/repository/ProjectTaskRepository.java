package com.voon.taskflow.repository;

import com.voon.taskflow.entity.ProjectTask;
import com.voon.taskflow.entity.TaskPriority;
import com.voon.taskflow.entity.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {
    List<ProjectTask> findByProjectId(Long projectId);

    List<ProjectTask> findByStatus(TaskStatus status);

    List<ProjectTask> findByPriority(TaskPriority priority);

    List<ProjectTask> findByAssignedUserId(Long userId);
}