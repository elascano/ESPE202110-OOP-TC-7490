/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Andy Calderon
 */
public interface DataPersistence {
    public void add(String data, String table);
    public ArrayList<String> read(String table);
    public void update(String table, String search, String date);
    public void delete(String table, String search);
}
