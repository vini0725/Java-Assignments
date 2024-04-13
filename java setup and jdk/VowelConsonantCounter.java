public class VowelConsonantCounter {
      void count(String text){
 int countV = 0;
 int countW = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i'
             || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u') {
                countV++;
            }
            else{
                countW++;
            }

        }
        System.out.println("The string is: "+text);
                        System.out.println("No of Vowels: "+countV);
                                        System.out.println("No of Consonants: "+countW);


    }
 
    public static void main(String[] args) {
        VowelConsonantCounter vc =new VowelConsonantCounter();
        
        vc.count("hello world");
    }
}

  