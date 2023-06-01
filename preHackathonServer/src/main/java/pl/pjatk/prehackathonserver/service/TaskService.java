package pl.pjatk.prehackathonserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.pjatk.prehackathonserver.model.Task;
import pl.pjatk.prehackathonserver.model.enums.Status;
import pl.pjatk.prehackathonserver.repository.TaskRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> findTasksByStatus(Status status) {
        return taskRepository.findTasksByStatus(status);
    }


    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task getTaskById(long taskId) {
        var optionalTask = taskRepository.findById(taskId);

        if (optionalTask.isEmpty()) {
            throw new NoSuchElementException("There's no task with given id");
        }

        return optionalTask.get();
    }

    public Task updateTaskById(long taskId, Task updatedTask) {
        var optionalTask = taskRepository.findById(taskId);

        if (optionalTask.isEmpty()) {
            throw new NoSuchElementException("There's no task with given id");
        }

        Task taskToUpdate = optionalTask.get();

        if (updatedTask.getDesc() != null) {
            taskToUpdate.setDesc(updatedTask.getDesc());
        }

        if (updatedTask.getPriority() != null) {
            taskToUpdate.setPriority(updatedTask.getPriority());
        }

        return taskToUpdate;
    }

    public void deleteTaskById(long taskId) {
        var optionalTask = taskRepository.findById(taskId);

        if (optionalTask.isEmpty()) {
            throw new NoSuchElementException("There's no task with given id");
        }

        taskRepository.delete(optionalTask.get());
    }

}
