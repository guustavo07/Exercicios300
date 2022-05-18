/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Questao4;

/**
 *
 * @author Hanne
 */
public class Veiculo {
    private String cor;
    private String placa;
    private String modelo;
    private int ano;
    private double qtdeCombustivel;
    
    Veiculo (String cor, String placa, String modelo, int ano, double comb){
        setCor(cor);
        setPlaca(placa);
        setModelo(modelo);
        setAno(ano);
        setComb(comb);
    }
 
    private void setCor(String cor){
        this.cor = cor;
    }
    
    private void setPlaca(String placa){
        this.placa = placa;
    }
    
    private void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    private void setAno(int ano){
        this.ano = ano;
    }
    
    private void setComb(double comb){
        this.qtdeCombustivel = comb;
    }

    public String getCor(){
        return cor;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getAno(int ano){
        return ano;
    }
    
    public double getComb(double comb){
        return comb;
    }
   
    public int verificaPlaca(String placa){
        int vogal = 0;
        for(int i=0;i<placa.length();i++){
            if(placa.charAt(i) == 'a' || placa.charAt(i) == 'A' || placa.charAt(i) == 'e' || placa.charAt(i) == 'E' || placa.charAt(i) == 'i' || placa.charAt(i) == 'I' || placa.charAt(i) == 'o' || placa.charAt(i) == 'O' || placa.charAt(i) == 'u' || placa.charAt(i) == 'U'){
                vogal++;
            }
        }        
        return vogal;
    
        }
    
}
