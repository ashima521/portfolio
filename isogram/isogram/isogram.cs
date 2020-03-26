using System;
using System.Collections.Generic;
using System.Text;

namespace isogram
{
    class Isogram
    {
        public bool IsItIsogram(string word)
        {
            string lw_word = word.ToLower();

            char[] splitWord = lw_word.ToCharArray();
            for (int i = 0; i < splitWord.Length; i++)
            {
                for (int j = i + 1; j < splitWord.Length; j++)
                {
                    if (splitWord[i] == splitWord[j])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
