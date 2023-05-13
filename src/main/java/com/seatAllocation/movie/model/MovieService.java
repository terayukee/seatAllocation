package com.seatAllocation.movie.model;

import com.seatAllocation.movie.dto.MovieRequestDto;
import com.seatAllocation.movie.entity.Movie;
import com.seatAllocation.movie.entity.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    // 영화 생성
    @Transactional
    public Long create(final MovieRequestDto request) {

        Movie entity = movieRepository.save(request.toEntity());
        return entity.getId();
    }

    // 영화 수정
    @Transactional
    public Long update(final Long id, final  MovieRequestDto request) {

        Movie entity = movieRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("no such data"));
        entity.update(request.getName(), request.getRegion(), request.getPlace(), request.getMovieDate(), request.getMovieTime(), request.getManagerName(), request.getManagerTel(), request.getLikes());
        return id;
    }
}
