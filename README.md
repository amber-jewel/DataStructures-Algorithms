# DataStructures-Algorithms
***
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
intArr သည် integer data type တွေဘဲ ရှိတဲ့ integer တန်ဖိုးတွေဘဲ လက်ခံနိုင်တယ်။ strArr သည် string data type တွေဘဲရှိတဲ့ string တန်ဖိုးတွေဘဲ လက်ခံနိုင်တယ်။
```


Array ရဲ့ အားနည်းချက်ကတော့ fixed size ဖြစ်တယ်။ သူတို့ကို initialize လုပ်တဲ့ အချိန် နဲ့ new operator သုံးတဲ့ အချိန်က စပြီး သူတို့ရဲ့ array အခန်းတွေသည် ထပ်တိုး၍ မရတော့ပါ။ အားသာချက်ကတော့ array အခန်းတွေရဲ့ (index) နံပါတ်ကိုသိရင် သူတို့ရဲ့ (operation) လုပ်ဆောင်ချက်တွေသည် အရမ်းကို မြန်ပါတယ်။



(Unodered array) ကြီးစဉ်ငယ်လိုက် (ascending) or ငယ်စဉ်ကြီးလိုက် (descending) စီမထားသော array ထဲကို တန်ဖိုးထည့်ရင် (insert) အရမ်းမြန်ပါတယ်။ Array ရဲ့ နောက်လွတ်တဲ့အခန်းတွေထဲကို တိုးတိုးပြီး တန်ဖိုးထည့်သွားတဲ့ အတွက်ကြောင့် ဖြစ်ပါတယ်။ ဒါကြောင့် runtime complexity အရ ကြည့်ရင် O(1) constant time ဖြစ်ပါတယ်။
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
  for (i = 0, i < array.length; i++) {
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


Array အခန်း‌တွေထဲက တန်ဖိုးကို ဖျက်ချင်ရင် (delete operation) သူ့ရဲ့ လုပ်ဆောင်ချက်သည် runtime complexity အရ ကြည့်ရင် O(N) ဖြစ်ပါတယ်။ 
- delete algorithm
   - အရင်ဆုံး ဖျက်မယ့်တန်ဖိုးရဲ့ array အခန်းတိုင်းကို လိုက်ရှာတယ်။
  ```java
  int i;
  for (i = 0; i < array.length; i++) {
    if (array[i] == ဖျက်မယ့် တန်ဖိုး) {
      {
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
