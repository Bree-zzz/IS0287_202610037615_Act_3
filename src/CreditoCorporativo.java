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

double Calculo = (MontoPrestado*0.20)+MontoPrestado;

    private String getId () {
        return Id;
    }
 

    private void setSaldoPendiente (){
        if (SaldoPendiente<0) {
            this.SaldoPendiente= SaldoPendiente;
        } else {
            System.out.println("Saldo pendiente no puede ser un número negativo.")
        }

    private void setEsRiesgoso (boolean EsRiesgoso) {
            if (SaldoPendiente>Calculo) {
                this.EsRiesgoso = true;
            } else {
                this.EsRiesgoso = false;
            }
        }

    }


}