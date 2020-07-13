package clase5;

public class TipoChar {
    public static void main(String[] args) {
        String str = "abc";
        char forma1[] = {'a', 'b', 'c'};
        char[] forma2=new char[3];
        forma2[0]='a';
        forma2[1]='b';
        forma2[2]='c';
        String str2 = new String(forma1);
        System.out.print(str + " "+ str2);
        System.out.println("");
        for(int i = 0; i<forma2.length; i++)
            System.out.print(forma2[i]);
        }

        /*int number1 = 5 ;
        Integer number2 = 5;
        double[] numeros = {1.5, 3.99, 45.5, 222.6};
        for(Double numero : numeros){
            System.out.println(numero.intValue());*/
}

