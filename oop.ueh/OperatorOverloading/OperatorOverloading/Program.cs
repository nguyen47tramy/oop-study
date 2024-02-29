namespace OperatorOverloading
{
    
    internal class Program
    {
        static void Main(string[] args)
        {
            /*PhanSo a = new PhanSo(1, 2);
            PhanSo b = new PhanSo(3, 4);
            Console.WriteLine($"{a} + {b} = {a + b}");
            Console.WriteLine(-a);*/

            IVector a = new Vector2D(1, 2);
            IVector b = new Vector2D(2, 3);

            IVector c = new Vector3D(3, 4, 5);
            IVector d = new Vector3D(4, 5, 6);

            Console.WriteLine(a + b);
            Console.WriteLine(c + d);

            Console.WriteLine(a * b);
            Console.WriteLine(c * d);

            
        }
    }
}
