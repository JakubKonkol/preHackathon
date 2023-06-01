package pl.pjatk.prehackathonserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import pl.pjatk.prehackathonserver.model.enums.Priority;
import pl.pjatk.prehackathonserver.model.enums.Status;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc;
    private Priority priority;
    private Status status;
}
