#include<iostream>
#include<cstdio>
#include<cstdlib>
#include<iostream>
#include<cmath>
using namespace std;
#define OK 1
#define Broken 0
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
	
}; 
