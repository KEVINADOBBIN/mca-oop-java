class StringFunc {
    public static void main(String[] args) {

        System.out.println("KEVIN A DOBBIN MCA 'A' SEC\n");

        String s1 = "st.francis college";
        String s2 = "MCA Department";

        // Display original strings
        System.out.println("First String  : " + s1);
        System.out.println("Second String : " + s2);

        // Length of first string
        System.out.println("Length of first String : " + s1.length());

        // Concatenate strings
        s1 = s1.concat(s2);
        System.out.println("Concatenated String    : " + s1);

        // Compare strings
        System.out.println("s1 equals s2          : " + s1.equals(s2));

        // Convert to uppercase
        System.out.println("Uppercase             : " + s1.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase             : " + s1.toLowerCase());

        // Substring from index 4
        System.out.println("Substring from index 4 : " + s1.substring(4));

        // Character at first position
        System.out.println("Character at first position : " + s1.charAt(0));

        // Replace 'e' with 'i'
        System.out.println("Replace 'e' with 'i'  : " + s1.replace('e', 'i'));

        // Compare strings lexicographically
        System.out.println("Compare s1 to s2       : " + s1.compareTo(s2));
    }
}
