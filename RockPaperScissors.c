#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{

    char player_name[20];

again:
    printf("\n ██████   ██████   ██████ ██   ██     ██████   █████  ██████  ███████ ██████      ███████  ██████ ██ ███████ ███████  ██████  ██████  ███████ \n ██   ██ ██    ██ ██      ██  ██      ██   ██ ██   ██ ██   ██ ██      ██   ██     ██      ██      ██ ██      ██      ██    ██ ██   ██ ██  \n ██████  ██    ██ ██      █████       ██████  ███████ ██████  █████   ██████      ███████ ██      ██ ███████ ███████ ██    ██ ██████  ███████ \n ██   ██ ██    ██ ██      ██  ██      ██      ██   ██ ██      ██      ██   ██          ██ ██      ██      ██      ██ ██    ██ ██   ██      ██ \n ██   ██  ██████   ██████ ██   ██     ██      ██   ██ ██      ███████ ██   ██     ███████  ██████ ██ ███████ ███████  ██████  ██   ██ ███████ \n");
    printf("\n\t\t\t\t\t Enter Your Name:\t");
    scanf("%s", player_name);

    int rounds;
    printf("\n%s , How many rounds you want to play? :\t", player_name);
    scanf("%d", &rounds);
    int player_score = 0, computer_score = 0;

    for (int round = 1; round <= rounds; round++)
    {

        int player_choice, computer_choice;
        printf("\n\n\t\tRound No :\t%d / %d\n", round, rounds);
        printf("\n\t\t%s's score is = %d", player_name, player_score);
        printf("\n\t\tComputer's score is = %d", computer_score);
        printf("\n\t\t\t1. Rock");
        printf("\n\t\t\t2. Paper");
        printf("\n\t\t\t3. Scissor");
        do
        {
            printf("\nSelect Your Choice :\t");
            scanf("%d", &player_choice);

        } while (player_choice != 1 && player_choice != 2 && player_choice != 3);
        computer_choice = (rand() % 3) + 1;
        if (player_choice == 1 && computer_choice == 3)
        {
            printf("\n%s win", player_name);
            player_score++;
        }
        else if (player_choice == 2 && computer_choice == 1)
        {
            printf("\n%s win", player_name);
            player_score++;
        }
        else if (player_choice == 3 && computer_choice == 2)
        {
            printf("\n%s win", player_name);
            player_score++;
        }
        else if (player_choice == computer_choice)
        {
            printf("\nGame Draw");
        }
        else
        {
            printf("\nComputer Win");
            computer_score++;
        }
        
    }
    if (computer_score == player_score)
    {
        printf("\n\t\t\t\tGame Draw");
    }
    else if (player_score > computer_score)
    {
        printf("\n\t\t\t\t%s won the game\n", player_name);
    }
    else
    {
        printf("\n\t\t\t\tComputer Won the Game\n");
    }
    int ag;
    printf("\n\t\t\t\tType '0' to start again :\t");
    scanf("%d", &ag);
    if (ag == 0)
        goto again;

    else

        sleep(10);
    return 0;
}
