using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab_4
{
    internal abstract class  DaiSo
    {
        public int a { get; protected set; }
        public int b { get; protected set; }

        protected DaiSo(int a, int b)
        {
            this.a = a;
            this.b = b;
        }

        public abstract void tinh(DaiSo c);

        public abstract string bieuDien(DaiSo c);
    }
}
