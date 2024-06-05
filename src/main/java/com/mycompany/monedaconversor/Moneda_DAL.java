/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monedaconversor;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author CHURCHILL
 */
public class Moneda_DAL {
    // Atributos
    private String nombre;
    private String codigo;
    private String simbolo;
    private HashMap<String, Double> cambios = new HashMap<>();

    // Constructor
    public Moneda_DAL(String nombre,String codigo, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.codigo = codigo;       
        setTipoCambio();
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public double getTipoCambio(String codigo) {
      return cambios.get(codigo);
    }

    public void setTipoCambio() {
        try {
            String APIdireccion = "https://v6.exchangerate-api.com/v6/0e651bc6d7d7762d8a4c311a/latest/"+getCodigo();
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(APIdireccion)).build();
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString() );
            
                    // Crear un objeto Gson
       
         // Parsear el JSON
        JsonElement jsonElement = JsonParser.parseString(response.body());
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonObject conversionRatesObject = jsonObject.getAsJsonObject("conversion_rates");

        // Iterar sobre los campos del objeto conversion_rates
        for (Map.Entry<String, JsonElement> entry : conversionRatesObject.entrySet()) {
            String currency = entry.getKey();
            double exchangeRate = entry.getValue().getAsDouble();
            cambios.put(currency, exchangeRate);
        }

            
        } catch (Exception e) {
        }
      
       
    }

    // Método para convertir una cantidad de esta moneda a otra moneda
    public double convertir(double cantidad, Moneda_DAL otraMoneda) {
        // Obtenemos la tasa de cambio de la moneda actual a la moneda destino
        Double tasaCambio = cambios.get(otraMoneda.getCodigo()); // Suponiendo que getCodigo() devuelve el código de la moneda

        // Verificamos si la tasa de cambio es nula
        if (tasaCambio == null) {
            throw new IllegalArgumentException("No se encontró la tasa de cambio para la moneda destino.");
        }
        
        // Convertimos la cantidad a la moneda destino
        return cantidad * tasaCambio;
    }


    // Método para imprimir detalles de la moneda
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Símbolo: " + simbolo + ", Tipos de Cambio: " + cambios.size();
    }
}
