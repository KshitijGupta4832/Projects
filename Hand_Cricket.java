import java.util.*;

class function {
    private String name;
    int Batting, Balling;
    int JBatting, JBalling;
    Random rn = new Random();
    Scanner in = new Scanner(System.in);

    protected void Wish() {
        System.out.println("Enter your  name");
        name = in.nextLine();
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int minute = time.get(Calendar.MINUTE);
        System.out.print("Jarvis: ");
        if (hour < 12) {
            System.out.println("Good morning " + name + "\t(" + hour + ":" + minute + " AM) ");
        } else if (hour > 12 && hour < 17) {
            System.out.println("Good afternoon " + name + "\t(" + hour + ":" + minute + " PM) ");
        } else if (hour > 17 && hour < 20) {
            System.out.println("Good evening " + name + "\t(" + hour + ":" + minute + " PM) ");
        } else {
            System.out.println("Good night " + name + "\t(" + hour + ":" + minute + " PM) ");
        }
    }

    protected void Choice() {
        System.out.println("Jarvis: \nBatting(0)\nBalling(1)");
        int ch = in.nextInt();
        switch (ch) {
            case 0:
                Batting();
                break;
            case 1:
                Balling();
                break;
            default:
                int row = 5;
                for (int i = -1; i <= row; i++) {
                    for (int j = -1; j <= (2 * row); j++) {
                        if (i >= (2 * row - 1) - j) {
                            System.out.print(" *");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
        }
    }

    protected void Batting() {
        System.out.println("You cannot enter more than 6 runs at a time");
        boolean check = true;
        // Batting section begins for the player
        int runs = 0;
        while (check) {
            System.out.println("Enter your runs for batting turn");
            Batting = in.nextInt();
            if (Batting > 6 || Batting < 0) {
                System.out.println("You can of enter runs till 6");
            } else {
                JBalling = rn.nextInt(7);
                runs = runs + Batting;
                if (Batting == JBalling) {
                    System.out.println(name + " YOU ARE OUT ");
                    check = false;
                }
            }
        }
        System.out.println(name + " your total runs is " + runs);
        System.out.println("______________________________________________________________________________________");
        // Balling sections begins for Player
        System.out.println("Balling begins:");
        boolean rcheck = true;
        int b_run = 0;
        while (rcheck) {
            System.out.println("Enter runs for your bowling turn");
            Balling = in.nextInt();
            if (Balling > 6 || Balling < 0) {
                System.out.println("You can enter runs only from 0 to 6");
            } else {
                JBatting = rn.nextInt(7);
                b_run = b_run + Balling;
                if (JBatting == Balling) {
                    System.out.println("OH , I got out!");
                    rcheck = false;
                }
            }
        }
        System.out.println("My total runs are " + b_run);
        int FINAL = 0;
        if (b_run > runs) {
            FINAL = b_run - runs;
            System.out.println("I won the match by " + FINAL + " runs");
        } else if (b_run == runs) {
            System.out.println("Its a tie");
        } else {
            FINAL = runs - b_run;
            System.out.println(name + " you won the match by " + FINAL + " runs");
        }
    }

    protected void Balling() {
        System.out.println("You cannot enter more than 6 balls at a time");
        int c_runs = 0;
        boolean mcheck = true;
        while (mcheck) {
            System.out.println("Enter your runs for balling turn");
            Balling = in.nextInt();
            if (Balling > 6 || Balling < 0) {
                System.out.println("You can enter balls between 0 to 6");
            } 
            else {
                JBatting = rn.nextInt(7);
                c_runs = c_runs + JBatting;
                if (JBatting == Balling) {
                    System.out.println("OH , I got out!");
                    mcheck = false;
                }
            }  
        } 
            System.out.println("My total runs are " + c_runs);
            System.out.println("______________________________________________________________________________________");
            // Batting begins
            System.out.println("Batting begins");
            int p_runs = 0;
            boolean p_check = true;
            while (p_check) {
                System.out.println("Enter runs for your batting turn");
                Batting = in.nextInt();
                if (Batting > 6 || Batting < 0) {
                    System.out.println("You can enter runs between 0 to 6");
                } else {
                    JBalling = rn.nextInt(7);
                    p_runs = p_runs + Batting;
                    if (JBalling == Batting) {
                        System.out.println(name + " you got out!");
                        p_check = false;
                    }
                }
            }
            System.out.println(name + " your total runs are " + p_runs);
            int FINAL = 0;
            if (c_runs > p_runs) {
                FINAL = c_runs - p_runs;
                System.out.println(name + " You lost the match by " + FINAL + " runs");
            } else if (p_runs == c_runs) {
                System.out.println("The match got tie!");
            } else {
                FINAL = p_runs - c_runs;
                System.out.println(name + " you won the match by " + FINAL + " runs ");
            }
        }
    }

public class Hand_Cricket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        function obj = new function();
        obj.Wish();
        obj.Choice();

        System.out.println("(1) to restart\n(0) to quit");
        int ch = in.nextInt();
        switch(ch){
            case 1:
            obj.Choice();
            break;
            default:
            System.out.println("GAME OVER");
            int row = 5;
                    for (int i = -1; i <= row; i++) {
                        for (int j = -1; j <= (2 * row); j++) {
                            if (i >= (2 * row - 1) - j) {
                                System.out.print(" *");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
        }
        in.close();
    }
}