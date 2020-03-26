using System;

namespace isogram
{
    class Program
    {
        static void Main(string[] args)
        {
            Isogram is_Iso = new Isogram();
            Console.WriteLine(is_Iso.IsItIsogram("hello"));
        }
        
    }
}
