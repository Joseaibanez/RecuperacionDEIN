/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mostrardatos_recuperacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Besitzer
 */
public class Lineas {
    
    List<String> lista;
    List<String> leerCsv;
    public Lineas() throws IOException {
        lista = new ArrayList<>();
    }

    public List<String> leerCsv(String csv) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(csv));
        while((br.read()) != -1) {
            String linea = br.readLine();
            lista.add(linea);
        }
        br.close();
        return lista;
        
    }
    public static void main(String[] args) {
        
    }
}


