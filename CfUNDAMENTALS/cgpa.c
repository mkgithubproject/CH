#include <stdio.h>
#include<stdlib.h> 
int main() {
    size_t malloc_size = 100;
    printf("========================================================\n");
    printf("                 Program: GPA CALCULATOR\n");
    printf("                 Author : Your Name\n");
    printf("========================================================\n\n");
    printf("Number of subject this semester: ");
    int numberOfsubjects;
    scanf("%d",&numberOfsubjects);
    char *subjects[numberOfsubjects];
    float credits[numberOfsubjects];
    float scores[numberOfsubjects];
    for(int i=0;i<numberOfsubjects;i++){
        printf("Name of subject %d : ",(i+1));
        subjects[i] = malloc(malloc_size * sizeof(char));
        scanf("%99s",subjects[i]);
        printf("Credit Hours: ");
        scanf("%f",&credits[i]);
        printf("Total Score: ");
        scanf("%f",&scores[i]);
    }
    float point[numberOfsubjects];
    char *grade[numberOfsubjects];
    float gpa;
    float totalQualityPoints=0;
    float totalCredit=0;
    for(int i=0;i<numberOfsubjects;i++){
          float score=scores[i];
          if(score>=80 && score<=100){
              grade[i]="A";
              point[i]=4.0;
          }else if(score>=75 && score<=79){
             grade[0]="A-";
             point[i]=3.7;
          }else if(score>=70 && score<=74){
             grade[i]="B+";
             point[i]=3.3;
          }else if(score>=65 && score<=69){
             grade[i]="B";
             point[i]=3.0;
          }else if(score>=60 && score<=64){
             grade[i]="B-";
             point[i]=2.7;
          }else if(score>=55 && score<=59){
             grade[i]="C+";
             point[i]=2.3;
          }else if(score>=50 && score<=54){
             grade[i]="C";
             point[i]=2.0;
          }else if(score>=47 && score<=49){
             grade[i]="C-";
             point[i]=1.7;
          }else if(score>=44 && score<=46){
             grade[i]="D+";
             point[i]=1.3;
          }else if(score>=40 && score<=43){
             grade[i]="D";
             point[i]=1.0;
          }else if(score>=0 && score<=39){
             grade[i]="E";
             point[i]=0.0;
          }else{
            grade[i]="?";
             point[i]=0.0;
          }
    }
    for(int i=0;i<numberOfsubjects;i++){
        totalQualityPoints=totalQualityPoints+point[i]*credits[i];
        totalCredit=totalCredit+credits[i];
    }
    gpa=totalQualityPoints/totalCredit;
    printf("\nYour Results:\n");
    printf("========================================================\n");
    printf("INDEX\tSUBJECT\t\tCREDIT\tSCORE\tGRADE\tPOINT\n");
    printf("========================================================\n");
    for(int i=0;i<numberOfsubjects;i++){
        if(grade[i]=="?"){
            printf("%d",(i+1));
            printf("\t %s",subjects[i]);
            printf("\t\t %0.1f",credits[i]);
            printf("\t %s","invalid score!");
            printf("\t %s",grade[i]);
            printf("\t %0.1f",point[i]);
            printf("\n");
        }else{
            printf("%d",(i+1));
            printf("\t %s",subjects[i]);
            printf("\t\t %0.1f",credits[i]);
            printf("\t %0.1f",scores[i]);
            printf("\t %s",grade[i]);
            printf("\t %0.1f",point[i]);
            printf("\n");
        }
       
    }
    printf("\n========================================================\n");
    printf("Your GPA for this semester %0.2f: ",gpa);
    printf("\n========================================================\n");

    return 0;
}
