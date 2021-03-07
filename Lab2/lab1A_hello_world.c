// Name: Richmond Aisabor
// Class: CS 3342 Programming Languages
// Lab Assignment 2
// Due Date: March 7, 2021 (Sunday)

#include <stdio.h>
int main(){
    char ch1 = 'C';
    char ch2 = 'S';
    char name[20] = "Richmond Aisabor";
    /* Richmond Aisabor */
    float effort = 100.00;
    int course_num = 3342;

    printf("Hello world!\n");
    printf("The is %c%c", ch1, ch2);
    printf("%d - Programming Languages \n", course_num);
    printf("Student Name:%s\n", name);
    printf("Students should give %.0f%% effort in school. \n", effort);

    printf("Octal value of the course number %o. \n", course_num);
    return 0;
}