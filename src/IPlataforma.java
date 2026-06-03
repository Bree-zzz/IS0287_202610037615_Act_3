public interface IPlataforma {

AbonarCantidad (SaldoPendiente A){
    if (SaldoPendiente>0) {
        this.SaldoPendiente= SaldoPendiente-(SaldoPendiente*0.20);
    } else {
        System.out.println("El saldo debe ser mayor a 0")
    }
}

void CapitalizarIntereses (SaldoPendiente B) {
    SaldoPendiente1=((TasaInteres*SaldoPendiente)+SaldoPendiente)
}

}