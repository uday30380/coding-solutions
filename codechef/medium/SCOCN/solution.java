import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get the desired size of the array
       
        int size = scanner.nextInt();
        
        int fianl = scanner.nextInt();

        // 2. Initialize the array with that size
        int[] userArray = new int[size];

        
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }
        
        for(int i=0;i<size;i++){
        userArray[i]=fianl;
        i++;
        System.out.println(i);
        
        
            
            
        }
        
        
    }
}
