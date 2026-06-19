public class Main {
public static void main(String[] args) {
    CreditoCorporativo credito1 = new CreditoCorporativo("CORP-99", 10000, 0.05, 10000);

    for (int i=1; i<=5; i++) {
        credito1.CapitalizarIntereses();

        System.out.println( "Solicitud: "+i+"- Saldo: $"+
        credito1.getSaldoPendiente()
        );
    }

    if (credito1.getEsRiesgoso()) {
        System.out.println("El credito es riesgoso.");
    } else {
        System.out.println("Puede continuar");
    }

    System.out.println("Saldo inicial: "+credito1.getMontoPrestado());
    GestorDeCobranza Gestor1 = new GestorDeCobranza();

    Gestor1.IntentarLiquidacionMaliciosa(credito1);
    Gestor1.AplicarAlivioFinanciero(credito1);
    System.out.println("Saldo luego de descuento: $"+credito1.getSaldoPendiente());

}
}