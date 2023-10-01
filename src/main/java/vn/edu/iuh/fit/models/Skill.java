package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.UUID;
//Read skill list at: https://www.yourdictionary.com/articles/examples-skills-list
//API: https://github.com/workforce-data-initiative/skills-api/wiki/API-Overview#swagger-ui-test-client
@Entity
@Table (name = "skill")
@Data
public class Skill {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "skill_id")
    private UUID id;
    private String skillName;
    private SkillType type;
    private String skillDescription;

    //====================

}
