package pe.edu.idat.demo_feign_client.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmorty;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmortyClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class rickandmortyService implements IrickandmortyService {

    private final rickandmortyClient rickandmortyClient;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public rickandmortyService(rickandmortyClient rickandmortyClient) {
        this.rickandmortyClient = rickandmortyClient;
    }

    @Override
    public List<rickandmorty> obtenerLista() {
        Map<String, Object> response = rickandmortyClient.obtenerLista();
        List<?> rawList = (List<?>) response.get("results");

        List<rickandmorty> personajes = new ArrayList<>();
        for (Object obj : rawList) {
            rickandmorty personaje = objectMapper.convertValue(obj, rickandmorty.class);
            personajes.add(personaje);
        }

        return personajes;
    }

    @Override
    public rickandmorty obtenerXid(Long id) {
        return rickandmortyClient.obtenerXid(id);
    }

}