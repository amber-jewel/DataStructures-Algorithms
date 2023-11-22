# DataStructures-Algorithms
***
# Essential Tips
## Big O Notation

Big O ဆိုတာ computer algorithm တစ်ခုချင်းစီရဲ့ efficiency ကို တိုင်းတာတဲ့ အမှတ်အသားတစ်ခု။

Algorithm တစ်ခုရဲ့ efficiency တိုင်းတာတဲ့အချိန်မှာ Big O က အဲ့ algorithm ရဲ့ constant တန်ဖိုးတွေကို ထည့်မတွက်ပါ။

Example - O(1), O(logN), O(N), O(N^2), O(N^3), ...

## Contents
1. Array
2. Simple Sorting
3. Stacks and Queues
4. Linked List
5. Recursion
6. Advanced Sorting
***
## Array
Array က အသုံးအများဆုံး data storage structure တစ်ခု ဖြစ်ပါတယ်။

Array ကို သုံးပုံသုံးနည်း 2 နည်း ရှိတယ်။
array အခန်းတွေထဲကို (initialize) တန်ဖိုးထည့်ပြီး သုံးတဲ့နည်း နဲ့ new operator ကို သုံးပြီး object ဆောက်သုံးတဲ့နည်း
 ```java
 int[] intArr = {1, 2, 3 };
 int[] anotherIntArr = new int[3];
 ```


Array ထဲမှာ ပါဝင်တဲ့ data တွေ ရဲ့ type တွေဟာ တူညီတဲ့ data type တွေ ဖြစ်ရပါ့မယ်။

 ```java
 int[] intArr = new int[5];
 String[] strArr = new String[5];
 ```
 intArr သည် integer data type တွေဘဲရှိတဲ့ integer တန်ဖိုးတွေဘဲ လက်ခံနိုင်တယ်။  strArr သည် string data type တွေဘဲရှိတဲ့ string တန်ဖိုးတွေဘဲ လက်ခံနိုင်တယ်။


Array ရဲ့ အားနည်းချက်ကတော့ fixed size ဖြစ်တယ်။ သူတို့ကို initialize လုပ်တဲ့ အချိန် နဲ့ new operator သုံးတဲ့ အချိန်က စပြီး သူတို့ရဲ့ array အခန်းတွေသည် ထပ်တိုး၍ မရတော့ပါ။ အားသာချက်ကတော့ array အခန်းတွေရဲ့ (index) နံပါတ်ကိုသိရင် သူတို့ရဲ့ (operation) လုပ်ဆောင်ချက်တွေသည် အရမ်းကို မြန်ပါတယ်။


### Insert into Unodered Array
(Unodered array) ကြီးစဉ်ငယ်လိုက် (ascending) or ငယ်စဉ်ကြီးလိုက် (descending) စီမထားသော array ထဲကို တန်ဖိုးထည့်ရင် (insert) အရမ်းမြန်ပါတယ်။ Array ရဲ့ အခန်းတွေထဲမှာ data ဘယ်လောက်ရှိသလဲဆိုတာ ထည့်မတွက်သောကြောင့် ဖြစ်တယ်။ Array ရဲ့ နောက်လွတ်တဲ့အခန်းတွေထဲကို တိုးတိုးပြီး တန်ဖိုးထည့်သွားတဲ့ အတွက်ကြောင့် ဖြစ်ပါတယ်။ ဒါကြောင့် runtime complexity အရ ကြည့်ရင် O(1) constant time ဖြစ်ပါတယ်။

 ```java
 int nElems;
 int[] intArr = new int[5];
 intArr[nElems++] = 2;
 intArr[nElems++] = 5;
 intArr[nElems++] = 3;
 output: intArr = { 2, 5, 3, 0, 0 };
 ```
- insert algorithm into unodered array
  - insert new data into a next vacant cell (array ရဲ့ နောက်လွတ်မယ့် အခန်းထဲကို data ထည့်မယ်။)
  
    ```java
    array[index++] = ထည့်မယ့် data အသစ်;
    ```
  - runtime complexity O(1) constant time
  

