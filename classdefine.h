#include<cstdio>
#include<cstdlib>
#include<iostream>
#include<cmath>
#include<ctime>
#include<windows.h>
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
	float Computation;
	bool Destroyed;
	public:
	void SetData(float a,float b,float c,float d){
		this->heat=a;
		this->CoEff=b;
		this->MaxHeat=c;
		this->Computation=d; 
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
	float GetComputation(){
		return this->Computation;
	}
	bool GetStatus(){
		return this->Destroyed;
	}
	void OutPutData(){
		printf("该组件的数据：\n产生热量：%f，热效率：%f，可承受的最大热量：%f，提供的算力：%f，是否已经损坏：%f\n",this->heat,this->CoEff,this->MaxHeat,this->Computation,this->Destroyed);
	} 
};
class QuantumComputer{ 
	public:
	Component Array[4];
	private:
	int MaxHeat;
	int NowHeat;
	int ComponentNumber;
	int OutputComputation; 
	float OverVolt;
	float OverClock;
	public:
	void SetMaxHeat(int a){
		this->MaxHeat=a;
	}
	void SetNowHeat(int a){
		this->NowHeat=a;
	}
	int GetNowHeat(){
		return this->NowHeat;
	}
	float GetOverVolt(){
		return this->OverVolt;
	}
	float GetOverClock(){
		return this->OverClock; 
	}
	
	int GetOutputComputation(){
		return this->OutputComputation;
	} 
	void Initialization(int number,float overvolt,float overclock){
			for(int i=0;i<4;i++){
				this->Array[i].SetData(0,0,10000,0);
			}
			this->ComponentNumber=number;
			this->NowHeat=0;
			this->MaxHeat=10000; 
			this->OutputComputation=0; 
			this->OverClock=overclock;
			this->OverVolt=overvolt;
            
	}
	void GetComponentData(){
		float num1,num2,num3,num4;
		for(int i=0;i<this->ComponentNumber;i++){
		    scanf("%f %f %f %f",&num1,&num2,&num3,&num4);	
			this->Array[i].SetData(num1,num2,num3,num4);
			if(this->OverClock==1&&this->OverVolt==1){
				this->OutputComputation=this->OutputComputation+(int)this->Array[i].GetComputation();
			}
			//printf("%d\n",this->OutputComputation);
		}
		
	}
	void PrintComponentData(){
		for(int i=0;i<4;i++){
			this->Array[i].OutPutData();
		}
	}
	void CalcComputationPowerAndHeat(){
		if(this->OverClock==1&&this->OverVolt==1){
			float ChangeHeat1=0;
			for(int i=0;i<4;i++){
				ChangeHeat1=ChangeHeat1+((float)1+this->Array[i].GetCoEff()*this->NowHeat/(float)10000)*(this->Array[i].GetHeat());
			}
			int change=0;
			change=ceil(ChangeHeat1);
			this->NowHeat=this->NowHeat+change;
			//printf("当前热量：%d\n",this->NowHeat);
			
		}else{
			//没写完的程序 
			 srand((unsigned)(time(0)));
			 //this->OutputComputation=0;
			 float Randomnumber1=static_cast <float> (rand()) / static_cast <float> (RAND_MAX);;
			 float f1=min(this->OverClock,(float)2*this->OverVolt-(float)0.25);
			 float f2=(float)1+Randomnumber1+(this->OverVolt-(float)1)-((this->OverClock-(float)1)/float(2));
			 float f3=min(f1,f2);
			 float f4=max((float)0,f3);
			 //printf("f4:%f\n",f4); 
			 float tempout=0;
			 for(int i=0;i<4;i++){
			 	tempout=tempout+f4*this->Array[i].GetComputation();
			 }
			 this->OutputComputation=floor(tempout);
			 
			 float ChangeHeat1=0;
			 for(int i=0;i<4;i++){
			 	if(this->Array[i].GetHeat()>0){
			 		ChangeHeat1=ChangeHeat1+(this->Array[i].GetHeat()*this->OverClock*this->OverClock*this->OverVolt)*((float)1+this->Array[i].GetCoEff()*this->NowHeat/(float)10000);
				}else if(this->Array[i].GetHeat()<0){
					ChangeHeat1=ChangeHeat1+(this->Array[i].GetHeat())*((float)1+this->Array[i].GetCoEff()*this->NowHeat/(float)10000);
				} 
			 }
			 int change=0;
			 change=ceil(ChangeHeat1);
			 //printf("change:%d\n",change);
			 this->NowHeat=this->NowHeat+change; 
		}


	}
	void NaturalHeatDissipation(){
		float ChangeHeat2=0;
		if(this->NowHeat>0){
			for(int i=0;i<4;i++){
				ChangeHeat2=ChangeHeat2+this->Array[i].GetHeat()*this->NowHeat/(float)10000;
			}
		}
		//printf("数据：%f",ChangeHeat2);
		int temp1=ceil(ChangeHeat2); 
		int NaturalChange=0;
		NaturalChange=max(-this->NowHeat,temp1);
		this->NowHeat=this->NowHeat+NaturalChange;
		if(this->NowHeat>0){
			this->NowHeat=this->NowHeat-max(this->NowHeat/1000,1);
		}else if(this->NowHeat<0){
			this->NowHeat=this->NowHeat-min(this->NowHeat/1000,-1);
		}
		if(this->NowHeat<-10000){
			this->NowHeat=-10000;
		}
		//printf("当前热量：%d\n",this->NowHeat); 

	} 

	int GetComponentStatus(){
		/*for(int i=0;i<4;i++){
			if(this->Array[i].GetMaxHeat()<(float)this->NowHeat||this->NowHeat>this->MaxHeat){
				return Broken;
			}
		}*/
		if(this->NowHeat>10000){
			return Broken;
		}else{
		    return OK;			
		} 

	}
}; 
