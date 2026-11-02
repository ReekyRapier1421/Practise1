package block2.pract13.task5;

public class PhoneNumber {
    private String code;
    private String number;

    public PhoneNumber(String raw) {
        String digits=raw.replaceAll("[^0-9]", "");
        if (raw.startsWith("8") && digits.length()==11) {
            code="7";
            number=digits.substring(1);
        } else {
            number=digits.substring(digits.length()-10);
            code=digits.substring(0, digits.length()-10);
        }
    }

    public String getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("+").append(code);
        sb.append(number, 0, 3).append("-");
        sb.append(number, 3, 6).append("-");
        sb.append(number, 6, 10);
        return sb.toString();
    }
}
