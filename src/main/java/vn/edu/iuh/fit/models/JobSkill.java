package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Data;
import vn.edu.iuh.fit.enums.SkillLevel;

@Entity
@Table(name = "job_skill")
@Data
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfo;
}
