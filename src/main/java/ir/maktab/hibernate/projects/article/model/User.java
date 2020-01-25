package ir.maktab.hibernate.projects.article.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(name = "national_code")
    private String nationalCode;

    @Column(name = "birth_day")
    private Date birthDay;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Article> articles = new ArrayList<>();

    @ManyToMany
    private List<Role> roles = new ArrayList<>();

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    public User() {
    }

    public User(String username, String nationalCode, Date birthDay, String password) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
    }

    public User(String username, String nationalCode, Date birthDay, String password, Address address) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
        this.address = address;
    }

    public User(String username, String nationalCode, Date birthDay, String password, List<Role> roles, Address address) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
        this.roles = roles;
        this.address = address;
    }

    public User(String username, String nationalCode, Date birthDay, String password, List<Article> articles, List<Role> roles, Address address) {
        this.username = username;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.password = password;
        this.articles = articles;
        this.roles = roles;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", birthDay=" + birthDay +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", address=" + address +
                '}';
    }
}
