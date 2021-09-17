// Circular Queue

#include<iostream>
#include<climits>
#define MAX 10
using namespace std;

int queue[MAX];
int front=-1, rear=-1;


// Enqueue an element to the Queue
void enqueue(int num)
{
	if((rear==MAX-1 && front==0) || (front==rear+1))
	{
		cout<<"Queue is Full \n";
		return;
	}
	
	if(rear == MAX-1) // front != 0
		rear = -1;
	rear++;
	queue[rear] = num;
	if(front == -1)
		front=0;
}


// Dequeue an element from Queue
void dequeue()
{
	if(front==-1)
	{
		cout<<"Queue is Empty \n";
		return;
	}
	int number;
	number = queue[front];
	queue[front] = INT_MAX;
	
	if(front == rear)
	{
		front = -1;
		rear = -1;
	}
	else if(front == MAX-1) //rear != MAX-1
		front = 0;
	else
		front++;
	
	cout<<"Dequeued element = "<<number<<"\n";
}


// Display Front of Queue
void queue_front()
{
	if(front == -1)
	{
		cout<<"Queue is Empty \n";
		return;
	}
	cout<<"Front of the queue = "<<queue[front]<<"\n";
}


// Display Rear of Queue
void queue_rear()
{
	if(rear == -1)
	{
		cout<<"Queue is Empty !!\n";
		return;
	}
	cout<<"Rear of the  queue = "<<queue[rear]<<"\n";
}


// Display entire Queue
void disp_queue()
{
	if(front == -1)
	{
		cout<<"Queue is Empty !!\n";
		return;
	}

	for(int i=0;i<MAX;i++)
	{
		if(queue[i] == INT_MAX)
			continue;
		cout<<queue[i]<<" ";
	}
	cout<<"\n";
}


int main()
{
	int choice,number;
	
	for(int i=0;i<MAX;i++)
		queue[i] = INT_MAX;
	
	while(1)
	{
		cout<<"\nAvailable Operations: \n";
		cout<<"1. ENQUEUE\n2. DEQUEUE\n3. Queue_Front\n4. Queue_Rear\n5. Queue_Display\n6. Exit\n\n";
		cout<<"Enter your choice : ";
		cin>>choice;
		
		switch(choice)
		{
			case(1):
				cout<<"Enter the number : ";
				cin>>number;
				enqueue(number);
				break;
			case(2):
				dequeue();
				break;
			case(3):
				queue_front();
				break;
			case(4):
				queue_rear();
				break;
			case(5):
				disp_queue();
				break;
			case(6):
				exit(0);
		}
	}
	return 0;
}
