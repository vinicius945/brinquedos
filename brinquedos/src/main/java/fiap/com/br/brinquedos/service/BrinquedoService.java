package fiap.com.br.brinquedos.service;

import fiap.com.br.brinquedos.model.Brinquedo;
import fiap.com.br.brinquedos.repository.BrinquedoRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {
    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public Brinquedo saveBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public List<Brinquedo> getAllBrinquedos() {
        return  brinquedoRepository.findAll();
    }

    public List<Brinquedo> getBrinquedosByTipo(String tipo) {
        return brinquedoRepository.findByTipo(tipo);
    }

    public List<Brinquedo> getBrinquedosByClassificacao(String classificacao) {
        return brinquedoRepository.findByClassificacao(classificacao);
    }

    public List<Brinquedo> getBrinquedosByPrecoLessThan(Double preco) {
        return brinquedoRepository.findByPrecoLessThan(preco);
    }

    public List<Brinquedo> getBrinquedosByNomeContaining(String nome) {
        return brinquedoRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Optional<Brinquedo> getBrinquedoById(Long id) {
        return brinquedoRepository.findById(id);
    }
}
