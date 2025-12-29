package StringPrograms;

public class LC_168_ExcelSheetColumnTitle {

        static String convertToTitle(int columnNumber) {
            StringBuilder result = new StringBuilder();

            while (columnNumber > 0) {
                columnNumber--;  // Convert to 0-based
                char ch = (char) ('A' + (columnNumber % 26));
                result.append(ch);
                columnNumber /= 26;
            }

            return result.reverse().toString();
        }

        public static void main(String[] args) {
            System.out.print(convertToTitle(68));
        }

}
