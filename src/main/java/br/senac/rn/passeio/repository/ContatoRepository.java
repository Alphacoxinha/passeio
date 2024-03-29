package br.senac.rn.passeio.repository;

import br.senac.rn.passeio.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

    List<Contato> findByFone(String fone);

    @Query("FROM Contato c WHERE c.fone LIKE %:fone%")
    List<Contato> findByFonePart(@Param("fone") String fone);
}
