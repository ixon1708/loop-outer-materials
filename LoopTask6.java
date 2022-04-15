public class LoopTask6 {
    public static void main(String[] args) {
        //это переделка решения примера из материала, не 5 задачи
        String searchMe = "Мама мыла раму. И домыла :)";
        int max = searchMe.length();
        char symbol = 'ы';
        int findCount = 0;
        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == symbol) {
                findCount++;
                if (findCount == 2) {
                    break;
                }
            }
        }
        if (findCount == 2) {
            System.out.println("Символ '" + symbol + "' найден в строке дважды.");
        } else if (findCount == 1) {
            System.out.println("Символ '" + symbol + "' найден в строке.");
        } else {
            System.out.println("Символ '" + symbol + "' не найден в строке");
        }
    }
}
