package com.seatAllocation.movie.dto;

import com.seatAllocation.movie.entity.Movie;
import lombok.Getter;

@Getter
public class MovieResponseDto {
    private String name;
    private String region;
    private String place;
    private String movieDate;
    private String movieTime;
    private String managerName;
    private String managerTel;
    private int likes;

    public MovieResponseDto(Movie entity) {
        this.name = entity.getName();
        this.region = entity.getRegion();
        this.place = entity.getPlace();
        this.movieDate = entity.getMovieDate();
        this.movieTime = entity.getMovieTime();
        this.managerName = entity.getManagerName();
        this.managerTel = entity.getManagerTel();
        this.likes = entity.getLikes();
    }
}
