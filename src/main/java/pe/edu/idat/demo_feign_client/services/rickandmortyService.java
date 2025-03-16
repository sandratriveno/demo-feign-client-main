package pe.edu.idat.demo_feign_client.services;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmorty;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmortyClient;

import java.util.List;

@Service
public class rickandmortyService implements IrickandmortyService {

    private final rickandmortyClient rickandmortyClient;

    public rickandmortyService(rickandmortyClient rickandmortyClient) {
        this.rickandmortyClient = rickandmortyClient;
    }

    @Override
    public List<rickandmorty> obtenerLista() {
        return rickandmortyClient.obtenerLista();
    }

    @Override
    public rickandmorty obtenerXid(Long id) {
        return rickandmortyClient.obtenerXid(id);
    }

}