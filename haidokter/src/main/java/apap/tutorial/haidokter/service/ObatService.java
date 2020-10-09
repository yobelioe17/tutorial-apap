package apap.tutorial.haidokter.service;

import apap.tutorial.haidokter.model.ObatModel;
import apap.tutorial.haidokter.model.ResepModel;


public interface ObatService {
    void addObat(ObatModel obat);

    void deleteObat(ObatModel obat);

    ObatModel getObatById(Long id);

    // Method untuk update obat
    ObatModel updateObat(ObatModel obatModel);
}