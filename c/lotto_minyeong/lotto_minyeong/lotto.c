#include<stdio.h>
#include<time.h>


int main()
{

	int arr[6];
	int bouns[1];
	srand(time(NULL));
	int i, j;
	for (i = 0; i < 6; i++)
	{
		arr[i] = rand() %45+1;
		for (j = 0; j < i; j++)
		{
			if (arr[i] == arr[j])
			{
				i--;
				break;
			}
		}
	}
	/*for (int i = 0; i < 6; i++)
		printf("%d번 번호 : %2d\n", i + 1, arr[i]);*/

	int temp;
	for (i = 1; i < 6; i++)
	{
		for (j = 0; j < 6 - i; j++)
		{
			if (arr[j] > arr[j + 1])
			{
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
			}
		}
	}

	//for(int i= 0;i<6;i++)
	//	printf("%2d\n", arr[i]);
	for (int i = 0; i < 6; i++)
		printf("%d번 번호 : %2d\n", i + 1, arr[i]);
	for (int a = 0; a < 1; a++)
	{
		bouns[a] = rand() % 45 + 1;
		for (int b = 0; b <= a; b++)
		{
			if (arr[b] == bouns[a])
			{
				a--;
				break;
			}
		}
		printf("보너스 번호 : %d\n", bouns[a]);
	}
	return 0;
}