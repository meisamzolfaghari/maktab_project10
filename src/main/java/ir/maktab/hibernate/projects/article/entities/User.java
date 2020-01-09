package ir.maktab.hibernate.projects.article.entities;

import ir.maktab.hibernate.projects.article.core.config.hibernate.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)

@Entity
public class User extends PersistenceEntity<Long> {

    @Column(nullable = false)
    private String username;

    @Column(name = "national_code")
    private String nationalCode;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @ToString.Exclude
    private List<Article> articles = new ArrayList<>();

    @ManyToMany
    private List<Role> roles = new ArrayList<>();
}
