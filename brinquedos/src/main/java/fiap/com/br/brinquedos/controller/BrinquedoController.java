package fiap.com.br.brinquedos.controller;


import fiap.com.br.brinquedos.model.Brinquedo;
import fiap.com.br.brinquedos.service.BrinquedoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoService brinquedoService;

    @GetMapping
    public List<Brinquedo> getAllBrinquedos() {
        return brinquedoService.getAllBrinquedos();
    }

    @GetMapping("/tipo/{tipo}")
    public List<Brinquedo> getBrinquedosByTipo(@PathVariable String tipo) {
        return brinquedoService.getBrinquedosByTipo(tipo);
    }

    @GetMapping("/classificacao/{classificacao}")
    public List<Brinquedo> getBrinquedosByclassificacao(@PathVariable String classificacao) {
        return brinquedoService.getBrinquedosByClassificacao(classificacao);
    }
    @GetMapping("/preco/{preco}")
    public List<Brinquedo> getBrinquedosByPreco(@PathVariable double preco) {
        return brinquedoService.getBrinquedosByPrecoLessThan(preco);
    }

    @GetMapping("/nome/{nome}")
    public List<Brinquedo> getBrinquedosByNome(@PathVariable String nome) {
        return brinquedoService.getBrinquedosByNomeContaining(nome);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> getBrinquedoById(@PathVariable Long id) {
        Optional<Brinquedo> brinquedo = brinquedoService.getBrinquedoById(id);
        return brinquedo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Brinquedo> createBrinquedo(@RequestBody Brinquedo brinquedo) {
        Brinquedo saveBrinquedo = brinquedoService.saveBrinquedo(brinquedo);
        return new ResponseEntity<>(saveBrinquedo, HttpStatus.CREATED);
    }
}
