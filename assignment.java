        static class Student {

            private int studentId;
            private String name;
            private int age;
            private String department;
            private double gpa;

            static String universityName = "Al Qimah University";

            public Student(int studentId, String name, int age,
                           String department, double gpa) {

                this.studentId = studentId;
                this.name = name;
                this.age = age;
                this.department = department;
                this.gpa = gpa;
            }

            public void displayInfo() {

                System.out.println("University: " + universityName);
                System.out.println("ID: " + studentId);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Department: " + department);
                System.out.println("GPA: " + gpa);

                if (gpa >= 2.0) {
                    System.out.println("Status: Passed");
                } else {
                    System.out.println("Status: Failed");
                }

                System.out.println("----------------");
            }
        }

        public static void main(String[] args) {

            Student s1 = new Student(101, "Ali", 20, "IT", 3.2);
            Student s2 = new Student(102, "Asha", 21, "Engineering", 2.5);
            Student s3 = new Student(103, "Ahmed", 19, "Business", 1.8);
            Student s4 = new Student(104, "Fartuun", 20, "Computer Science", 3.5);

            s1.displayInfo();
            s2.displayInfo();
            s3.displayInfo();
            s4.displayInfo();
        }
