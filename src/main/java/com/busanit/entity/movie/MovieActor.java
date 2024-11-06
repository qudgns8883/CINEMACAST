package com.busanit.entity.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actorId;

    @JsonProperty("name")
    private String actorName;

    @JsonProperty("gender")
    private String actorGender;

    @JsonProperty("profile_path")
    private String actorProfilePic;


    @ManyToMany
    @JoinTable(name = "actors",
            joinColumns = @JoinColumn(name = "movie_actor_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Movie> movies = new ArrayList<>();

    public MovieActor(String name, String gender, String profilePath) {
        this.actorName = name;
        this.actorGender = gender;
        this.actorProfilePic = profilePath;
    }
}
