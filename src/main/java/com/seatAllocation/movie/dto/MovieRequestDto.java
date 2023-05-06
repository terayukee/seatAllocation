package com.seatAllocation.movie.dto;

import com.seatAllocation.movie.entity.Movie;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MovieRequestDto {

    private String name;
    private String region;
    private String place;
    private String movieDate;
    private String movieTime;
    private String managerName;
    private String managerTel;
    private int likes;

    public Movie toEntity() {
        return Movie.builder()
                .name(name)
                .region(region)
                .place(place)
                .movieDate(movieDate)
                .movieTime(movieTime)
                .managerName(managerName)
                .managerTel(managerTel)
                .likes(likes)
                .build();
    }

}
