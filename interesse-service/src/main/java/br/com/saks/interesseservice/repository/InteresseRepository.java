package br.com.saks.interesseservice.repository;

import br.com.saks.interesseservice.model.Interesse;
import br.com.saks.interesseservice.model.InteresseIdentity;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InteresseRepository extends JpaRepository<Interesse, InteresseIdentity> {
    Optional<Interesse>
    findByInteresseIdentityIdImovel(Long idImovel);

    public List<Interesse> findAllByInteresseIdentityIdCliente(Long idCliente);
    public List<Interesse> findAllByInteresseIdentityIdImovel(Long idImovel);
}
