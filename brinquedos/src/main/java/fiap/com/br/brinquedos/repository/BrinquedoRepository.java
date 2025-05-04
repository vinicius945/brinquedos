package fiap.com.br.brinquedos.repository;

import fiap.com.br.brinquedos.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {



    List<Brinquedo> findByTipo(String tipo);


    List<Brinquedo> findByClassificacao(String classificacao);


    List<Brinquedo> findByPrecoLessThan(Double preco);


    List<Brinquedo> findByNomeContainingIgnoreCase(String nome);

}
