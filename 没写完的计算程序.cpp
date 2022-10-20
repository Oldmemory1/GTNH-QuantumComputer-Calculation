#include<cstdio>
#include<cstdlib>
#include<iostream>
#include<cmath>
using namespace std;
#define OK 1
#define Broken 0
#define GreaterThanTheMaximumValue -1
#define SmallerThanTheMinimumValue -1
class Component{
	private:
	float heat;
	float CoEff;
	float MaxHeat;
	bool Destroyed;
	public:
	void SetData(float a,float b,float c){
		this->heat=a;
		this->CoEff=b;
		this->MaxHeat=c;
		this->Destroyed=false;
	}
	float GetHeat(){
		return this->heat;
	}
	float GetCoEff(){
		return this->CoEff;
	}
	float GetMaxHeat(){
		return this->MaxHeat;
	}
	bool GetStatus(){
		return this->Destroyed;
	}
};
class QuantumComputer{ 
	public:
	Component Array[4];
	private:
	int MaxHeat;
	int NowHeat;
	int ComponentNumber;
	public:
	void SetMaxHeat(int a){
		this->MaxHeat=a;
	}
	void SetNowHeat(int a){
		this->NowHeat=a;
	}
	int GetComponentStatus(){
		for(int i=0;i<4;i++){
			if(this->Array[i].GetMaxHeat()<(float)this->NowHeat){
				return Broken;
			}
		}
		return OK;
	}
	void Initialization(int number){

			for(int i=0;i<4;i++){
				this->Array[i].SetData(0,0,10000);
			}
			this->ComponentNumber=number;
			this->NowHeat=0;
			this->MaxHeat=10000; 

	}
	void GetComponentData(){
		float num1,num2,num3;
		for(int i=0;i<this->ComponentNumber;i++){
		    scanf("%f %f %f",&num1,&num2,&num3);	
			this->Array[i].SetData(num1,num2,num3);
		}
	}
	void PrintComponentData(){
		for(int i=0;i<4;i++){
			printf("内部组件%d：%f %f %f %f\n",i,this->Array[i].GetHeat(),this->Array[i].GetCoEff(),this->Array[i].GetMaxHeat(),this->Array[i].GetStatus());
		}
	}
}; 
int main(){
	int ComponentNum;
	printf("请输入内部的组件数目：\n");
	scanf("%d",&ComponentNum);
	QuantumComputer* AComputer=new QuantumComputer;
	AComputer->Initialization(ComponentNum);
	AComputer->GetComponentData();
	AComputer->PrintComponentData();
} 
