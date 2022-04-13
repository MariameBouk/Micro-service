package com.example.compteservice.services;

import com.example.compteservice.entities.Compte;
import com.example.compteservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompteServiceImpl implements CompteService {
    @Autowired
    private CompteRepository compteRepository;
    @Override
    public void virement(Long codeSource, Long codeDestination, double montant) {
        Compte cp1 = compteRepository.getById(codeSource);
        Compte cp2 = compteRepository.getById(codeDestination);
        cp1.setSolde(cp1.getSolde() - montant);
        cp2.setSolde(cp2.getSolde() + montant);
        compteRepository.save(cp1);
        compteRepository.save(cp2);
    }
}
