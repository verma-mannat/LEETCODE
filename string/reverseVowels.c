/*
# Intuition
Using two pointers

# Approach
set left=0 , right=length-1 ,sing for loop swap left and right char value

# Complexity
- Time complexity:O(n)

- Space complexity:O(1)
*/
#include <string.h>

int isVowel(char c);  

char* reverseVowels(char* s) {
    int l = 0, r = strlen(s) - 1;

    while (l < r) {
        while (l < r && !isVowel(s[l])) l++;
        while (l < r && !isVowel(s[r])) r--;

        if (l < r) {
            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;
        }
    }
    return s;
}

int isVowel(char c) {
    return strchr("aeiouAEIOU", c) != NULL;
}