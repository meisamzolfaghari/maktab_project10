package ir.maktab.hibernate.projects.article.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany(mappedBy = "roles" , fetch = FetchType.EAGER)
    private List<User> users = new ArrayList<>();

    public Role() {
    }

    public Role(String title) {
        this.title = title;
    }

    public Role(String title, List<User> users) {
        this.title = title;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
