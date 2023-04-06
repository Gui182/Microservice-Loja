package br.com.alura.microservice.loja.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InforFornecedorDTO;

@Service
public class CompraService {

    public void realizaCompra(CompraDTO compra) {

        RestTemplate client = new RestTemplate();
        ResponseEntity<InforFornecedorDTO> exchange = client.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado(),
        HttpMethod.GET, null, InforFornecedorDTO.class);

        System.out.println(exchange.getBody().getEndereco());
    }
    
}