public class Employee {
String name;
double salary;
int workHour;
int hireYear;

    Employee(String name, double salary, int workHour, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
        this.hireYear = hireYear;

    }

    public double tax(){
        double tax = 0;
        if(salary < 1000){
            tax = 0;
        } else if (salary > 1000) {
            tax = salary * 0.03;
            

        }
            return tax;
    }

    public int bonus(){
        int bonus = 0;
        if(workHour > 40){
            bonus = (workHour - 40) * 30;

        } else if (workHour <= 40) {
            bonus = 0 ;
            
        }
        return bonus;
    }

    public double raiseSalary(){
        int year= 2021 - hireYear;
        double raisRate = 0 ;

        if(year < 10){
            raisRate = (salary * 0.05) ;
        }
        else if (year > 9 && year < 20) {
            raisRate = (salary * 0.1);

        }
        else if (year > 19) {
            raisRate = (salary * 0.15);
        }
        return raisRate;
    }

    public void String(){
        System.out.println("Adı: " + name);
        System.out.println("Maaş: " + salary);
        System.out.println("Çalışma saati: " + workHour);
        System.out.println("Başlangıç yılı: " + hireYear);
        System.out.println("vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslardan sonra maaş" + (salary - tax() + bonus()));
        System.out.println("Toplam maaş: " + (salary + raiseSalary() + bonus() - tax()));
    }



}
