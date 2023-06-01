package pl.pjatk.prehackathonserver.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private Double points;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Task> taskHistory;
}
