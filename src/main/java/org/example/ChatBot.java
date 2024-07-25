package org.example;

import java.util.Random;
import java.util.Scanner;

public class ChatBot {
    public static String onlyYesOrNo(String ans) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")) {
            return ans;
        } else {
            while (!stop) {
                System.out.println("Please only enter yes or no: ");
                ans = sc.nextLine();
                if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("no")) {
                    stop = true;
                }
            }
            return ans;
        }

    }

    public static int only1234(int num) {
        Scanner sc = new Scanner(System.in);
        boolean stop = false;

        if (num >= 1 && num <= 4) {
            return num;
        } else {
            while (!stop) {
                System.out.println("Please only enter a number between 1 and 4: ");
                num = sc.nextInt();
                if (num >= 1 && num <= 4) {
                    stop = true;
                }
            }
            return num;
        }
    }

    public static int guessAge() {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        System.out.println("Let's try to guess your age...\nOnly answer 'Yes' or 'No'\nDo you remember 9/11?");
        String answer = scanner.nextLine();
        answer = onlyYesOrNo(answer);

        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Do you remember the Y2K scare?");
            answer = scanner.nextLine();
            answer = onlyYesOrNo(answer);
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Did you watch cartoons in the 90s?");
                answer = scanner.nextLine();
                answer = onlyYesOrNo(answer);
                if (answer.equalsIgnoreCase("yes")) {
                    age = 35;
                    System.out.println("I think you are " + age + "-" + (age + 10) + " years old.");
                } else if (answer.equalsIgnoreCase("no")) {
                    age = 35;
                    System.out.println("I think you are " + (age - 5) + "-" + age + " years old.");
                }
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Did you graduate high school before 2005?");
                answer = scanner.nextLine();
                answer = onlyYesOrNo(answer);
                if (answer.equalsIgnoreCase("yes")) {
                    age = 40;
                    System.out.println("I think you are " + (age - 5) + "-" + age + " years old.");
                } else if (answer.equalsIgnoreCase("no")) {
                    age = 35;
                    System.out.println("I think you are " + (age - 5) + "-" + age + " years old.");
                }
            }
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Were you born after the year 2000?");
            answer = scanner.nextLine();
            answer = onlyYesOrNo(answer);
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Do you remember the 2008 financial crisis?");
                answer = scanner.nextLine();
                answer = onlyYesOrNo(answer);
                if (answer.equalsIgnoreCase("yes")) {
                    age = 20;
                    System.out.println("I think you are " + (age - 5) + "-" + age + " years old.");
                } else if (answer.equalsIgnoreCase("no")) {
                    age = 15;
                    System.out.println("I think you are " + (age - 5) + "-" + age + " years old.");
                }
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Do you remember the release of the first iPhone?");
                answer = scanner.nextLine();
                answer = onlyYesOrNo(answer);
                if (answer.equalsIgnoreCase("yes")) {
                    age = 20;
                    System.out.println("I think you are " + age + "-" + (age + 5) + " years old.");
                } else if (answer.equalsIgnoreCase("no")) {
                    age = 15;
                    System.out.println("I think you are " + age + "-" + (age + 5) + " years old.");
                }
            }
        }
        return age;
    }

    public static void letsCount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number you want me to count to: ");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        System.out.println("That was fun! Goodbye.\n");
    }

    public static void quiz() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] questions = {
                "Which language is used to create dynamic content and control multimedia on a web page?",
                "Which language uses queries to manage and manipulate relational databases?",
                "Which language is used to define the structure and layout of a web document by using a variety of tags and attributes?",
                "Which language provides the ability to adapt the appearance of a web page for different devices and screen sizes through responsive design techniques"
        };
        String[] answers = {
                "JavaScript",
                "SQL",
                "HTML",
                "CSS"
        };

        String question = questions[rand.nextInt(questions.length)];
        System.out.println(question);
        for (int i = 1; i <= answers.length; i++) {
            System.out.println(i + ": " + answers[i -1]);
        }
        System.out.println("Please enter the number corresponding to your answer: ");
        int answer = sc.nextInt();
        answer = only1234(answer);

        boolean stop = false;
        while (!stop) {
            if (questions[answer - 1].equals(question)) {
                System.out.println("You answered correctly! Goodbye.\n");
                stop = true;
            } else {
                System.out.println("Pfft wrong, try again. T up lil bro");
                answer = sc.nextInt();
                answer = only1234(answer);
            }
        }
    }

    public static void story(int age, String name) {
        if (age >= 35 && age <= 45) {
            System.out.println("Growing up in the 1980s and 1990s," + name + " witnessed the rise of iconic cartoons" +
                    "\nand the introduction of home computers. They remember the excitement and fear surrounding" +
                    "\nthe Y2K scare as the year 2000 approached. High school graduation came before the prevalence of " +
                    "\nsmartphones, and" + name + " likely experienced the shift from dial-up internet to broadband." +
                    "\nThe events of 9/11 were a defining moment in their early adulthood, shaping" +
                    "\ntheir worldview and marking a significant historical event they clearly recall.");
        } else if (age >= 30 && age <= 35) {
            System.out.println(name + " grew up in the 1990s, enjoying the golden era of Saturday morning cartoons" +
                    "\nand the early days of video games. They might have faint memories of the Y2K scare, but 9/11 " +
                    "\nis a significant event they remember clearly from their childhood or teenage years. By the " +
                    "\ntime they were in high school, social media was starting to emerge, and " + name + " likely" +
                    "\ntransitioned from using dial-up to broadband internet during these formative years.");
        } else if (age >= 25 && age <= 30) {
            System.out.println("Born in the late 1990s, " + name + "'s childhood was filled with early 2000s culture." +
                    "\nThey likely have vague memories of 9/11 from a very young age. Their teenage years saw the" +
                    "\nrise of smartphones and social media, and " + name + " was among the first to grow up fully" +
                    "\nimmersed in digital technology. They experienced the 2008 financial crisis as a significant" +
                    "\nevent during their middle or high school years.");
        } else if (age >= 20 && age <= 25) {
            System.out.println("As a child of the early 2000s," + name + " was too young to remember 9/11." +
                    "\nTheir earliest memories might include the first iPhone release and the rapid expansion of" +
                    "\nthe internet and social media. The 2008 financial crisis is something they recall hearing" +
                    "\nabout as a child. By the time they were in high school, smartphones were ubiquitous, " +
                    "\nand digital technology was an integral part of their daily life.");
        } else if (age >= 15 && age <= 20) {
            System.out.println("Born after the year 2005," + name + " has no memories of 9/11 and likely heard about" +
                    "\nit as a historical event. Their early childhood was marked by the aftermath of" +
                    "\nthe 2008 financial crisis. They grew up in a world where smartphones, social media, and " +
                    "\nstreaming services were already established. Their teenage years have been shaped by rapid" +
                    "\nadvancements in technology and significant global events such as the COVID-19 pandemic.");
        } else if (age >= 10 && age <= 15) {
            System.out.println("Growing up in the 2010s, " + name + " has always known a world with smartphones," +
                    "\nsocial media, and high-speed internet. The events of 9/11 and the 2008 financial crisis are" +
                    "\nhistorical events they learned about in school. Their childhood has been defined by the" +
                    "\ndigital age, with access to vast amounts of information and entertainment at their fingertips." +
                    "\nThe COVID-19 pandemic has been a significant event during their early years, impacting " +
                    "\ntheir schooling and social life.");
        } else {
            System.out.println("Must first play \"Guess your age\" to make a story");
        }
    }

    public static void phraseOfTheDay() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose a number for the day of the phrase you want as shown below");
        System.out.println("1: Monday\n2: Tuesday\n3: Wednesday\n4: Thursday\n5: Friday\n6: Saturday\n7:" +
                " Sunday\nAny other number: quit");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("I'm a little buggy on Mondays. Please bear with me while I reboot my motivation circuits!\n");
                break;
            case 2:
                System.out.println("It's Tuesday! The 'T' in Tuesday stands for 'Try not to crash today!'\n");
                break;
            case 3:
                System.out.println("Happy Hump Day! If I had legs, I'd be jumping over the mid-week hump!\n");
                break;
            case 4:
                System.out.println("It's Thursday! I'm running on low battery, but I've got just enough charge to make it to Friday!\n");
                break;
            case 5:
                System.out.println("Fri-yay! Even bots love the end of the week. Time to defrag and chill!\n");
                break;
            case 6:
                System.out.println("Saturday vibes: System running in relaxation mode. No debugging allowed!\n");
                break;
            case 7:
                System.out.println("Sunday Funday! My code is on vacation, but I'm here for you!\n");
                break;
            default:
                System.out.println("Goodbye!\n");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Did not quite get that... ");
        name = scanner.nextLine();
        System.out.println("Hello " + name + " nice to meet you!");

        boolean stop = false;


        int age = 0;
        while (!stop) {
            System.out.println("What would you like to do?\nPlease press a number as shown below.");
            System.out.println("1: Guess your age\n2: Counting\n3: Programming Quiz\n4: Write you a story." +
                    "\n5: Quote for a day\nAny other number: Quit");
            int game = scanner.nextInt();

            switch (game) {
                case 1:
                    age = guessAge();
                    break;
                case 2:
                    letsCount();
                    break;
                case 3:
                    quiz();
                    break;
                case 4:
                    story(age, name);
                    break;
                case 5:
                    phraseOfTheDay();
                    break;
                default:
                    System.out.println("Goodbye!");
                    stop = true;
            }
        }
    }
}
