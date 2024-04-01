package com.example.foyerrouamnissi.Services.Foyer;

import com.example.foyerrouamnissi.DAO.Entities.Bloc;
import com.example.foyerrouamnissi.DAO.Entities.Chambre;
import com.example.foyerrouamnissi.DAO.Entities.Foyer;

import java.util.List;
import java.util.Map;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);

    List<Foyer> addFoyer(List<Foyer> foyer);

    Foyer editFoyer(Foyer foyer);

    List<Foyer> findAll();

    Foyer findById(long id);

    void deleteById(long id);

    void delete(Foyer foyer);

  


}