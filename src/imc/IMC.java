/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author 31240550
 */
public class IMC {

    public float calcIMC(float altura, float peso) {
        float imc = (float) (peso / Math.pow(altura, 2));
        if (imc >= 17 && imc <= 18) {
            System.out.println("RISCO BAIXO: Você está abaixo do peso recomendado");
            return imc;
        } else if (imc > 18 && imc <= 24) {
            System.out.println("IDEAL: Você está muito bem! Continue assim");
            return imc;
        } else if (imc > 24 && imc <= 27) {
            System.out.println("RISCO MODERADO: Você está acima do peso recomendado. Cuidado!");
            return imc;
        }
        System.out.println("RISCO ELEVADO: Você está obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas");
        return imc;

    }

}
