#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

class Bank{
	string name;
	int accnum;
	int amt = 0;
	int bal = 0;
	char type[10];
	
	public:
		void setVal()
		{
			cout<<"Enter name: ";
			cin>>name;
			
			cout<<"\nEnter account number: ";
			cin>>accnum;
			
			cout<<"\nEnter account type: ";
			cin>>type;
			
			cout<<"\nEnter balance: ";
			cin>>bal;
		}
		
		void showData()
		{
			cout<<"\nName: "<<name<<endl;
			cout<<"Account No. :"<<accnum<<endl;
			cout<<"Account type: "<<type<<endl;
			cout<<"Balance: "<<bal<<endl;
		}
		
		void deposit()
		{
			cout<<"\nEnter deposit amount: ";
			cin>>amt;
		}
		
		void viewBal()
		{
			bal = bal+amt;
			cout<<"\nTotal Balance: "<<bal<<endl;
		}
		
		void withdraw()
		{
			int a, new_bal;
			cout<<"\nEnter amount to withdraw: ";
			cin>>a;
			new_bal = bal-a;
			cout<<"\nAvailable balance: "<<new_bal<<endl;
		}
};

int main()
{
	Bank b;
	int choice;
	while(1){
		cout<<"\n\n---------WELCOME-----------"<<endl;
		cout<<"\n1.Enter new details"<<endl;
		cout<<"2.Balance enquiry"<<endl;
		cout<<"3.Deposit money"<<endl;
		cout<<"4.Withdraw money"<<endl;
		cout<<"5.Cancel"<<endl;
		
		cout<<"\nEnter choice: ";
		cin>>choice;
		
		switch(choice){
			case 1:
				b.setVal();
				break;
			case 2:
				b.viewBal();
				break;
			case 3:
				b.deposit();
				break;
			case 4:
				b.withdraw();
				break;
			case 5:
				exit(1);
				break;
			default:
				cout<<"\n-----Invalid choice-----"<<endl;
		}
		
	}
	return 0;
}
