
// Implementation of String 

class StringImplementation{
    public static void main(String[] args) {
        // Ways to declare String
        String s1 = "Hello";
        String s2 = new String(" hello ");
        char ch[] = {'H','o','w',' ','r',' ','u'};
        String s3 = new String(ch);
        byte b[] = {65,66,67,68,69};
        String s4 = new String(b);
        
        // Concatination of a String
        String s5 = s1+s2;
        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5);

                    // Some Members of String class

            // Finding character at a given index
        char ch1 = s1.charAt(2);
        System.out.println(ch1);
            // Finding length of the String
        int n = s1.length();
        System.out.println(n);
            // Getting Substring from a String
        String s6 = s1.substring(1);
        String s7 = s1.substring(1, 3);
        System.out.println(s6 + "\n" + s7);
            // Finding the index of a substring, If substring is not in the main String then it will return -1
        int n1 = s5.indexOf(s7);
        int n2 = s5.indexOf("mayur");
        System.out.println(n1+ "\n" + n2);
            // Changing String to uppercase or lowercase
        String s8 = s7.toUpperCase();
        String s9 = s5.toLowerCase();

            // If you want to trim blank space before and after the string
        String s10 = s2.trim();

            // if you want to replace a string with a string
        String s11 = s5.replace(ch1, ch[0]);
        System.out.println(s8 + "\n" + s9 + "\n" + s10 + "\n" + s11);
            /*
            Some other members are like:
            equals
                (It will check Two string similarity)
            equalsIgnoreCase
                (Similar to Equals but it will ignore the case of two strings provided.)
            startswith and endswith
            split
            contains
            valueof
                (It will return the String of the parsed int)
            comparewith 
                (It will give you the difference of the ASCCI value of the first character which mismatch between the given strings) 
            */


        


        
    }
}