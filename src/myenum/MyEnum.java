package myenum;

public class MyEnum {
   
    public static void main(String[] args) {
        String monthFormat = "Название месяца %10s, номер в году %s, название на русском %10s, число дней %d";
        Months.FEBRARY.setDays(29);
        
        for (Months mes : Months.values()) {
            System.out.printf(monthFormat, mes, mes.getNumber(), mes.getNameRus(), mes.getDays());
            System.out.println();
        }
    }
    
}
