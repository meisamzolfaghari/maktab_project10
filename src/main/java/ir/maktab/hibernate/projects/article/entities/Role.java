package ir.maktab.hibernate.projects.article.entities;

import ir.maktab.hibernate.projects.article.core.config.hibernate.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
public class Role extends PersistenceEntity<Long> {

    private String title;

    @ManyToMany(mappedBy = "roles" , fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<User> users = new ArrayList<>();

}
