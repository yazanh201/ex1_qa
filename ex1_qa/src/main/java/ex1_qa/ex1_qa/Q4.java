package ex1_qa.ex1_qa;

public class Q4 {

    public static String Comapre(Object a, Object b, String mod) {
        try {
            // בדוק אם הקלטים הם מספרים
            double numA = Double.parseDouble(a.toString());
            double numB = Double.parseDouble(b.toString());

            // טיפול במקרה של חלוקה באפס
            if (mod.equals("reciprocals") && (numA == 0 || numB == 0)) {
                return "error";  // אם אחד המספרים הוא אפס, תחזור עם error
            }

            switch (mod) {
                case "regular":
                    if (numA < numB)
                        return "B";
                    else
                        return "A";

                case "negatives":
                    if (-numA < -numB)
                        return "B";
                    else
                        return "A";

                case "reciprocals":
                    if (1 / numA < 1 / numB)
                        return "B";
                    else
                        return "A";

                default:
                    return "error"; // מוד לא חוקי
            }
        } catch (NumberFormatException | ArithmeticException e) {
            // חריגות עבור ערכים לא חוקיים
            return "error";
        }
    }
}
