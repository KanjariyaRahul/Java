import java.util.Scanner;

class NumberToWords {
    String[] units = {"", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN",
            "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN"};
    String[] tens = {"","", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY"};

    NumberToWords(int num) {
        
         if (num < 1 || num > 999) {
            System.out.println("Out Of Range.");
            return;
        }

        if (num >= 100) {
            System.out.print(units[num / 100] + " HUNDRED ");
            num %= 100;
        }

        if (num >= 20) {
            System.out.print(tens[num / 10] + " ");
            num %= 10;
        }

        if (num > 0) {
            System.out.print(units[num]);
        }
    }
}

class NumberToWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a natural number less than 1000: ");
            int num = scanner.nextInt();
        new NumberToWords(num);
            System.out.println();
        }
    }
}
