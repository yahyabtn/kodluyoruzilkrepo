package MaasHesaplayici;


public class Calisan  {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Calisan(String name,double salary, int workHours,int hireYear){
        this.name = name;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workHours = workHours;
    }

    double tax(double salary){

        if(0<salary && salary<=1000){
            return 0;
        }
        else if(salary>1000){
            salary= salary*0.03;
            return salary;
        }else{
            System.out.println("Yanlış bir maaş girildi.");
            return 0.0;
        }
    }

    int bonus(int workHours){
        if(workHours>40){
            workHours = workHours-40;
            return workHours*30;
        }else{
            return 0;
        }
    }

    double raiseSalary(int hireYear,double salary){
        if(hireYear>0 && hireYear<10){
            salary = (salary*0.05);
            return salary;
        }else if(hireYear>0 && hireYear<10){
            salary =  (salary * 0.1);
            return salary;
        }else{
            salary = (salary * 0.15);
            return salary;
        }
    }

    void ttoString(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Çalışma Yılı: " + this.hireYear);
        System.out.println("Vergi: "+tax(this.salary));
        System.out.println("Bonus: " + bonus(this.workHours));
        System.out.println("Maaş Artışı: "+(raiseSalary(this.hireYear, this.salary)));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax(this.salary) + bonus(this.workHours)) );
        System.out.println("Toplam Maaş: " +(this.salary +raiseSalary(this.hireYear, this.salary)));
    }

}