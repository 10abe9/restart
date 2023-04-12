public class Palindrome {
    public static void main(String[] args) {
        String s = "pis sip";
        String n = "";
        int  x = 1;
        for (int i = s.length() - 1; i > -1; i--) {
            n = n + s.charAt(i);
            System.out.println(s.charAt(i));
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {

            } else {
                x = x - 1;
            }
        }
        System.out.println(n);
        if (x > 0) {
            System.out.println("слово - палиндром");
        } else {
            System.out.println("слово - не палиндром");
        }//слово

        String l = " ";
        String Ns = "";
        for (int j = 0; j<s.length();j++)
        {
            if (s.charAt(j) != l.charAt(0)){Ns += s.charAt(j);}
            else
            {

                int f = j;


                System.out.println("sss");
                Ns = "";
            }

        }




    }
}