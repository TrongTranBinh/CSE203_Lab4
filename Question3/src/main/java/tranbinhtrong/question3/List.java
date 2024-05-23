package tranbinhtrong.question3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class List {

    Vector<Student> list = new Vector<>();

    public List() {
    }

    public void addCollegeStudent() {
        Student s1 = new CollegeStudent();
        s1.input();
        list.add(s1);
    }

    public void addUniversityStudent() {
        Student s1 = new UniversityStudent();
        s1.input();
        list.add(s1);
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Number: ");
        String studentNum = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber().equalsIgnoreCase(studentNum)) {
                list.remove(i);
            }
        }
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
            System.out.println("");
        }
    }

    public void printEligibleStudent() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).graduation()) {
                list.get(i).output();
                System.out.println("");
                count++;
            }
            System.out.println("Number of Eligible Student: " + count);
        }
    }

    public void sort() {
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                if (s1 instanceof CollegeStudent && s2 instanceof UniversityStudent) {
                    return -1;
                } else if (s1 instanceof UniversityStudent && s2 instanceof CollegeStudent) {
                    return 1;
                } else {
                    return s1.getStudentNumber().compareTo(s2.getStudentNumber());
                }
            }
        };
        list.sort(com);
        print();
    }

    public void findStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String n = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFullName().contains(n)) {
                list.get(i).output();
                System.out.println();
            }
        }
    }
}
