package Clase7;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class UltimosMovimientos {

    public static void main(String args[]) {
        Map<String, Double> movimiento = new HashMap<>();
        movimiento.put("Saldo inicial", 5000.00);
        movimiento.put("Pago de TC", -1520.00);
        movimiento.put("Sueldo", 3000.00);
        movimiento.put("Compra en supermercado", -138.00);
        movimiento.put("Saldo Final", 6342.00);
        double mayorGasto = 0.0;
        double saldoFinal = 0.0;
        double balance = 0.0;
        String conceptoGasto = "";

        for (Map.Entry<String, Double> entry : movimiento.entrySet()) {
            if (entry.getValue() < mayorGasto) {
                mayorGasto = entry.getValue();
                conceptoGasto = entry.getKey();
            }
            if (entry.getKey().equals("Saldo Final")) {
                saldoFinal = entry.getValue();
            }else{
                    balance += entry.getValue();
                }
            }
        System.out.println("El mayor gasto fue "+ mayorGasto +" por concepto de "+ conceptoGasto);
        //System.out.println("El saldo final fue calculado correctamente "+ (balance.equals(saldoFinal)));

}
}
