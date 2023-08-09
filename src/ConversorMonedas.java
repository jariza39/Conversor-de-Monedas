//Crea una clase ConversorMonedas que contenga métodos para convertir una 
//cantidad de dinero de una moneda a otra, por ejemplo, de dólares a euros o de pesos a dólares.
public class ConversorMonedas {
    
    public  double convertirDolaresAEuros(double dolares) {
        return dolares * 0.85;
    }
    public double convertirEurosADolares(double euros) {
        return euros * 1.18;
    }
    public double convertirDolaresAPesos(double dolares) {
        return dolares * 20.08;
    }
    public  double convertirPesosADolares(double pesos) {
        return pesos * 0.050;
    }
    public double convertirEurosAPesos(double euros) {
        return euros * 23.63;
    }
    public double convertirPesosAEuros(double pesos) {
        return pesos * 0.042;
    }

}
