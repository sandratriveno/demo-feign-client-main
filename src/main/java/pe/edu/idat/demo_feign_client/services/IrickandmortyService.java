package pe.edu.idat.demo_feign_client.services;

import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmorty;
import java.util.List;

public interface IrickandmortyService {

    List<rickandmorty> obtenerLista();

    rickandmorty obtenerXid(Long id);

}