package Homework.src;

import java.util.Scanner;

public class Assignment2_20220808025 {
    public static void main(String[] args) {
        System.out.println("******** Category Information Entry ********");
        System.out.println(" ");
        // CATEGORY ONE
        System.out.print("Please enter" +
                " the name of category1: ");
        Scanner scanner = new Scanner(System.in);
        String cat1 = scanner.nextLine();
        cat1 = formatCategoryName(cat1);
        int cat1items;
        do {
            System.out.println("Please enter " +
                    "how many items of type " +
                    cat1+" were given: ");
            cat1items = scanner.nextInt();

        } while (!isQuantityValid(cat1items));

        int cat1percentages;
        do {
            System.out.println("Please enter " +
                    "the percentage weight of " +
                    cat1+":");
            cat1percentages = scanner.nextInt();
            scanner.nextLine();


        } while (!isWeightValid(cat1percentages,cat1percentages));

        // CATEGORY TWO

        System.out.print("Please enter" +
                " the name of category2: ");
        String cat2 = scanner.nextLine();
        cat2= formatCategoryName(cat2);
        int cat2items;
        do {
            System.out.println("Please enter " +
                    "how many items of type " +
                    cat2 +
                    " were given: ");
            cat2items = scanner.nextInt();

        } while (!isQuantityValid(cat2items));

        int cat2percentages;
        do {
            System.out.println("Please enter " +
                    "the percentage weight of " +
                    cat2+":");
            cat2percentages = scanner.nextInt();
            scanner.nextLine();

        } while (!isWeightValid(cat2percentages,
                cat1percentages+cat2percentages));

        // CATEGORY THREE

        System.out.print("Please enter" +
                " the name of category3: ");
        String cat3 = scanner.nextLine();
        cat3 = formatCategoryName(cat3);
        int cat3items;
        do {
            System.out.println("Please enter " +
                    "how many items of type " +
                    cat3 +
                    " were given: ");
            cat3items = scanner.nextInt();

        } while (!isQuantityValid(cat3items));

        int cat3percentages;
        do {
            System.out.println("Please enter " +
                    "the percentage weight of " +
                    cat3+":");
            cat3percentages = scanner.nextInt();
            scanner.nextLine();

        } while (!isWeightValid(cat3percentages,
                cat1percentages+cat2percentages+cat3percentages));

        // CATEGORY FOUR

        System.out.print("Please enter" +
                " the name of category4: ");
        String cat4 = scanner.nextLine();
        cat4 = formatCategoryName(cat4);
        int cat4items;
        do {
            System.out.println("Please enter " +
                    "how many items of type " +
                    cat4+
                    " were given: ");
            cat4items = scanner.nextInt();

        } while (!isQuantityValid(cat4items));

        int cat4percentages;
        do {
            System.out.println("Please enter " +
                    "the percentage weight of " +
                    cat4+":");
            cat4percentages = scanner.nextInt();
            scanner.nextLine();

        } while (!isWeightValid(cat4percentages,
                cat1percentages+cat2percentages+
                        cat3percentages+cat4percentages));

        // CATEGORY 5
        System.out.print("Please enter" +
                " the name of category5: ");
        String cat5 = scanner.nextLine();
        cat5 = formatCategoryName(cat5);
        int cat5items;
        do {
            System.out.println("Please enter " +
                    "how many items of type " +
                    cat5 +
                    " were given: ");
            cat5items = scanner.nextInt();

        } while (!isQuantityValid(cat5items));

        int cat5percentages;
        do {
            System.out.println("Please enter " +
                    "the percentage weight of " +
                    cat5+":");
            cat5percentages = scanner.nextInt();
            scanner.nextLine();


        } while (!isWeightValid(cat5percentages,
                cat1percentages+cat2percentages+
                        cat3percentages+cat4percentages+cat5percentages));

        int sumtopercentages = cat1percentages + cat2percentages +
                cat3percentages + cat4percentages + cat5percentages;


        if (sumtopercentages != 100) {
            System.out.println(" ERROR: The values sum to " +
                    sumtopercentages +
                    " but should sum to 100");
        } else { //TAKES NOTES//
            System.out.println(" ");
            System.out.println("******** Student Grades Entry ********");
            System.out.println(" ");
            System.out.println("Enter value that the student"+
                    " earned for each item:");


            // CATEGORY ONE

            int helperint = 1;
            int cat1notes;
            double qat1totalnotes = 0;
            while (cat1items > 0) {
                System.out.print(cat1+ " " + helperint + ":");
                cat1notes = scanner.nextInt();

                qat1totalnotes = qat1totalnotes + cat1notes;
                cat1items--;
                helperint++;
            }


            // CATEGORY TWO
            int cat2notes;
            double qat2totalnotes = 0;
            int helperint2 = 1;
            while (cat2items > 0) {
                System.out.print(cat2 + " " + helperint2 + ":");
                cat2notes = scanner.nextInt();
                qat2totalnotes = qat2totalnotes + cat2notes;
                cat2items--;
                helperint2++;
            }

            // CATEGORY THREE
            int cat3notes;
            double qat3totalnotes = 0;
            int helperint3 = 1;
            while (cat3items > 0) {
                System.out.print(cat3+ " " + helperint3 + ":");
                cat3notes = scanner.nextInt();
                qat3totalnotes += cat3notes;
                cat3items--;
                helperint3++;
            }


            // CATEGORY FOUR
            int cat4notes;
            int helperint4 = 1;
            double qat4totalnotes = 0;
            while (cat4items > 0) {
                System.out.print(cat4+ " " + helperint4 + ":");
                cat4notes = scanner.nextInt();
                qat4totalnotes += cat4notes;
                cat4items--;
                helperint4++;
            }

            // CATEGORY FIVE
            int cat5notes;
            int helperint5 = 1;
            double qat5totalnotes = 0;
            while (cat5items > 0) {
                System.out.print(cat5+ " " + helperint5 + ":");
                cat5notes = scanner.nextInt();
                qat5totalnotes += cat5notes;
                cat5items--;
                helperint5++;
            }
            // AVERAGES CALCULATE
            double qat1average = qat1totalnotes / (helperint - 1);
            double qat2average = qat2totalnotes / (helperint2 - 1);
            double qat3average = qat3totalnotes / (helperint3 - 1);
            double qat4average = qat4totalnotes / (helperint4 - 1);
            double qat5average = qat5totalnotes / (helperint5 - 1);
            System.out.println(" ");
            System.out.println("********* Student Results ********");
            System.out.println(" ");
            System.out.println(cat1 + ":" + qat1average);
            System.out.println(cat2 + ":" + qat2average);
            System.out.println(cat3 + ":" + qat3average);
            System.out.println(cat4+ ":" + qat4average);
            System.out.println(cat5 + ":" + qat5average);
            // SCORE CALCULATE
            double score = qat1average * cat1percentages / 100 +
                    qat2average * cat2percentages / 100 +
                    qat3average * cat3percentages / 100 +
                    qat4average * cat4percentages / 100 +
                    qat5average * cat5percentages / 100;

            System.out.println("The student has "+ status(score)+
                    " CSE101 with a score of "+ score+","+
                    " GPA points of "+gpaPoints(score)+","+
                    " and a grade letter of "+ gradeLetter(score) );


        }

    }





