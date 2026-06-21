public class CreditoCorporativo {
    private final String Id;
    private double MontoPrestado;
    private double SaldoPendiente;
    private double TasaInteres;
    private boolean EsRiesgoso;

    CreditoCorporativo (String Id, double MontoPrestado, double TasaInteres) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= TasaInteres;
        ActualizarRiesgo();
    }

    CreditoCorporativo (String Id, double MontoPrestado, double TasaInteres, double SaldoPendiente) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= TasaInteres;
        this.SaldoPendiente= SaldoPendiente; 
        ActualizarRiesgo();      
    }

    CreditoCorporativo (String Id, double MontoPrestado) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= 0.015;
        ActualizarRiesgo();      
    }

        public String getId () {
        return Id;
    }

        public double getMontoPrestado () {
        return MontoPrestado;
    }

        public double getTasaInteres () {
        return TasaInteres;
    }

       public double getSaldoPendiente () {
        return SaldoPendiente;
    }

       public boolean getEsRiesgoso () {
        return EsRiesgoso;
    }



    public void setSaldoPendiente (double SaldoPendiente1){
        if (SaldoPendiente1>=0) {
            this.SaldoPendiente= SaldoPendiente1;
            ActualizarRiesgo();
        } else {
            System.out.println("Saldo pendiente no puede ser un número negativo.")
        }
    }
    
        
    public void AbonarCantidad (double Cantidad){
    if (Cantidad <= 0) {
        System.out.println("La cantidad debe ser mayor a 0");
        return;

    } if (SaldoPendiente - Cantidad < 0){
        System.out.println("Rechazada");
        return;}

        SaldoPendiente -= Cantidad;
        ActualizarRiesgo();
    } 

    public void CapitalizarIntereses () {
        double interes = SaldoPendiente*TasaInteres;
        SaldoPendiente+= interes;
        ActualizarRiesgo();
        if (EsRiesgoso) {
           System.out.println("El credito es riesgoso"); 
        }
}

private void ActualizarRiesgo(){
    EsRiesgoso= SaldoPendiente>(MontoPrestado*1.20);
}

    


}