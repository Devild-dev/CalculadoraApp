package calculadoraapp;

import java.util.Scanner;

public class TesteMudancaPlano {
    
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);//permite trabalhar com o Scanner
        int mesRef, planoEsc1, planoEsc2, dataMud, dataPag;
        
        do{
           System.out.println("Qual o Mês da Instalação: ");//solicita o mes da operação
           mesRef = scanf.nextInt();
            
        }while(mesRef < 1 || mesRef > 12);
        
        mes mes1 = new mes(mesRef);//quantidade de dias do mes de referencia  
        quantidadeDias qtdDias = new quantidadeDias(mes1.getMes());
        int qt = qtdDias.getQuantidadeDias();
        
        do{
            System.out.println("Digite qual o plano Escolhido");//insere o plano: 20, 25, 30, 40, 100, 200 e 400Mbps
            planoEsc1 = scanf.nextInt();
        }while(planoEsc1 != 20 && planoEsc1 != 25 && planoEsc1 != 30 && planoEsc1 != 40 && planoEsc1 != 100 && planoEsc1 != 200 && planoEsc1 != 400);
        
        planos plano1 = new planos(planoEsc1);//int p = plano1.getPlanos();//plano1.getPlanos();
        valoresPlanos valorPlano = new valoresPlanos(plano1.getPlanos());//pega os valores diários do plano escolhido//valorPlano.mostrarValorPlano();
        double vp1 = valorPlano.getValoresPlanos();
        
        do{
            System.out.println("Digite qual o plano Escolhido");//insere o plano: 20, 25, 30, 40, 100, 200 e 400Mbps
            planoEsc2 = scanf.nextInt();
        }while(planoEsc2 != 20 && planoEsc2 != 25 && planoEsc2 != 30 && planoEsc2 != 40 && planoEsc2 != 100 && planoEsc2 != 200 && planoEsc2 != 400);
        
        planos plano2 = new planos(planoEsc2);//int p = plano1.getPlanos();//plano1.getPlanos();
        valoresPlanos valorPlano2 = new valoresPlanos(plano2.getPlanos());//pega os valores diários do plano escolhido//valorPlano.mostrarValorPlano();
        double vp2 = valorPlano2.getValoresPlanos();
        
       do{
            System.out.println("Digite a data da Mudança do Plano: ");//data da instalação
            dataMud = scanf.nextInt();
        }while(dataMud < 1 || dataMud > qt);
       
       do{
            System.out.println("Digite a data do Pagamento do Cliente: ");//data da instalação
            dataPag = scanf.nextInt();
        }while(dataPag < 1 || dataPag > qt);
        
        
        mudarPlano mudanca = new mudarPlano(qt,vp1,vp2);
        mudanca.calcular(dataMud, dataPag);
        mudanca.mostrarMudanca();
        
    }
    
}
