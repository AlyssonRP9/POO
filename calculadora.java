package com.company;

public class calculadora {
    //atributos;
    public float registrador{
        public calculadora(){
            this.registrador = 0;
        }
        public void add(float valor){
            this.valor += valor;
        }
        public void mult(float valor){
            this.valor -= valor;
        }
        public void div(float valor){
            this.valor /= valor;
        }

        public void addm(float[] valores){
            for(int i = 0; i < valores.length; i++){
                this.registrador += valores[i];
            }
        }

        public float show(){
            return this.registrador;
        }

    }

}