### Insert into Ordered Array
(Ordered array) ငယ်စဉ်ကြီးလိုက် (descending) or ကြီးစဉ်ငယ်လိုက် (ascending) စီထားသော array ထဲကို တန်ဖိုးထည့်ရင် (insert) run time complexity အရ ကြည့်ရင် O(N) ဖြစ်ပါတယ်။

 ```java
 int nElems;
 int[] intArr = new int[5];
 intArr[nElems++] = 2;
 intArr[nElems++] = 5;
 intArr[nElems++] = 3;
 output: intArr = { 2, 3, 5 };
 ```
- insert algorithm into odered array
  - ထည့်မယ့် data သည် နဂိုရှိပြီးသား array အခန်းတိုင်းရဲ့ data နဲ့ နှိုင်းယှဉ်ပြီး ထည့်မယ့်နေရာကို လိုက်ရှာမယ်။
  
   ```java
   int i;
   for (i = 0; i < array.length; i++) {
       if (array[i] > ထည့်မယ့် data အသစ်) {
          break;
       }
   }
   ```
  - နေရာတွေ့တာနဲ့ အဲ့နေရာထဲမှာ ရှိတဲ့ တန်ဖိုးကနေစပြီး move up တစ်ခန်းတိုးပြီး နဂို data ပြန်ထည့်သွားမယ်။
  
   ```java
   for (int k = array.length; k > i; k--) {
         array[k] = array[k - 1];
   }
   ```
  - ပြီးရင် data အသစ် ထည့်မယ်။
  
    ```java
    array[i] = ထည့်မယ့် data အသစ်;
    ```
  - ပြီးရင် array အခန်းကို တစ်တိုးမယ်။
  - runtime complexity O(N)


### Delete
Array အခန်း‌တွေထဲက တန်ဖိုးကို ဖျက်ချင်ရင် (delete operation) သူ့ရဲ့ လုပ်ဆောင်ချက်သည် runtime complexity အရ ကြည့်ရင် O(N) ဖြစ်ပါတယ်။ 
- delete algorithm
   - အရင်ဆုံး ဖျက်မယ့်တန်ဖိုးရဲ့ array အခန်းတိုင်းကို လိုက်ရှာတယ်။
  
  ```java
  int i;
  for (i = 0; i < array.length; i++) {
      if (array[i] == ဖျက်မယ့် တန်ဖိုး) {
           break;
      }
  }
  ```
   - တွေ့ရင် ဖျက်မယ်, ဖျက်ပြီးရင် ဖျက်တဲ့ array ခန်းရဲ့ နောက်မှာရိှတဲ့ တန်ဖိုးတွေကို move down လုပ်မယ်။ မတွေ့ရင် operation fail မယ်။
  
  ```java
  for (int k = i; k < array.length; k++) {
        array[k] = array[k + 1];
  }
  ```
  - ပြီးရင် array အခန်းကို တစ်လျှော့မယ်။
  - runtime complexity O(N)


### Update
Array အခန်းတွေထဲက တန်ဖိုးတစ်ခုခုကို update လုပ်ချင်ရင် update လုပ်ချင်တဲ့ နဂိုရှိပြီးသား တန်ဖိုးကို array ရဲ့ အခန်းတိုင်းကို လိုက်ရှာမယ်။

- update algorithm
  - နဂို ရှိပြီးသား update လုပ်ချင်တဲ့ တန်ဖိုးကို array ရဲ့ အခန်းတိုင်းကို လိုက်ရှာမယ်။
  - တွေ့ရင် အဲ့ array အခန်းကို update လုပ်မယ်။ မတွေ့ရင် operation fail မယ်။
  
   ```java
   for (int i = 0; i < array.length; i++) {
       if (array[i] == နဂို ရှိပြီးသား update လုပ်ချင်တဲ့ တန်ဖိုး) {
            array[i] = update လုပ်ချင်တဲ့ တန်ဖိုး အသစ်;
      }
   }
   ```
   - runtime complexity O(N)


