#include <iostream>

using namespace std;

int main(int argc, const char * argv[]) {
    unsigned long long t,r,c;
    char x;
    cin>>t;
    while(t--){
        cin>>r>>c;

        if(c==1){
            if(r==1){
                x='R';
            }else{
                x='D';
            }
        }else if(c>r){
            if(r%2==0){
                x='L';
            }else{
                x='R';
            }
        }else if(r>c&&c>1){
            if(c%2==0){
                x='U';
            }else{
                x='D';
            }
        }else if(r==c&&c>1){
            if(r%2==0){
                x='L';
            }else{
                x='R';
            }
        }
        cout<<x<<endl;
    }

}
