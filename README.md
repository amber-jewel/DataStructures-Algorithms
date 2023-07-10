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




