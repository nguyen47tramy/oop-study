using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorOverloading
{
    public interface IVector
    {
        public double x { get; set; }
        public double y { get; set; }
        public double z { get; set; }

        /*public IVector(double x, double y, double z)
        {
            this.x = x;
            this.y = y; 
            this.z = z;
        }*/
        /*public static IVector operator +(IVector a, IVector b) { 
            return new IVector(a.x + b.x, a.y + b.y, a.z + b.z );
        }*/
    }
}
