package StringPrograms;

import java.util.HashSet;
import java.util.Set;

public class LC929_UniqueEmailAddresses {

    // hashset | O(n*m) time | O(n*m) space
    static int numUniqueEmails(String[] emails) {
        Set<String> unique = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0].split("\\+")[0].replace(".", "");
            unique.add(local + "@" + parts[1]);
        }
        return unique.size();
    }

    void main() {
        System.out.println(numUniqueEmails(new String[]{
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"})); // 2

        System.out.println(numUniqueEmails(new String[]{
                "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"})); // 3
    }
}
