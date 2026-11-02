package block2.pract13.task3;

import java.util.StringTokenizer;

public class Address {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    private String get(String[] parts, int i) {
        if (i<parts.length) {
            return parts[i].trim();
        }
        return "";
    }

    private void fill(String[] parts) {
        country=get(parts, 0);
        region=get(parts, 1);
        city=get(parts, 2);
        street=get(parts, 3);
        house=get(parts, 4);
        building=get(parts, 5);
        flat=get(parts, 6);
    }

    public void Split(String line) {
        String[] parts=line.split(",");
        fill(parts);
    }

    public void Tokenizer(String line) {
        StringTokenizer st=new StringTokenizer(line, ",.;");
        String[] parts=new String[st.countTokens()];
        int i=0;
        while (st.hasMoreTokens()) {
            parts[i]=st.nextToken();
            i++;
        }
        fill(parts);
    }

    @Override
    public String toString() {
        return "страна: "+country
                +", регион "+region
                +", город "+city
                +", улица "+street
                +", дом "+house
                +", корпус "+building
                +", квартира "+flat;
    }
}
