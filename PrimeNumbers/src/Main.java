public class Main {
    public static void main(String[] args) {
       //Başlangıç ve bitiş belirliyoruz.
        int start = 1;
        int end = 100;
        System.out.println("Prime numbers 1 and 100 are : ");

        //Sayıların ilerlemesi için denklemi kuruyoruz.
        for(int i = start ; i <= end ; i ++){
            boolean prime = true;
            if (i<=1) {
        // Asal olup olmadığının kontrolünü yapıyoruz.
            }else {
                    for (int a = 2; a <i ; a ++){
                        if (i % a == 0){
                            prime = false;
                            break;
                        }
                    }
            }
        //Sayı asalsa ekrana bastırıyoruz.
                if (prime){
                    System.out.print(i + ",");
                }
        }
    }
}