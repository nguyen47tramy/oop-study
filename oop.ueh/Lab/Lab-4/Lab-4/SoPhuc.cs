using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_4
{
    internal class SoPhuc : DaiSo
    {
        public SoPhuc(int a, int b) : base(a, b)
        {
        }

        public override string bieuDien(DaiSo c)
        {
            return String.Format("SoPhuc: z = {0} + {1}i co modun la: ", c.a, c.b);
        }
        public override void tinh(DaiSo c)
        {
            double r = Math.Round(Math.Abs(Math.Sqrt((c.a * c.a) + (c.b * c.b))),2);
            Console.WriteLine(r);
        }
    }
}
