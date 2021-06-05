#include <stdio.h>

struct player
{
    char name[100];
    char country[100];
    int run[5];
    int wicket[5];
    int point[5];
};

int main()
{
    struct player players[10];

    for(int i = 0; i < 10; i++)
    {
        printf("Player %d's name: ", i+1);
        scanf("%s", players[i].name);
        printf("Player %d's country: ", i+1);
        scanf("%s", players[i].country);

        for(int j = 0; j < 4; j++)
        {
            printf("Player %d's run in match %d: ", i+1, j+1);
            scanf("%d", &players[i].run[j]);

            printf("Player %d's wicket in match %d: ", i+1, j+1);
            scanf("%d", &players[i].wicket[j]);
        }
    }

    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            players[i].point[j] = 0;

            if (players[i].run[j] >= 100)
                players[i].point[j] += 30;
            else if (players[i].run[j] >= 75)
                players[i].point[j] += 18;
            else if (players[i].run[j] >= 50)
                players[i].point[j] += 10;
            else if (players[i].run[j] >= 25)
                players[i].point[j] += 2;

            players[i].point[j] += players[i].wicket[j]*10;
        }
    }

    //find players of the match of every match
    int max0=0, max1=0, max2=0, max3=0;
    for(int i = 0; i < 10; i++)
    {
        if(players[i].point[0] > players[max0].point[0])
            max0 = i;

        if(players[i].point[1] > players[max1].point[1])
            max1 = i;

        if(players[i].point[2] > players[max2].point[2])
            max2 = i;

        if(players[i].point[3] > players[max3].point[3])
            max3 = i;
    }
    printf("Player of the match 1: %s\n", players[max0].name);
    printf("Player of the match 2: %s\n", players[max1].name);
    printf("Player of the match 3: %s\n", players[max2].name);
    printf("Player of the match 4: %s\n", players[max3].name);


    int max = 0;
    for(int i = 0; i < 10; i++)
    {
        if (players[i].point[0]+players[i].point[1]+players[i].point[2]+players[i].point[3] > players[max].point[0]+players[max].point[1]+players[max].point[2]+players[max].point[3])
            max = i;
    }
    printf("Player of the series: %s\n", players[max].name);
}