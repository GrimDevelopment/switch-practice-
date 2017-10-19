package pkgswitch.practice;
public class SwitchPractice {
    public static void main(String[] args) {
        
        char grade = 'C';
        
        switch(grade){
            case 'A':
                System.out.println("Good Job!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("You passed!");
                break;
            case 'F':
                System.out.println("You failed bro!");
            
        }
        System.out.println("Your grade is " + grade);
    }
    
}
