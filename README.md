# Assignment 5 - Text Analysis Using Tries
Group: Konstanten1


Func         | Output
------------ | -------------
| triTree.hasWord("b")      | true |
| triTree.wordCount("b")      | 15      |
| triTree.hasWord("babblin") | false      |
| triTree.hasWord("babbling") | true      |
| triTree.wordCountList() | [14668x a, 96x aaron, 1x aarons, 1x abaissiez, 4x abandon, 6x abandond, 2x abandoned, 2x abase, 1x abashd, 14x abate, 3x abated, 3x abatement, 1x abatements, ... ]      | 
| triTree.wordCountList("ab") | [1x abaissiez, 4x abandon, 6x abandond, 2x abandoned, 2x abase, 1x abashd, 14x abate, 3x abated, 3x abatement, 1x abatements, 1x abates, 1x abatfowling, ... ]      |


### Function times with 100% of Shakespeare text
Func         |Time 1 (N/S)   | Time 2 (N/S)  | Time 3 (N/S) | Time 4 (N/S)  | Average (N/S)  
------------ |  ------------ | ------------- | ------------ | ------------- | -------------
| triTree.hasWord("b")       | 26900 | 23300 | 43500 | 24000| 29425
| triTree.wordCount("b")     | 19700      |20100| 13100 | 26500 | 19850 
| triTree.hasWord("babblin") | 25800      |33500| 24500| 22200| 26500
| triTree.hasWord("babbling")| 28800 |18800      |64000| 27500| 34775
| triTree.wordCountList()    | 58000000| 106000000|73000000|84000000|80250000 
| triTree.wordCountList("ab")| 50000000| 31000000| 29000000|53000000|40750000‬


### Function times with 50% of Shakespeare text
Func         |Time 1 (N/S)   | Time 2 (N/S)  | Time 3 (N/S) | Time 4 (N/S) | Average (N/S)   
------------ |  ------------ | ------------- | ------------ | ------------- | -------------
| triTree.hasWord("b")       | 21800 | 22500 | 18800 | 18100 | 20300
| triTree.wordCount("b")     | 25500      |22900| 13800 | 22900 | 21275
| triTree.hasWord("babblin") | 73900      |62100| 340400| 73100 | 137375
| triTree.hasWord("babbling")| 47300 |60900      |44900| 111400 | 66125
| triTree.wordCountList()    | 123539800| 87923100|94952200|71485100 | 94475050
| triTree.wordCountList("ab")| 36639300| 56838400| 86096400|37420300 | 54248600


### Function times with 25% of Shakespeare text
Func         |Time 1 (N/S)   | Time 2 (N/S)  | Time 3 (N/S) | Time 4 (N/S)|  Average (N/S) |   
------------ |  ------------ | ------------- | ------------ | ------------- | -------------
| triTree.hasWord("b")       | 16900 | 19700 | 24100 | 28200 | 22225
| triTree.wordCount("b")     | 18600      |20700| 22400 | 13300 | 18750
| triTree.hasWord("babblin") | 56200      |79700| 66700| 102200 | 76200
| triTree.hasWord("babbling")| 102400 |70900      |80900| 69000 | 80800
| triTree.wordCountList()    | 70636000| 61404500|63570500|114899000 | 77627500
| triTree.wordCountList("ab")| 39584300| 52022400| 70045000|37084600 | 49684075