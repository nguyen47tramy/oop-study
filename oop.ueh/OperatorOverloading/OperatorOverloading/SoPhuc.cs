using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    internal class SoPhuc
    {
        private int phanThuc;
        private int phanAo;

        public SoPhuc(int phanThuc, int phanAo)
        {
            if (phanAo == 0)
            {
                throw new ArgumentException("Phan ao khong the bang 0", nameof(phanAo));

            }

            this.phanThuc = phanThuc;
            this.phanAo = phanAo;
        }

        public override string ToString()
        {
            return $"z = {this.phanThuc} + {this.phanAo}i";
        }


        public static SoPhuc operator +(SoPhuc a)
        {
            return a;
        }

        public static SoPhuc operator -(SoPhuc a)
        {
            return new SoPhuc(-a.phanThuc, a.phanAo);
        }
        public static SoPhuc operator +(SoPhuc a, SoPhuc b)
        {
            return new SoPhuc(a.phanThuc * b.phanAo + b.phanThuc * a.phanAo, a.phanAo * b.phanAo);
        }

        public static SoPhuc operator -(SoPhuc a, SoPhuc b)
        {
            return a + (-b);
        }

        public static SoPhuc operator *(SoPhuc a, SoPhuc b)
        {
            return new SoPhuc(a.phanThuc * b.phanThuc, a.phanAo * b.phanAo);
        }

        public static SoPhuc operator /(SoPhuc a, SoPhuc b)
        {
            if(b.phanThuc == 0)
            {
                throw new DivideByZeroException();
            }
            return new SoPhuc(a.phanThuc * b.phanAo, a.phanAo * b.phanThuc);
        }
    }
}
