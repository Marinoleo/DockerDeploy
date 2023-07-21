package portfolio.docker_deploy.entities;

import jakarta.persistence.*;

@Entity
@Table(name="allDecks")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "color")
    private String color;
    @Column(name = "type")
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
