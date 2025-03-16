package pe.edu.idat.demo_feign_client.controllers;

import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_feign_client.client.placeholder.iclientservice.rickandmorty;
import pe.edu.idat.demo_feign_client.services.IrickandmortyService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/character")
public class rickandmortyController {
    private  final IrickandmortyService irickandmortyService;

    public rickandmortyController(IrickandmortyService irickandmortyService) {
        this.irickandmortyService = irickandmortyService;
    }
    @GetMapping
    public List<rickandmorty> getlista(){
        return  irickandmortyService.obtenerLista();
    }
    @GetMapping("/{id}")
    public rickandmorty getUserById(@PathVariable Long id){
        return  irickandmortyService.obtenerXid(id);
    }

}
