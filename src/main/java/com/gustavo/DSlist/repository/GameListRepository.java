package com.gustavo.DSlist.repository;

import com.gustavo.DSlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