### Search By Linear (Linear Search)
ရှာချင်တဲ့ တန်ဖိုးကို array ရဲ့ အခန်းတိုင်းကို လိုက်ရှာမယ်။ ဒီလိုရှာတဲ့နည်းကို Linear Search လို့ ခေါ်ပါတယ်။

- search algorithm by linear
   - ရှာချင်တဲ့ တန်ဖိုးကို array ရဲ့ အခန်းတိုင်းကို လိုက်ရှာမယ်။
   
     ```java
     for (int i = 0; i < array.length; i++) {
       if (array[i] == ရှာချင်တဲ့ တန်ဖိုး) {
            လုပ်ဆောင်ချက် တစ်ခုခုကို လုပ်မယ်။;
       }
     }
     ```
   - မတွေ့ရင် operation fail မယ်။
   - runtime complexity O(N)


### Search By Binary (Binary Search)
Array ကို ရှာချင်တဲ့ တန်ဖိုးနဲ့ နှိုင်ယှဉ်ပြီး တစ်ဝက် တစ်ဝက်စီ ခွဲပြီး ရှာမယ်။ Binary search က ငယ်စဉ်ကြီးလိုက် ဒါမှမဟုတ် ကြီးစဉ်ငယ်လိုက် စီထားတဲ့ array မှာဘဲ လုပ်ဆောင်တယ်။ Binary search က data စီထားတဲ့ပေါ်မှာဘဲ သက်ရောက်မှု့ရှိတယ်။

- search algorithm by binary
  - array ကို တစ်ဝက်စီ ပိုင်းပြီး ရှာမယ်။
  - ရှာချင်တဲ့ တန်ဖိုးက တစ်ဝက်ခွဲခံရတဲ့ array ရဲ့ တန်ဖိုးနဲ့နှိုင်းယှဉ်ပြီး သူ့ထက်ငယ်ရင် သူ့အောက်တစ်လျှော့ပြီး ထပ်ရှာမယ် ဒါမှမဟုတ် သူ့ထက်ကြီးရင် သူ့အထက်တစ်ပေါင်းပြီး ထပ်ရှာမယ်။
  - ရှာချင်တဲ့တန်ဖိုးတွေ့ရင် လုပ်ဆောင်ချက်တစ်ခုခုလုပ်မယ်။ မတွေ့ရင် operation fail မယ်။
    
    ```java
    int[] arr = { 1, 3, 5, 7 , 9, 11 };
    int key = 5;
    int left = 0;
    int right = arr.length - 1;
    while (true) {
      int curIndex = (left + right)/2;
      if (key == arr[curIndex) {
           return arr[curIndex];
      } else (left > right) {
           return arr.length;
      } else {
        if (key > arr[curIndex]) {
           left = curIndex + 1;
        } else {
           right = curIndex - 1;
        }
      }
    }
    ```
  - runtime complexity O(log N)
***


# Simple Sorting
### Bubble Sort
Array အခန်းနှစ်ခန်း ရဲ့ တန်ဖိုးအချင်းချင်း နှိုင်းယှဉ်မယ်။ ဘယ်ဘက် array အခန်းရဲ့ တန်ဖိုးက ညာဘက် array အခန်းရဲ့ တန်ဖိုးထက် ကြီးနေရင် တန်ဖိုးချင်း နေရာပြောင်းမယ် (swap data)။

