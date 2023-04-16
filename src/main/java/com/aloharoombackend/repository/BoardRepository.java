package com.aloharoombackend.repository;

import com.aloharoombackend.model.Board;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {

    @Override
    @EntityGraph(attributePaths = {"user"})
    List<Board> findAll();

    List<Board> findAllByUserId(Long userId);
}
