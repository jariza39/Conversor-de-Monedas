public class App {
    public static void main(String[] args) throws Exception {
        ConversorMonedas conversor = new ConversorMonedas();
        System.out.println("Ingrese el valor moneda a convertir: ");
        double valor = Double.parseDouble(System.console().readLine());
        System.out.println("Seleccione el tipo de conversion: ");
        System.out.println("1. De dolares a euros");
        System.out.println("2. De euros a dolares");
        System.out.println("3. De dolares a pesos");
        System.out.println("4. De pesos a dolares");
        System.out.println("5. De euros a pesos");
        System.out.println("6. De pesos a euros");
        int tipo = Integer.parseInt(System.console().readLine());
        

        switch(tipo){
            case 1:
                System.out.println("El valor en euros es: " + conversor.convertirDolaresAEuros(valor));
                break;
            case 2:
                System.out.println("El valor en dolares es: " + conversor.convertirEurosADolares(valor));
                break;
            case 3:
                System.out.println("El valor en pesos es: " + conversor.convertirDolaresAPesos(valor));
                break;
            case 4:
                System.out.println("El valor en dolares es: " + conversor.convertirPesosADolares(valor));
                break;
            case 5:
                System.out.println("El valor en pesos es: " + conversor.convertirEurosAPesos(valor));
                break;
            case 6:
                System.out.println("El valor en euros es: " + conversor.convertirPesosAEuros(valor));
                break;
            default:
                System.out.println("Opcion no valida");
                break;


        }
    }
}
