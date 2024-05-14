package com.yonghao.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor //Creates a constructor that takes in arguments for all of these fields
@NoArgsConstructor  //Creates a constructor that doesn't need an argument
public class Movie {
    @Id //Treats ObjectId as the unique identifier for each movie
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference //Makes the database only store the Ids of the review and it will be stored in a separate collection
    private List<Review> reviewIds;
}
