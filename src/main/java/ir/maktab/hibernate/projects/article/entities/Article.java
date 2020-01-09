package ir.maktab.hibernate.projects.article.entities;

import ir.maktab.hibernate.projects.article.core.config.hibernate.PersistenceEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
public class Article extends PersistenceEntity<Long> {

    private String title;
    private String brief;
    private String content;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "last_update_date")
    private Date lastUpdateDate;
    @Column(name = "publish_date")
    private Date publishDate;
    @Column(name = "is_publised")
    private boolean isPublished;

    @ManyToOne
    private User user;

    @ManyToOne
    private Category category;

    @ManyToMany
    List<Tag> tags = new ArrayList<>();

    public Article(String title, String brief, String content, Date createDate, boolean isPublished, User user, Category category, List<Tag> tags) {
        this.title = title;
        this.brief = brief;
        this.content = content;
        this.createDate = createDate;
        this.isPublished = isPublished;
        this.user = user;
        this.category = category;
        this.tags = tags;
    }

}
