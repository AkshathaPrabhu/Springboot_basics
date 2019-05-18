package main.jpa;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * We need to map Topic to a table in the DB
 * Each variable of this class should be a column in the table
 *
 * @Entity - will tell JPA that this class is the entity class, and that every variable is a col. of the DB
 * In this ex., JPA will create a table called "Topic" and it will have 3 cols. id, name, description
 *
 * @Id - field-level annotation; tells JPA the primary key for the table
 */

@Entity
public class Topic {


    @Column(name ="topic_id")
    @Id
    public int id;

    public String name;

    public String description;

    public Topic() {
    }

    public Topic(int id, String name, String description) {
        //super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
