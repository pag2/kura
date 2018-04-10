
#include<iostream>
#include<omp.h>
using namespace std;

int k=0;

class array
{
public:

int partition(int arr[], int low_index, int high_index)
{
int i, j, temp, key;
key = arr[low_index];
i= low_index + 1;
j= high_index;
while(1)
{
while(i < high_index && key >= arr[i])
    i++;
while(key < arr[j])
    j--;
if(i < j)
{
temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
else
{
temp= arr[low_index];
arr[low_index] = arr[j];
arr[j]= temp;
return(j);
}
}
}

void quicksort(int arr[], int low_index, int high_index)
{
int j;

if(low_index < high_index)
{
j = partition(arr, low_index, high_index);
cout<<"Pivot element with index "<<j<<" has been found out by thread "<<k<<"\n";

#pragma omp parallel sections
{
    #pragma omp section
    {
        k=k+1;
        quicksort(arr, low_index, j - 1);
    }

    #pragma omp section
    {
        k=k+1;
        quicksort(arr, j + 1, high_index);
    }

}
}
}

};

int main()
{
array a;

int arr[100];
int n,i;

cout<<"Enter the value of n\n";
cin>>n;
cout<<"Enter the "<<n<<" number of elements \n";

for(i=0;i<n;i++)
{
cin>>arr[i];
}

a.quicksort(arr, 0, n - 1);

cout<<"Elements of array after sorting \n";
for(i=0;i<n;i++)
{
cout<<arr[i]<<"\t";
}

cout<<"\n";
}



/*OUTPUT

user@Dell:~/Desktop$ g++ -fopenmp quick.cpp
user@Dell:~/Desktop$ ./a.out
Enter the value of n
8
Enter the 8 number of elements 
342 34 45 2 7456 23 12 9
Pivot element with index 6 has been found out by thread 0
Pivot element with index 2 has been found out by thread 2
Pivot element with index 0 has been found out by thread 3
Pivot element with index 5 has been found out by thread 6
Pivot element with index 3 has been found out by thread 7
Elements of array after sorting 
2	9	12	23	34	45	342	7456	
user@Dell:~/Desktop$ 
*/
