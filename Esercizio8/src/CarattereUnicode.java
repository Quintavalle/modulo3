public class CarattereUnicode {
    private String inputString;

    public CarattereUnicode(String inputString) {
        this.inputString = inputString;
    }

    public String getCarattereUnicode(int index) {
        if (index < 0 || index >= inputString.length()) {
            return "Errore: Indice non valido";
        }

        char character = inputString.charAt(index);
        int unicodeValue = (int) character;

        StringBuilder result = new StringBuilder();
        result.append("Il carattere '").append(character).append("' all'indice ").append(index);
        result.append(" ha il valore Unicode: ").append(unicodeValue);

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Ciao, mondo!";
        CarattereUnicode carattereUnicode = new CarattereUnicode(input);

        int index = 5;

        String result = carattereUnicode.getCarattereUnicode(index);
        System.out.println(result);
    }
}
