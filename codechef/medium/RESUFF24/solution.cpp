class Codechef {
    public static void main(String[] args) {
        
        double percentage = 85.5; 
        int entranceScore = 75;
        boolean extracurricular = true;

      
        if (percentage >= 85 && entranceScore >= 70 && extracurricular) {
            System.out.println("Eligible for admission."); // Print this message if all conditions are satisfied
        } else {
            System.out.println("Not eligible for admission."); // Print this message if any condition is not satisfied
        }
    }
}
