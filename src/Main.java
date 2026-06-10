public class Main {
public static void main(String[] args) {

CreditoCorporativo Credito1 = new CreditoCorporativo ("CORP-99",10000,0.05);
System.out.println(Credito1.getId()+Credito1.getMontoPrestado()+Credito1.getTasaInteres());

for (int i=0;i<=5;i++){
    CreditoCorporativo CapitalizarIntereses = new CreditoCorporativo("CORP-99", 10000, 0.05, 10000, false);
    double SaldoPendiente2= SaldoPendiente.CapitalizarIntereses();
}


}
}