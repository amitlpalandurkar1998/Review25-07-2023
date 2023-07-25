package uppercasetolowercase;

public class Methods {

    void convertToLowerC(String UpperCase) {
        String convertString = null;
        char[] charArray = UpperCase.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        convertString = new  String(charArray);

        System.out.println(convertString);
    }
}
