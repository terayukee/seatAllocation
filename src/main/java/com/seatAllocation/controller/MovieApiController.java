package com.seatAllocation.controller;

import com.seatAllocation.movie.dto.MovieRequestDto;
import com.seatAllocation.movie.model.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MovieApiController {
    private final MovieService movieService;

    // 영화 생성
    @PostMapping("/create")
    public Long createMovie(@RequestBody final MovieRequestDto request) {
        return movieService.save(request);
    }

    // 영화 수정
    @PostMapping("/update/{id}")
    public Long updateMovie(@PathVariable("id") final Long id, @RequestBody final MovieRequestDto request) {
        return movieService.update(id, request);
    }
}