- algorithm
  1. ကပ်လျှက်အခန်းနှစ်ခန်း တန်ဖိုးချင်း နှိုင်းယှဉ်မယ်။
  2. ဘယ်ဘက်အခန်းရဲ့ တန်ဖိုးက ညာဘက်အခန်းရဲ့ တန်ဖိုးထက် ကြီးနေရင် တန်ဖိုးအချင်းချင်း နေရာပြောင်းမယ် (swapping data)။
  3. ညာဘက်ကို တစ်နေရာ/တစ်ခန်းစီ ရွေ့မယ်။
  4. အကုန် data စီ မပြီးမချင်း အဆင့် i, ii နဲ့ iii ကို လုပ်ဆောင်မယ်။
  
   ```java
   for (int out = array.length - 1; i > 0; out--) {
         for (int in = 0; k < out; in++) {
              if (array[in] > array[in + 1]) {
                   // swap(in, in + 1);
                   int temp = array[in];
                   array[in] = array[in + 1];
                   array[in + 1] = temp;
              }
         }
   }
   ```
   5. runtime complexity O(N^2)


### Selection Sort
Array အခန်းတွေထဲက တန်ဖိုး အနည်းဆုံးကောင်ကို အရင်ရွေးမယ်။ ရွေးလိုက်တဲ့တန်ဖိုးကို array ရဲ့ ပထမဆုံးအခန်းက တန်ဖိုးနဲ့ နှိုင်းယှဉ်မယ်။ ရွေးလိုက်တဲ့တန်ဖိုးက ငယ်ရင် တန်ဖိုးချင်းနေရာပြောင်းမယ်။ array အခန်းရဲ့ ဘယ်ဘက်ကနေ ညာဘက်ထိ (left->right) တန်ဖိုးတွေ စီနည်း။

- algorithm
  1. တန်ဖိုးအနည်းဆုံးကို အရင်ရွေးမယ်။
  2. အဲ့တန်ဖိုးနဲ့ array ရဲ့ ပထမအခန်းကတန်ဖိုးနဲ့ နှိုင်းယှဉ်မယ်။ 
  3. ငယ်ရင် တန်ဖိုးချင်း နေရာပြောင်းမယ် (swapping data)။
  4. Data တွေ အကုန်စီမပြီးမချင်း အဆင့် i, ii and iii ကို ထပ်ခါတစ်လဲလဲ လုပ်ဆောင်မယ်။ အဆင့် ii မှာ data နှိုင်းယှဉ်တဲ့အခါ array အခန်းကို တစ်ခါနှိုင်းယှဉ်တိုင်း တစ်ခန်းတိုးတိုးပြီး နှိုင်းယှဉ်သွားမယ်။
  
   ```java
   for (int out = 0; out < array.length - 1; out++) {
       int min = out;
       for (int in = out + 1; in < array.length; in++) {
           if (array[in] < array[min]) {
              min = in;
           }
       }
       swap(out, min);
   }
   ```
   5. runtime complexity O(N^2)



### Insertion Sort
စိတ်ကူးယှဉ်ခြင်းဖြစ် array အခန်းတစ်ခန်းရဲ့ data ကို မှတ်သားထားမယ်။ အဲ့အခန်းရဲ့ ဘယ်ဘက်မှာရှိတဲ့ အခန်းတွေဟာ သူ့ဘာသာ စီနေတဲ့ data (partially sorted data) နဲ့ ညာဘက်မှာရှိတဲ့ အခန်းတွေဟာ မစီရသေးတဲ့ data။ Partially sorted data က insertion sort မှာ ဖြစ်ပေါ်တယ်။ Array ကို ဘယ်ဘက် ညာဘက် ဆိုပြီး နှစ်ပိုင်းခွဲမယ်။ ဘယ်ဖက်က သူ့ဘာသာနဂိုစီထားတဲ့ data တွေ နဲ့ ညာဖက်ကတော့ မစီရသေးတဲ့ data တွေ။ ညာဖက်က မစီရသေးတဲ့ data တစ်ခုချင်းစီကို နဂိုစီထားတဲ့ ဘက်ဖက်ခြမ်းထဲကို ထည့်မယ်။ 

