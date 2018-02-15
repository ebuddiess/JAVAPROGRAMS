import java.util.Scanner;
abstract class employee{
abstract void insertdetails();   
}

interface Teacher{
  final int Tsalary = 20000;
void insertdepartment();
  void showdepartment();   
}
  
  interface Programmer{
 final int Psalary = 40000;
  void insertskills();
  void showskills();
    }
    
    class teacher_programmer extends employee implements Teacher , Programmer {
  int id;
  String name;
  String department;
  String skills;

       teacher_programmer(int id,String name,String department,String skills){
          this.name = name;
    this.id =id;
    this.department = department;
    this.skills =skills;
         }
  
  teacher_programmer(){
    }
       void insertdetails(){
    Scanner s = new Scanner(System.in);
          System.out.println("Enter id ");
          id=s.nextInt();
    System.out.println("Enter name ");
          name=s.next();
         }
  public void insertdepartment(){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Department ");
    department = s.next();
   }
  public void showdepartment(){
     System.out.println("Department "+department);
    }
  
     public  void insertskills(){
  Scanner s = new Scanner(System.in);
     System.out.println("Enter Skills ");
    skills = s.next();
        }
  public void showskills(){
        System.out.println("Skills"+skills);
    }
  
  public void showdetails(){
    int salary = Teacher.Tsalary + Programmer.Psalary; 
    System.out.println("Name "+name);
    System.out.println("Id"+id);
    System.out.println("Department "+department);
   System.out.println("Skills"+skills);
    System.out.println("Salary"+salary);
    
    }
  
  public static void main(String []args){
  teacher_programmer tp = new teacher_programmer();
  tp.insertdetails();
  tp.insertdepartment();
  tp.insertskills();
    tp.showdetails();
    }
      }
      
      
