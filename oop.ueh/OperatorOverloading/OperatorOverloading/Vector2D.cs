using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    internal class Vector2D : IVector
    {
        public double x { get; set; }
        public double y { get; set; }

        public Vector2D(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        public override string ToString()
        {
            return $"({x}, {y})";
        }

        public static double operator *(Vector2D a, Vector2D b)
        {
            if ((a.x == a.y && a.x == 0 ) || (b.x == b.y && b.y == 0))
            {
                throw new ArgumentException("Khong the nhan vector bang 0", nameof(a));
            }
            return Math.Sqrt((a.x * a.x + a.y * a.y) * (b.x * b.x + b.y * b.y));
        }

        public static IVector operator +(Vector2D a, Vector2D b)
        {
            return new Vector2D(a.x + b.x, a.y + b.y);
        }
    }
}
