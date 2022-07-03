package calculadoraapp;

public class proporcional implements Controlador{
         private int periodo;
         private double valor;

    public proporcional(int periodo, double valor) {
        this.periodo = periodo;
        this.valor = valor;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void calcular(int a, int b) {
        if(a > b){
            this.periodo = b + this.periodo;
            this.periodo -= a;
            this.valor = this.periodo * this.valor;
       }else{
           b -=  a;
           this.valor = b * this.valor;
       }   
       this.valor = valor;
    }  
        public void mostrarProporcional(){
        String resultado = String.format("R$%.2f", getValor());
        System.out.println("O proporcional é: "+resultado);
    }       
}


