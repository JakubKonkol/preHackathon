package pl.pjatk.prehackathonserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.prehackathonserver.model.Task;
import pl.pjatk.prehackathonserver.model.enums.Status;
import pl.pjatk.prehackathonserver.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/findByStatus/{status}")
    public ResponseEntity<List<Task>> findTasksByStatus (@PathVariable("status") Status status) {
        return ResponseEntity.ok(taskService.findTasksByStatus(status));
    }

    @PostMapping("/save")
    public ResponseEntity<Task> saveTask(@RequestBody Task task) {
        return ResponseEntity.ok(taskService.save(task));
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.findAll());
    }

    @GetMapping("/findById/{taskId}")
    public ResponseEntity<Task> getTask(@PathVariable long taskId) {
        return ResponseEntity.ok(taskService.getTaskById(taskId));
    }

    @PutMapping("/update/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable long taskId, @RequestBody Task task) {
        return ResponseEntity.ok(taskService.updateTaskById(taskId, task));
    }

    @DeleteMapping("/deleteById{taskId}")
    public ResponseEntity<String> deleteTask(@PathVariable long taskId) {
        taskService.deleteTaskById(taskId);
        return ResponseEntity.ok("Task of id: " + taskId + " has been deleted");
    }
}