    public static String formatCategoryName(String name) {
        String firstletter = "" +
                name.charAt(0);
        name = firstletter.toUpperCase() +
                name.toLowerCase().substring(1);
        return name;
    }

    public static boolean isQuantityValid(int quantity){
        boolean itemnumber;
        itemnumber = quantity >= 1;
        return itemnumber;
    }

    public static boolean isWeightValid(int weight, int sumpercentages) {
        boolean weightnumber;
        weightnumber = weight >= 0;
        return weightnumber;

    }

    public static String gradeLetter(double grade) {
        String grade_letter;

        if (grade >= 88) { grade_letter = "AA";}
        else if (grade >= 81) { grade_letter= "BA";}
        else if (grade >= 74) { grade_letter= "BB";}
        else if (grade >= 67) { grade_letter= "CB";}
        else if (grade >= 60) { grade_letter= "CC";}
        else if (grade >= 53) { grade_letter= "DC";}
        else if (grade >= 46) { grade_letter= "DD";}
        else if (grade >= 35) { grade_letter= "FD";}
        else if (grade >= 0) { grade_letter= "FF";}
        else { grade_letter ="invalid value";}

        return grade_letter; }


    public static double gpaPoints(double grade) {
        double gpa_points;
        if (grade >= 88) { gpa_points = 4.0;}
        else if (grade >= 81) { gpa_points= 3.5;}
        else if (grade >= 74) { gpa_points= 3.0;}
        else if (grade >= 67) { gpa_points= 2.5;}
        else if (grade >= 60) { gpa_points= 2.0;}
        else if (grade >= 53) { gpa_points= 1.5;}
        else if (grade >= 46) { gpa_points= 1.0;}
        else if (grade >= 35) { gpa_points= 0.5;}
        else if (grade >= 0) { gpa_points= 0.0;}
        else { gpa_points = 999;}
        return gpa_points; }

    public static String status(double grade) {
        String statuss;
        if (grade >= 88) { statuss = "passed";}
        else if (grade >= 81) { statuss= "passed";}
        else if (grade >= 74) { statuss= "passed";}
        else if (grade >= 67) { statuss= "passed";}
        else if (grade >= 60) { statuss= "passed";}
        else if (grade >= 53) { statuss=  "conditionally passed";}
        else if (grade >= 46) { statuss= "conditionally passed";}
        else if (grade >= 35) { statuss= "failed";}
        else if (grade >= 0) { statuss= "failed";}
        else { statuss = "invalid value";}
        return statuss; }
}
