public class GestorDeCobranza {
private CreditoCorporativo c;

GestorDeCobranza (){
this.c=c;
}

public void IntentarLiquidacionMaliciosa (CreditoCorporativo c) {
//c.SaldoPendiente=0;
  System.out.println("Error al acceder al saldo pendiente.");

  c.AbonarCantidad(-100);
}

public void AplicarAlivioFinanciero(CreditoCorporativo c) {
    double SaldoActual = c.getSaldoPendiente();
    double Descuento = SaldoActual*0.50;
    c.AbonarCantidad(Descuento);
    System.out.println ("Se realizo un abono del 50%");

}

}