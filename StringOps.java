public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    String string = args[0];
    //System.out.println(string);
    //System.out.println(capVowelsLowRest(string));
    System.out.println(camelCase(string));
    //char chr = 'L';
    //for (int i = 0; i < allIndexOf(string, chr).length; i++) {
    //   System.out.print(allIndexOf(string, chr)[i] + " ");
    //    }
    }

    public static String capVowelsLowRest (String string) {
        int n = string.length();
        String s = "";
        for (int i = 0; i < n; i++) {
            if (string.charAt(i) == 32) {
                s = s + " ";
            } else {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'i') {
                s = s + (char) (string.charAt(i) - 32);
            } else {
            if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == 'I') {
                s = s + string.charAt(i);
            } else {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                s = s + (char) (string.charAt(i) + 32);
            } else {
                s = s + string.charAt(i);
            }}}}
        }
        return s;
    }

    public static String camelCase (String string) {
        //System.out.print("check 1 :");
        int n = string.length();
        String s = "";
        int i = 0;
        while (string.charAt(i) == 32) {
            i++;
        }
        //System.out.print("check 2 :" + s);
        while (i < n && string.charAt(i) != 32) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                s = s + (char) (string.charAt(i) + 32);
            } else {
                s = s + string.charAt(i);
            }
            i++;
        }
        //System.out.print("check 3 :" + s);
        while (i < n) {
            if (string.charAt(i-1) == 32) {
                if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                    s = s + string.charAt(i);
                } else {
                    s = s + (char) (string.charAt(i) - 32);
                }
            }
            if (string.charAt(i) != 32 && string.charAt(i-1) != 32 && string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                s = s + (char) (string.charAt(i) + 32);
            } else {
                if (string.charAt(i) != 32 && string.charAt(i-1) != 32) {
                s = s + string.charAt(i);
            }}
            i++;
        }
        s = s + "     ";
        return s;
    }

    public static int[] allIndexOf (String string, char chr) {
        int n = 0; // new array length 
        int j = 0; // new array index
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr)
                n++;
        }
        int[] arr = new int [n];
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                arr[j] = i;
                j++;   
            }
        }
        return arr;
    }
}
