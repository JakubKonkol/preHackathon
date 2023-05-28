package pl.pjatk.prehackathonserver.model;

import jakarta.persistence.*;
import lombok.*;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@SequenceGenerator(name = "seq_project", sequenceName = "seq_project", allocationSize = 1)
public class EcoBuddy {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_project")
    private Long id;
    private String desc;
}
