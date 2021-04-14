#include <stdio.h>
#include <stdlib.h>
int main()
{
    system("color FD");
    char name_1[50], name_2[50];
    int data[3][3] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
    int winner = 0, count = 0;
    int i, j, sign, player, flag;
    char coma;
    printf("\n\t\t\t\t\t\t\t\t\t\t\n\n\n");
    printf("\t    ████████╗██╗ ██████╗    ████████╗ █████╗  ██████╗    ████████╗ ██████╗ ███████╗\n            ╚══██╔══╝██║██╔════╝    ╚══██╔══╝██╔══██╗██╔════╝    ╚══██╔══╝██╔═══██╗██╔════╝\n               ██║   ██║██║            ██║   ███████║██║            ██║   ██║   ██║█████╗\n               ██║   ██║██║            ██║   ██╔══██║██║            ██║   ██║   ██║██╔══╝\n               ██║   ██║╚██████╗       ██║   ██║  ██║╚██████╗       ██║   ╚██████╔╝███████╗\n               ╚═╝   ╚═╝ ╚═════╝       ╚═╝   ╚═╝  ╚═╝ ╚═════╝       ╚═╝    ╚═════╝ ╚══════╝\n");

    printf("\n\t\t\t\tPlease enter the name of player 1 (X):\t");
    gets(name_1);
    printf("\n\t\t\t\tPlease enter the name of player 2 (Y):\t");
    gets(name_2);

    while (count < 9)
    {
        flag = 0;

        printf("\n\t\t\t\t\t--- Tic Tac Toe Board ---\n");
        printf("\n\t\t\t\t\t\t  %c | %c | %c \n", data[0][0], data[0][1], data[0][2]);
        printf("\t\t\t\t\t\t-------------\n");
        printf("\t\t\t\t\t\t  %c | %c | %c \n", data[1][0], data[1][1], data[1][2]);
        printf("\t\t\t\t\t\t-------------\n");
        printf("\t\t\t\t\t\t  %c | %c | %c \n", data[2][0], data[2][1], data[2][2]);

        if (count % 2 == 0)
        {
            sign = 'X';
            player = 1;

            printf("\nPlayer %d (%s), please enter your move:\t", player, name_1);
            scanf("%d", &i);
            scanf("%c", &coma);
            scanf("%d", &j);

            i = i - 1;
            j = j - 1;
        }
        else
        {

            sign = 'Y';
            player = 2;

            printf("\nPlayer %d (%s), please enter your move:\t", player, name_2);
            scanf("%d", &i);
            scanf("%c", &coma);
            scanf("%d", &j);

            i = i - 1;
            j = j - 1;
        }
        if ((i <= -1 || i >= 3) || (j <= -1 || j >= 3))
        {
            printf("\t\t\t\t\t------- INVALID MOVE. PLEASE TRY AGAIN -------\t\t\t\t\t\n");

            continue;
        }
        if ((data[i][j] == 'Y' || data[i][j] == 'X') || (data[i][j] == 'X' || data[i][j] == 'Y'))
        {
            printf("\n\t\t\t\t\t------- INVALID MOVE. PLEASE TRY AGAIN -------\t\t\t\t\t\n");

            continue;
        }

        data[i][j] = sign;

        count++;

        flag = 0;

        if ((data[0][0] == sign && data[1][1] == sign && data[2][2] == sign) ||
            (data[0][2] == sign && data[1][1] == sign && data[2][0] == sign) ||
            (data[0][0] == sign && data[0][1] == sign && data[0][2] == sign) ||
            (data[0][0] == sign && data[1][0] == sign && data[2][0] == sign) ||
            (data[0][1] == sign && data[1][1] == sign && data[2][1] == sign) ||
            (data[0][2] == sign && data[1][2] == sign && data[2][2] == sign) ||
            (data[1][0] == sign && data[1][1] == sign && data[1][2] == sign) ||
            (data[2][0] == sign && data[2][1] == sign && data[2][2] == sign))
        {
            winner = 1;
            goto win;
        }
    }
win:

    printf("\n\t\t\t\t\t--- Tic Tac Toe Board ---\n");
    printf("\n\t\t\t\t\t\t  %c | %c | %c \n", data[0][0], data[0][1], data[0][2]);
    printf("\t\t\t\t\t\t-------------\n");
    printf("\t\t\t\t\t\t  %c | %c | %c \n", data[1][0], data[1][1], data[1][2]);
    printf("\t\t\t\t\t\t-------------\n");
    printf("\t\t\t\t\t\t  %c | %c | %c \n", data[2][0], data[2][1], data[2][2]);
    if (winner)
    {
        if (player == 1)
        {
            printf(" \n\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t");
            printf("\n\t\t\t------- CONGRATS !!! Player %d (%s) !!! You are the WINNER -------", player, name_1);
            printf(" \n\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t\n");
        }

        else
        {
            printf(" \n\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t");
            printf("\n\t\t\t------- CONGRATS Player %d (%s) !!! You are the WINNER -------", player, name_2);
            printf(" \n\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t\n");
        }
    }
    else
    {
        printf(" \n\t\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t");
        printf("\n\t\t\t\t--------------- Match draw.. Best of luck for both ---------------\n");
        printf(" \n\t\t\t\t █████ █████ █████ █████ █████ █████ █████ █████ █████ █████ \t\t\t\n");
    }
    sleep(5);
    return 0;
}
