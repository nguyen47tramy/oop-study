using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    internal class PhanSo
    {
        private int tu, mau;

        public PhanSo(int tu, int mau)
        {
            this.tu = tu;
            this.mau = mau;
        }

        public static PhanSo operator +(PhanSo a, PhanSo b)
        {
            return new PhanSo(a.tu * b.mau + a.mau * b.tu, a.mau * b.mau);
        }

        public static PhanSo operator -(PhanSo a, PhanSo b)
        {
            return new PhanSo(a.tu * b.mau - a.mau * b.tu, a.mau * b.mau);
        }

        public static PhanSo operator +(PhanSo a)
        {
            return new PhanSo(a.tu, a.mau);
        }

        public static PhanSo operator -(PhanSo a)
        {
            return new PhanSo(-a.tu, a.mau);
        }

        public static int gcd(int a, int b)
        {
            while (b != 0)
            {
                int r = a % b;
                a = b;
                b = r;
            }
            return a;
        }

        public string BieuDien()
        {
            return $"{this.tu} / {this.mau}";
        }

        public override string ToString()
        {
            int x = this.tu, y = this.mau;
            int ucln = gcd(x, y);

            x /= ucln;
            y /= ucln;

            return x + "/" + y;
        }
    }
}
