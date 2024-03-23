using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    internal class Vector3D : IVector
    {
        public double x { get; set; }
        public double y { get; set; }
        public double z { get; set; }

        

        public Vector3D(int x, int y, int z)
        {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public override string ToString()
        {
            return $"({x}, {y}, {z})";
        }

        public static double operator *(Vector3D a, Vector3D b)
        {
            if ((a.x == a.y && a.x == 0 && a.z == 0) || (b.x == b.y && b.y == 0 && b.z == 0))
            {
                throw new ArgumentException("Khong the nhan vector bang 0", nameof(a));
            }
            return Math.Sqrt((a.x * a.x + a.y * a.y + a.z * a.z) * (b.x * b.x + b.y * b.y + b.z * b.z));
        }

        public static IVector operator +(Vector3D a, Vector3D b)
        {
            return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
        }
    }
}
