package br.com.sap.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sap.dslist.models.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
