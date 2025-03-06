public class HashFunctionChecker {

    // Hash function implementation
    public static int hashFunction(String s) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash += (i + 1) * (s.charAt(i) - 'a' + 1);
        }
        return hash;
    }

    public static void main(String[] args) {
        // Pairs of strings to compare
        String[][] pairs = {
                {"gg", "gg"},
                {"gg", "gg"},
                {"gg", "gg"},
                {"gg", "gg"}
        };

        // Compare hash values for each pair
        for (String[] pair : pairs) {
            String str1 = pair[0];
            String str2 = pair[1];

            int hash1 = hashFunction(str1);
            int hash2 = hashFunction(str2);

            System.out.println("Hash of \"" + str1 + "\": " + hash1);
            System.out.println("Hash of \"" + str2 + "\": " + hash2);

            if (hash1 == hash2) {
                System.out.println("Result: Hashes are EQUAL\n");
            } else {
                System.out.println("Result: Hashes are NOT equal\n");
            }
        }
    }
}
