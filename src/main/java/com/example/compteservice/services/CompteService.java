package com.example.compteservice.services;

public interface CompteService {
    public void virement(Long codeSource, Long codeDestination, double montant);
}
