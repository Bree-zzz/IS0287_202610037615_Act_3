public class CreditoCorporativo {
    private String Id;
    private double MontoPrestado;
    private double SaldoPendiente;
    private double TasaInteres;
    private boolean EsRiesgoso;

    CreditoCorporativo (String Id, double MontoPrestado, double TasaInteres) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= TasaInteres;
        this.EsRiesgoso= EsRiesgoso;
    }

    CreditoCorporativo (String Id, double MontoPrestado, double TasaInteres, double SaldoPendiente, boolean EsRiesgoso) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= TasaInteres;
        this.EsRiesgoso= EsRiesgoso;
        this.SaldoPendiente= SaldoPendiente;       
    }

    CreditoCorporativo (String Id, double MontoPrestado, double TasaInteres, boolean EsRiesgoso) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.TasaInteres= 0.015;
        this.EsRiesgoso= EsRiesgoso;       
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



    public double setSaldoPendiente (double SaldoPendiente1){
        if (SaldoPendiente1<=0) {
            this.SaldoPendiente= SaldoPendiente1;
        } else {
            System.out.println("Saldo pendiente no puede ser un número negativo.")
        }
    }
    public void setEsRiesgoso (boolean EsRiesgoso) {
        double Calculo = (MontoPrestado*0.20)+MontoPrestado;
            if (SaldoPendiente>Calculo) {
                this.EsRiesgoso = true;
            } else {
                this.EsRiesgoso = false;
            }
        }
        
    public void AbonarCantidad (double SaldoPendiente){
    if (SaldoPendiente>0) {
        this.SaldoPendiente= SaldoPendiente;
    } else {
        System.out.println("El valor debe ser mayor a 0");
    }

}
    public void CapitalizarIntereses (double SaldoPendiente) {
        double Calculo = (MontoPrestado*0.20)+MontoPrestado;
}

//  public setCalculo (double Calculo){
//     this.Calculo=Calculo;
//  }
    


}