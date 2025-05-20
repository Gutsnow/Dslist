package com.gustavo.DSlist.repository;

import com.gustavo.DSlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
