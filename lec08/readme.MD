# function(static methods) & String

## Java Static Methods
###  methods without return-value
```aidl
static void foo( ...ARGS...){
....
}

```
###  methods with return-value(int,array,Object)
```aidl
static RETURN-TYPE foo(...ARGS...){
....

    return EXPRESSION;
}
```
## function design  (Yanghui Triangle)

### bottom-up
```aidl
f(),g()->h()->main()
```
### top-down
```aidl
main()<-h()<-g(),f()
```
### recursive //f->f()
- recursive base
- recursive body
```aidl
    ... fun(){
        ...
        fun()
        ...
    
    }

```
eg:
```aidl
static int factorial(int n){
    if(n<=1){
        return 1;
    }else{
        return factorial(n-1)*n;
    }
}
```
## String API
- length
- charAt(index)
- join:s1+s2
- startWith/endWith/contains
- split