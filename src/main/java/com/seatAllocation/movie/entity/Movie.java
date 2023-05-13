package com.seatAllocation.movie.entity;

import jakarta.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "movie_info")
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String region;

    private String place;

    //@Column(name = "movie_date")
    private String movieDate;

    //@Column(name = "movie_time")
    private String movieTime;

    //@Column(name = "manager_name")
    private String managerName;

    //@Column(name = "manager_tel")
    private String managerTel;

    private int likes;

    @Builder
    public Movie(String name, String region, String place, String movieDate, String movieTime, String managerName, String managerTel, int likes){
        this.name = name;
        this.region = region;
        this.place = place;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.managerName = managerName;
        this.managerTel = managerTel;
        this.likes = likes;
    }

    public void update(String name, String region, String place, String movieDate, String movieTime, String managerName, String managerTel, int likes){
        this.name = name;
        this.region = region;
        this.place = place;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.managerName = managerName;
        this.managerTel = managerTel;
        this.likes = likes;
    }
}
