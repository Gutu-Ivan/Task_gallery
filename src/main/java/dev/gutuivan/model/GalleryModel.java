package dev.gutuivan.model;

import javax.persistence.*;

@Entity
@Table(name="gallery")
public class GalleryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name ="image")
    private String img;

    @Column(name = "created_date")
    private String created;

    @Column(name = "updated_date")
    private String updated;

}
