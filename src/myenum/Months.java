package myenum;

enum Months {
    JANUARY("01", "Январь", 31),
    FEBRARY("02", "Февраль", 28),
    MARCH("03", "Март", 31),
    APRIL("04", "Апрель", 30),
    MAY("05", "Май", 31),
    JUNE("06", "Июнь", 30),
    JULY("07", "Июль", 31),
    AUGUST("08", "Август", 31),
    SEPTEMBER("09", "Сентябрь", 30),
    OCTOBER("10", "Октябрь", 31),
    NOVEMBER("11", "Ноябрь", 30),
    DECEMBER("12", "Декабрь", 31);
    
    private final String number;
    private final String nameRus;
    private int days;

    public String getNumber() {
        return number;
    }

    public String getNameRus() {
        return nameRus;
    }
    
    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
      
    Months(String number, String nameRus, int days) {
        this.number = number;
        this.nameRus = nameRus;
        this.days = days;
    }
}
