namespace DelegationCompare
{
    internal class Program
    {

        public delegate int CompareStu(Student s1, Student s2);
        static void Main(string[] args)
        {
            //DSSV
            List<Student> liststudents = new List<Student>
            {
                new Student() { Id = 1, Name = "An", Gender = "Nam", Yob = 2000, Gpa = 10.0 },
                new Student() { Id = 2, Name = "Binh", Gender = "Nu", Yob = 2000, Gpa = 5.1 },
                new Student() { Id = 3, Name = "Cuong", Gender = "Nu", Yob = 2004, Gpa = 8.0 },
                new Student() { Id = 4, Name = "Duc", Gender = "Nu", Yob = 2000, Gpa = 5.1 },
                new Student() { Id = 5, Name = "En", Gender = "Nu", Yob = 2004, Gpa = 8.0 },
            };
            
            
            Console.WriteLine("\nStudent list: \n");
            foreach (Student student in liststudents) 
            { 
                Console.WriteLine($"{student.Id}, {student.Name}, {student.Gender}, {student.Yob}, {student.Gpa}");
            }

            CompareStu compareDelegate = CompareGPA;

            Sort(liststudents, compareDelegate);

            Console.WriteLine("\nStudent list after sortting using Delegate\n");
            foreach (Student student in liststudents)
            {
                Console.WriteLine($"{student.Id}, {student.Name}, {student.Gender}, {student.Yob}, {student.Gpa}");
            }

        }

        static int CompareGPA(Student s1, Student s2)
        {
            if (s1.Gpa > s2.Gpa)
                return 1;
            else if (s1.Gpa < s2.Gpa)
                return -1;
            else return 0;
        }

        static void Sort (List<Student> list, CompareStu compareDelegate)
        {
            int n = list.Count;
            bool swapFlag;
            do
            {
                swapFlag = false;
                for (int i = 0; i < n - 1; i++)
                {
                    int compareResult = compareDelegate(list[i], list[i + 1]);
                    if (compareResult > 0)
                    {
                        Student temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        swapFlag = true;
                    }
                }
                n--;
            } while (swapFlag); // while swapFlag == true
        }

    }

    public class Student
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string Gender { get; set; }
        public int Yob { get; set; }
        public double Gpa { get; set; }

        
        /*public Student(int id, string name, string gender, int yob, double gpa)
        {
            Id = id;
            Name = name;
            Gender = gender;
            Yob = yob;
            Gpa = gpa;
        }*/


    }
}
