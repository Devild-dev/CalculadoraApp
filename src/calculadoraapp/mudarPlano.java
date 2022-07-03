package calculadoraapp;

public class mudarPlano implements Controlador {
    private int qtdDias;
    private double planoAtual;
    private double planoNovo;
    
    public mudarPlano(int qtdDias, double planoAtual, double planoNovo){
        this.planoAtual = planoAtual;
        this.planoNovo = planoNovo;
        this.qtdDias = qtdDias;
    }

    public double getPlanoAtual() {
        return planoAtual;
    }

    public void setPlanoAtual(int planoAtual) {
        this.planoAtual = planoAtual;
    }

    public double getPlanoNovo() {
        return planoNovo;
    }

    public void setPlanoNovo(int planoNovo) {
        this.planoNovo = planoNovo;
    }
    
    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    @Override
    public void calcular(int a, int b) {//dataMud = a - dataPag = b
        if(a > b){
            this.planoAtual *= (a - b);//valor referente a dias do plano antigo
            this.planoNovo *= ((this.qtdDias - a) + b);//referente a dias do plano novo
            this.planoNovo += this.planoAtual; // recebe o total da soma 
        }else{
            this.planoAtual *= ((this.qtdDias + (a-1)) - b);
            this.planoNovo *= (b - a);
            this.planoNovo += this.planoAtual;
        }    
        this.planoNovo = planoNovo;     
    }
    
    public void mostrarMudanca(){
        String resultado = String.format("R$%.2f", getPlanoNovo());
        System.out.println("O total é: "+resultado);
    }       
    
    
}