- algorithm
  1. array ကို နှစ်ပိုင်းခွဲတဲ့ပုံစံဖြင့် ကြည့်မယ်။ ဘယ်ဖက်က နဂိုစီထားတဲ့ data တွေ နဲ့ ညာဖက်က မစီရသေးတဲ့ data တွေ
  2. ညာဖက်က ပထမဆုံး data ကို မှတ်မယ်
  3. အဲ့ data ကို ဘယ်ဖက်ထဲကို သူ့နေရာမှန်ရောက်အောင် ပို့မယ်
  4. ညာဖက်က data တွေ မကုန်မချင်း အဆင့် ii နဲ့ iii ကို ထပ်ခါတလဲလဲ လုပ်မယ်
  
  ```java
  int[] arr = {6, 2, 9, 10, 1};
  for (int out = 1; out < array.length; out++) {
      long temp = array[out];
      int in = out;
      while (in > 0 && array[in - 1] >= temp) {
          array[in] = array[in - 1];
          --in;
  }
     array[in] = temp;
  }
  ```

# Stack & Queue
### Stack
Stack ဟာ abstract data type ဖြစ်တယ်။ Stack ဟာ Last-In-First-Out (LIFO) mechanism ဖြစ်တယ်။ ဆိုလိုချင်တာက Stack ထဲကို နောက်ဆုံးမှာ ဝင်တဲ့ data က အရင်ဦးဆုံး ပြန်ထွက်မယ့် data ဖြစ်တယ်။ Stack ထဲကို data ထည့်တာကို pushing လုပ်တယ်လို့ ခေါ်ပြီး အဲ့ data ကိုဘဲ stack ထဲက‌နေ ပြန်ဖယ်မယ်ဆိုရင် popping လုပ်တယ်လို့ ခေါ်ပါတယ် (LIFO mechanism ကြောင့် နောက်ဆုံး push data က အရင်ဦးဆုံး first pop data ဖြစ်မှာဘဲ)။ Stack ထဲမှာ နောက်ဆုံးဝင်သွားတဲ့ data ကို read လုပ်ရုံဘဲဆိုရင် peek လုပ်တယ်လို့ခေါ်တယ် (peek operation က stack ရဲ့ အပေါ်ဆုံးကကောင်ကိုဘဲ လုပ်ရမယ်)။ Stack ရဲ့ push and pop က runtime complexity က O(1) constant time ဖြစ်တယ်။

### Push Item On Top Of Stack With Array
```java
int[] stackArr = new int[size];
int top = -1;
stackArr[++top] = ထည့်မယ့် data;
```
### Pop Item From Top Of Stack
```java
in[] stackArr = {5, 8, 1};
return stackArr[top--];
```
### Peek Item On Top Of Stack
```java
int[] stackArr = {5, 8, 1};
rerurn stackArr[top];
```

### Queue
Queue ဟာလည်းဘဲ abstract data type ဖြစ်တယ်။ Queue က First-In-First-Out (FIFO) mechanism သုံးထားတယ်။ ဆိုလိုချင်တာက queue ထဲကို ပထမဦးဆုံးဝင်တဲ့ data က ပထမဦးဆုံး ပြန်ထွက်မှာ။ ဥပမာအနေနဲ့ကတော့ - Bank, Airlines, Movie Centre, etc... ဒီဟာတွေက queue ကို နှိုင်းယှဉ်တဲ့နေရာမှာ မြင်သာတဲ့အရာတွေဘဲ ဘာလို့လဲဆိုတော့ ရှေ့ဆုံးက လူတွေကဘဲ အရင်ဦးဆုံး လုပ်ဆောင်ကြရလို့။ Queue ထဲက data တွေကို ညွှန်းဆိုဖို့အတွက် အဓိကအမှတ်အသားနှစ်ခုလိုတယ် (ဆိုလိုချင်တာက variables နှစ်ခု - front နဲ့ rear ဆိုပြီး နာမည်ကတော့ ကိုယ်ကြိုက်တာပေး)။ ဒီ variables နှစ်ခုရဲ့ position တွေက တစ်သမတ်တည်းရှိမနေပါ။ Queue ထဲကို data ထည့်ရင် rear position ကို တိုးတိုးသွားမယ်။ Queue ထဲက data ကို remove လုပ်ရင် front position ကိုလဲ တိုးတိုးသွားမယ်။ rear position က front position အောက်ရောက်နေရင် circular queue (ring buffer) လို့ ခေါ်တယ်။ ဒါကို broken sequence ဖြစ်တယ်လို့ ယူဆလို့ ရတယ်။ အလားတူဘဲ continuous sequence ကကြတော့ rear position က front position အထက်မှာ တည်ရှိတယ်။ 

