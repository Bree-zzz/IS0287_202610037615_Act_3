public class CreditoCorporativo {
    private String Id;
    private double MontoPrestado;
    private double SaldoPendiente;
    private double TasaInteres;
    private boolean EsRiesgoso;

    CreditoCorporativo ( String Id, double MontoPrestado, double SaldoPendiente, double TasaInteres, double EsRiesgoso) {
        this.Id= Id;
        this.MontoPrestado= MontoPrestado;
        this.SaldoPendiente= SaldoPendiente;
        this.TasaInteres= TasaInteres;
        this.EsRiesgoso= EsRiesgoso;

    }
}