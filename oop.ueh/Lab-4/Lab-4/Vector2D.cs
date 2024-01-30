using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_4
{
    internal class Vector2D : DaiSo
    {
        public Vector2D(int a, int b) : base(a, b)
        {
        }

        public override string bieuDien(DaiSo c)
        {
            return String.Format("Vector: ({0}, {1}) co vecto vuong goc la: ", c.a, c.b);
        }
        public override void tinh(DaiSo c)
        {
            int a, b;
            a = c.b;
            b = -(c.a);
            
            Console.WriteLine($"{a},{b}");
            
        }
    }
}
