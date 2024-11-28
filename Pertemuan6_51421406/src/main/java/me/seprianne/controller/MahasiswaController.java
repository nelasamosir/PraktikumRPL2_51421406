package me.seprianne.controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import me.seprianne.model.ModelMahasiswa;
import me.seprianne.service.MahasiswaService;

import java.util.List;
import org.springframework.stereotype.Controller;



@Controller
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    public String addMahasiswa (@RequestBody ModelMahasiswa mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa added Successfully";
    }
    public ModelMahasiswa getMahasiswa (@PathVariable int id){
        return mahasiswaService.getMhs(id);
    }
    public String updateMahasiswa (@RequestBody ModelMahasiswa mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa update Successfully";
}
    public String deleteMahasiswa (@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa Deleted Successfully";
    }
    public List<ModelMahasiswa> getAllMahasiswa(){
        return mahasiswaService.getAllMahasiswa();
        
    }
}
    
