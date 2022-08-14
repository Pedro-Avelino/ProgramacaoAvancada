#include <unistd.h>
#include <sys/types.h>
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    int fd[2];
    pid_t id;

    if (pipe(fd) < 0)
    {
        perror("pipe");
        return -1;
    }

    if ((id = fork()) < 0)
    {
        perror("fork");
        exit(1);
    }

    if (id == 0)
    {

        close(fd[0]);

        int sumPairs;

        for (int i = 0; i <= 10; i++)
        {
            if (i % 2 == 0)
            {
                sumPairs += i;
            }
        }

        write(fd[1], &sumPairs, sizeof(sumPairs));
    }

    if (id > 0)
    {
        int sumPairs;
        close(fd[1]);

        int sumOdd;

        for (int i = 0; i < 10; i++)
        {
            if (i % 2 != 0)
            {
                sumOdd += i;
            }
        }

        read(fd[0], &sumPairs, sizeof(sumPairs));
        printf("A soma dos números de 1 a 10 é %d.\n", sumPairs + sumOdd);
    }

    return 0;
}