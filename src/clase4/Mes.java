package clase4;
//sobrecarga de métodos
public class Mes {

    public static String getMes1(int mes){
        switch(mes){
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Ingrese un valor entre 1 y 12";
        }
    }

    public static int getMes2(String mes){
        switch(mes.toUpperCase()){
            case "ENERO": return 1;
            case "FEBRERO": return 2;
            case "MARZO": return 3;
            case "ABRIL": return 4;
            case "MAYO": return 5;
            case "JUNIO": return 6;
            case "JULIO": return 7;
            case "AGOSTO": return 8;
            case "SEPTIEMBRE": return 9;
            case "OCTUBRE": return 10;
            case "NOVIEMBRE": return 11;
            case "DICIEMBRE": return 12;
            default: return -1;
    }
}
}
