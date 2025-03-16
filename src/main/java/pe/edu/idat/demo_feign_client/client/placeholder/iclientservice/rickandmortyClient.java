package pe.edu.idat.demo_feign_client.client.placeholder.iclientservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@FeignClient(name = "userClient", url = "https://rickandmortyapi.com/api")
public interface rickandmortyClient {

    @GetMapping("/character")
    List<rickandmorty> obtenerLista();

    @GetMapping("/character/{id}")
    rickandmorty obtenerXid(@PathVariable("id") Long id);

   @PostMapping("/character")
    rickandmorty guardarUsuario(@RequestBody rickandmorty rickandmorty);

}
