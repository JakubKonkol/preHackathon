package pl.pjatk.prehackathonserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pjatk.prehackathonserver.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
