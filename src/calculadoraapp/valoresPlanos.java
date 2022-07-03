package calculadoraapp;

public class valoresPlanos {
    private double valorDia = 0;
   
    public valoresPlanos(int p){
        
            switch(p){
                case 20: 
                    this.valorDia = 1.666;
                    break;
		case 25:
                    this.valorDia = 1.996;
                    break;
		case 30:
                    this.valorDia = 2.333;
                    break;
                case 40:
                    this.valorDia = 2.496;
                    break;			
                case 100:
                    this.valorDia = 2.996;
                    break;		
		case 200:
                    this.valorDia = 3.333;
                    break;
                case 400:
                    this.valorDia = 4.996;
                    break;
		default:
                    this.valorDia = 0.0;
            }
            this.valorDia = valorDia;
        }
    
    public double getValoresPlanos(){
        return valorDia;
    }
    
    public void mostrarValorPlano(){
        System.out.println("O Valor diario do plano é: "+ getValoresPlanos());
        }
    
    }

