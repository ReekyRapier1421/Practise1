package block1.pract3.converter;

public class Converter {

    private String[] codes={"RUB", "USD", "EUR", "CNY", "GBP", "AMD"};
    private String[] names={"Рубль", "Доллар США", "Евро", "Юань", "Фунт стерлингов", "Армянский драм"};
    private double[] kurs={1.0, 80.50, 95.30, 11.20, 110.75, 0.21};

    public int index(String code) {
        for (int i=0; i<codes.length; i++) {
            if (codes[i].equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }


    public String getnames(String code) {
        int i=index(code);
        if (i<0) {
            return "валюта не вреная";
        }
        return names[i];
    }



    public double convert(double count, String from, String to) {
        int i=index(from);
        int j=index(to);
        if (i<0 || j<0) {
            return -1;
        }
        double rub=count * kurs[i];
        return rub / kurs[j];
    }


    public String format(double count, String code) {
        return String.format("%.2f %s", count, getnames(code));
    }


    public void Rates() {
        for (int i=0; i<codes.length; i++) {
            System.out.println(codes[i]+" - "+names[i]+" - "+kurs[i]);
        }
    }
}
