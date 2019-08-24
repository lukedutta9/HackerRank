#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    

    //Initialize variables 
    int t;
    int i, j;
    char s[10001];
    int se, so; //indexes for even and odd strings
    

    //Read input from STDIN
    scanf("%d", &t);

    for (i = 1; i <= t; i++) {
        scanf("%s", s);
        
        char e[5001] = "";
        char o[5001] = "";

        se = 0;
        so = 0;

        for (j = 0; j < strlen(s); j++) {
            if(j % 2 == 0) {
                e[se] = s[j];
                se++;
            }
            else {
                o[so] = s[j];
                so++;
            }
        }
        printf("%s %s\n", e, o);
    }
   
    return 0;
}
