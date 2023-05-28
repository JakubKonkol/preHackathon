package pl.pjatk.prehackathonserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.prehackathonserver.model.Task;
import pl.pjatk.prehackathonserver.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        return ResponseEntity.ok(taskService.save(task));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.ok(taskService.findAll());
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Task> getTask(@PathVariable long taskId) {
        return ResponseEntity.ok(taskService.getTask(taskId));
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable long taskId, @RequestBody Task task) {
        return ResponseEntity.ok(taskService.updateTask(taskId, task));
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<String> deleteTask(@PathVariable long taskId){
        taskService.deleteTask(taskId);
        return ResponseEntity.ok("Task of id: " + taskId + " has been deleted");
    }
}
