#include<stdio.h>
#include<string.h>

char class(char str[])
{   int ip = 0, j = 1;
    char arr[4];
    int i = 0;
    while (str[i] != '.')
    {
        arr[i] = str[i];
        i++;
    }
    i--; // points to the first octet
    while (i >= 0)
    {
        ip = ip + (str[i] - '0') * j;
        j = j * 10;
        i--;
    }
    if (ip >=1 && ip <= 126)
        return 'A';

    else if (ip >= 128 && ip <= 191)
        return 'B';
 
    else if (ip >= 192 && ip <= 223)
        return 'C';
 
    else if (ip >= 224 && ip <= 239)
        return 'D';
 
    else
        return 'E';
}
int main()
{
    char str[] = "105.255.255.123";
    char ipClass = class(str);
    printf("Given IP address belongs to Class %c\n",
                                           ipClass);
    return 0;
}