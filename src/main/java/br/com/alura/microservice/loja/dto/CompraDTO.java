package br.com.alura.microservice.loja.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompraDTO {
    
    private List<ItemDaCompraDTO> items;
    private EnderecoDTO endereco;
}
