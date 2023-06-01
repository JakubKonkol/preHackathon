package pl.pjatk.prehackathonserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.prehackathonserver.model.Task;
import pl.pjatk.prehackathonserver.model.enums.Status;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findTasksByStatus(Status status);
}
