package ir.maktab.hibernate.projects.article.entities;

import ir.maktab.hibernate.projects.article.core.config.hibernate.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
public class Category extends PersistenceEntity<Long> {

    private String title;
    private String description;

    @OneToMany(mappedBy = "category" , fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Article> articles = new ArrayList<>();


}