### Insert Data to Queue with array
```java
int rear = -1;
int front = 0;
int[] queueArr = new int[5];
queueArr[++rear] = 2;
```
### Remove Data from Queue with array
```java
int temp = queueArr[front++];
```
### Only Read Data from Queue
```java
int temp = queueArr[front];
```

### Priority Queue
Priority queue မှာ data တွေက အစီအစဉ်တကျ စီစဉ်ထားတယ်။ Data တွေကို ascending or descending ကိုယ်ကြိုက်သလို စီစဉ်လို့ ရပါတယ်။ Priority queue ထဲကို data ထည့်ရင် အရင်ဦးဆုံး သင့်လျော်တဲ့နေရာလိုက်ရှာမယ်။ နေရာတွေ့တာနဲ့ အဲ့နေရာက data က စပြီး shift upward လုပ်မယ်။ ဆိုလိုချင်တာက နဂိုရှိပြီးသား dataကို တစ်ခန်းတိုးပြီး ပြန်ထည့်သွားမယ်။ ပြီးရင် data အသစ်ကို queue ထဲ ထည့်မယ်။ နဂိုရှိပြီးသား element အရေအတွက်ကို ၁ ပေါင်းသွားမယ်။ Priority queue ထဲက data ကို remove ချင်ရင် queue ထဲက အပေါ်ဆုံးကောင်ကိုဘဲ remove မယ်။ ပြီးရင် နဂိုရှိပြီးသား element အရေအတွက်ကို ၁ နှုတ်သွားမယ်။ Priority queue ရဲ့ efficiency က insert အတွက် O(N) , remove အတွက် O(1).

### Insert into Priority Queue by array implementation
- Algorithm
  1. PQ ထဲမှာ အရင်ဆုံး data တွေ ရှိမရှိ အရင်စစ်မယ်, မရှိရင် data အသစ်ကို PQ ထဲ တန်းထည့်မယ်။
  2. data တွေ ရှိခဲ့ရင်, new data နဲ့ PQ ထဲ အရင်ရှိပြီးသား data တွေ နဲ့ နှိုင်းယှဉ်ပြီး new data အတွက် သင့်လျော်သောနေရာ လိုက်ရှာမယ်။
  3. နေရာတွေ့ပြီဆိုရင် data ထည့်မယ်။
  4. number of elements ကို တစ်တိုးသွားမယ်။
  5. runtime complexity O(N)
  ```java
  int[] pq = new int[10];
  int nElems = 0;
  int i;
  if (nElems == 0) {
      pq[nElems++] = new data;
  } else {
      for (i = nElems - 1; i >= 0; i--) {
          if (new data > pq[i]) {
              pq[i + 1] = pq[i];
          } else {
              break;
          }
      }
      pq[i + 1] = new data;
      nElems++;
  }
  ```
### Remove data from Priority Queue
 - Algorithm
   1. PQ ထဲက အပေါ်ဆုံးက data ကို remove မယ်။
   2. Number of elements ကို တစ်လျှော့မယ်။
   3. runtime complexity O(1)
   ```java
   pq[nElems--];
   ```
### Only read data on the top of PQ
- Algorithm
  1. PQ ထဲက အပေါ်ဆုံးက data ကို read မယ်။
  2. runtime complexity O(1)
  ```java
  pq[nElems - 1];
  ```
