package pl.pjatk.prehackathonserver.model;

import jakarta.persistence.*;
import lombok.*;
import pl.pjatk.prehackathonserver.model.enums.Priority;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc;
    private Priority priority;
}
