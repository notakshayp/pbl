public class Project1 {
    public static void main(String[] args) {
        String[][] table1 = { { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
                { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
                { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" }

        };

        String[][] table2 = { { "e", "Engineer", "20000" }, { "c", "Consultant", "32000" }, { "k", "Clerk", "12000" },
                { "r", "Receptionist", "15000" }, { "m", "Manager", "40000" } };

        String empNo = "";
        String empName = "";
        String Dept = "";
        String Desegnation = "";
        int Salary = 0;
        int BasicVal = 0;
        int HRA = 0;
        int IT = 0;
        int DA = 0;

        for (int i = 0; i < table1.length; i++) {
            if (table1[i][0].equals(args[0])) {
                empNo = table1[i][0];
                empName = table1[i][1];
                Dept = table1[i][4];
                // Desegnation=table1[i][];
                // Salary=Integer.parseInt(table1[i][]);
                BasicVal = Integer.parseInt(table1[i][5]);
                HRA = Integer.parseInt(table1[i][6]);
                IT = Integer.parseInt(table1[i][7]);
                // DA=Integer.parseInt(table1[i][]);

                String desgCode = table1[i][3];
                for (int i2 = 0; i2 < table2[0].length; i2++) {
                    if (table2[i2][0].equals(desgCode)) {
                        Desegnation = table2[i2][1];
                        DA = Integer.parseInt(table2[i2][2]);
                    }
                }

                Salary = BasicVal + HRA + DA - IT;
                System.out.println("Emp No:\t\tEmp Name\t\tDepartment\t\tDesignation\t\tSalary");
                System.out.println(empNo + "\t\t" + empName + "\t\t" + Dept + "\t\t" + Desegnation + "\t\t" + Salary);
                return;
            }
        }
        System.out.println("There is no employee with empid: " + args[0]);

    }
}