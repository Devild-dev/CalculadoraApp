package calculadoraapp;

import java.util.Scanner;

public class TesteProporcional {
    
    public static void main(String[] args){
    Scanner scanf = new Scanner(System.in);//permite trabalhar com o Scanner
    int dataInst, dataPag, planoEsc, mesRef;
    
        do{
           System.out.println("Qual o Mês da Instalação: ");//solicita o mes da operação
           mesRef = scanf.nextInt();
            
        }while(mesRef < 1 || mesRef > 12);
        
        mes mes1 = new mes(mesRef);//quantidade de dias do mes de referencia  
        quantidadeDias qtdDias = new quantidadeDias(mes1.getMes());
        int qt = qtdDias.getQuantidadeDias();
      
        do{
            System.out.println("Digite a data da Instalacao: ");//data da instalação
            dataInst = scanf.nextInt();
        }while(dataInst < 1 || dataInst > qt);
        
        do{
            System.out.println("Digite a data de Pagamento: ");//data do pagamento
            dataPag = scanf.nextInt();
        }while(dataPag < 1 || (dataPag % 5) != 0 || dataPag > qt );
        
        do{
            System.out.println("Digite qual o plano Escolhido");//insere o plano: 20, 25, 30, 40, 100, 200 e 400Mbps
            planoEsc = scanf.nextInt();
        }while(planoEsc != 20 && planoEsc != 25 && planoEsc != 30 && planoEsc != 40 && planoEsc != 100 && planoEsc != 200 || planoEsc != 400);
        
        
        planos plano1 = new planos(planoEsc);//int p = plano1.getPlanos();//plano1.getPlanos();
        valoresPlanos valorPlano = new valoresPlanos(plano1.getPlanos());//pega os valores diários do plano escolhido//valorPlano.mostrarValorPlano();
        
        double vp = valorPlano.getValoresPlanos();
        
        proporcional prop1 = new proporcional(qt,vp);
        prop1.calcular(dataInst, dataPag);
        prop1.mostrarProporcional();
       
       
    }

}
