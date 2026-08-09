class Codechef {
    public static void main(String[] args) {
        
        String feedback = "   Great product and service! ";
        
        // Trim the original string and store as trimmedFeedback
        
        String newfeedbck=feedback.trim();


        // convert trimmedFeedback to upper case and lower case
        String lowto=newfeedbck.toUpperCase();
        String Uppcasetolow=newfeedbck.toLowerCase();
        
        
        // output the strings and length as required
        
        System.out.println(lowto);
        
        System.out.println(Uppcasetolow);
        
        System.out.println(newfeedbck.length());




    }
}