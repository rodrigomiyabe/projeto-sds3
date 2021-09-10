package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

//Camada que faz acesso ao banco de dados
@Service
public class SellerService {

    @Autowired // faz a injecao de dependencia(nao precisa declarar a classe new Seller)
    private SellerRepository repository;

    //Lista todos os Sellers
    public List<SellerDTO> findAll(){
        List<Seller> result = repository.findAll();
        return result.stream().map(x->new SellerDTO(x)).collect(Collectors.toList());
    }

}
