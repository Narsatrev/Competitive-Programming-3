#include <iostream>
#include <algorithm>
using namespace std;
int main(int argc, const char * argv[]) {
    int t,n,m,x,max,ganador,arr[5]={0};
    
    cin>>t;
    for(int k=0;k<t;k++){
        cin>>n>>m;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cin>>x;
                arr[j]+=x;
            }
        }
        max=0;
        ganador=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                ganador=i+1;
            }
            arr[i]=0;
        }
        cout<<ganador<<endl;
    }
}
