package br.com.sap.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sap.dslist.models.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
