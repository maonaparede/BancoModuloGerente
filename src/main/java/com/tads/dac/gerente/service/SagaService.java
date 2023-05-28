/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tads.dac.gerente.service;

import com.tads.dac.gerente.repository.GerenciadosRepository;
import com.tads.dac.gerente.repository.GerenteRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SagaService {
    
    @Autowired
    private GerenciadosRepository rep;
    
    public Long getGerenteMenosContas(Long idExcluir) throws Exception{
        List<Long> gerIds = rep.selectIdGerenteMenorNumGerenciados();
        if(!gerIds.isEmpty()){
            if(gerIds.size() > 1){
                if(!Objects.equals(gerIds.get(0), idExcluir)){
                    return gerIds.get(0);
                }else{
                    return gerIds.get(1);
                }
            }
            return gerIds.get(0);
        }
        throw new Exception("O BD de Gerente Está Vazio!");
    }
    
}
