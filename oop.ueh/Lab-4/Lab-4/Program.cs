using System.Security.Cryptography.X509Certificates;

namespace Lab_4
{
    /*lab 24/1

        1. xây dựng một lớp abtract đại số có một phương thức abtract là tính

        2. xây dựng một lớp số phức gồm các thuộc tính phần thực và phần ảo 
        kế thừa từ lớp đại số và quá tải phương thức tính, biết rằng phương thức tính số phức 
        là trả về mo dun của số phức đó 

        3. xây dựng lớp vector 2d kế thừa từ lớp đại số. quá tải phương thức tính. biết rằng 
        phương thức tính của vector trả về vector vuông góc với nó.

        4. trong lớp program, tạo hai phương thức có tên là create Vector, create Số phức, 
        để sinh ra số phức và vector, random

        5. tạo một mảng gồm có 20 đối tượng đại số ( có thể lưu trữ trong list) 
        và sinh ngẫu nhiên các đối tượng của số phức và vector. random hết. sau đó in thông tin 
        của các đối tượng trong danh sách này và kết quả của phương thức tính.     
     */
    internal class Program
    {   
        static void Main(string[] args)
        {
            DaiSo[] array = new DaiSo[20];
            
            for (int i = 0; i < array.Length; i++)
            {
                int r;
                Random rd = new Random();
                r = rd.Next(2);

                if (r == 0)
                {
                    array[i] = createSoPhuc();
                } else if (r == 1) 
                {
                    array[i] = createVector();
                }
            }

            for (int i = 0;i < array.Length;i++) 
            {
                Console.Write(String.Format("{0}", array[i].bieuDien(array[i])));
                array[i].tinh(array[i]);
            }
        }

        public static SoPhuc createSoPhuc()
        {
            Random rd = new Random();
            int a = rd.Next(1,10);
            int b = rd.Next(1,10);

            SoPhuc r = new SoPhuc(a, b);
            return r;
        }
        public static Vector2D createVector()
        {
            SoPhuc r1 = createSoPhuc();

            Vector2D r2 = new Vector2D(r1.a, r1.b);
            return r2;
        }
    }
}
