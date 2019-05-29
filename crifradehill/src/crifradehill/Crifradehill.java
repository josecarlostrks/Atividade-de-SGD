/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crifradehill;



/**
 *
 * @author carlos
 */
public class Crifradehill {

    public static void main(String[] args) {
        
        
        char vetor1[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                        'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int vetor2[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        
        int matriz[][]={{2,3},{1,5}};
        int tamanho = 0;
        int vetCifrar[]= new int[2];
        char vetCifrarC[] = new char[2];
        char buscarChar;
        int buscarInt;

        String cifrar = "BOMDIAALEGRIA";
//        char cifrarC[] = new char[cifrar.length()];
//        for(int k=0;k<cifrar.length();k++){
//            cifrarC[k]=cifrar.charAt(k);
//        }

        int cifrarCorrespondido[] = new int[cifrar.length()];
        
        
        for(int i=0;i<cifrar.length();i++){
            for(int j=0;j<26;j++){
                if(cifrar.charAt(i)==vetor1[j]){
                    cifrarCorrespondido[i]=vetor2[j];
                }
            }
            
        }
        char cifradoChar[] = new char[cifrar.length()];
        int cifrado2[] = new int[2];
        char cifrado2C[] = new char[2];
        int contadorDeCaractere = 0;
        
        while(contadorDeCaractere<cifrar.length()){
            if(tamanho<2){               
                vetCifrar[tamanho]= cifrarCorrespondido[contadorDeCaractere];
                if(tamanho==1){
                    int k = 0;
                    int l = 1;
                            System.out.println((matriz[k][k]*vetCifrar[k]+matriz[k][l]*vetCifrar[l])%26);
                            System.out.println((matriz[l][k]*vetCifrar[k]+matriz[l][l]*vetCifrar[l])%26);
                            cifrado2[k] = (matriz[k][k]*vetCifrar[k]+matriz[k][l]*vetCifrar[l])%26;
                            cifrado2[l]= (matriz[l][k]*vetCifrar[k]+matriz[l][l]*vetCifrar[l])%26; 
                            cifrado2C[k]=vetor1[cifrado2[k]];
                            cifrado2C[l]=vetor1[cifrado2[l]];
                            cifradoChar[contadorDeCaractere]=cifrado2C[k];
                            cifradoChar[contadorDeCaractere+1]=cifrado2C[l];

                }
                tamanho++;
            }else{ 
                tamanho=0;
            }
            contadorDeCaractere++;            
        }
        System.out.println(cifradoChar);

    }
        
}