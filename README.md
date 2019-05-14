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
Func         |Time 1 (N/S)   | Time 2 (N/S)  | Time 3 (N/S) | Time 4 (N/S)    
------------ |  ------------ | ------------- | ------------ | ------------- |
| triTree.hasWord("b")       | 26900 | 23300 | 43500 | 24000
| triTree.wordCount("b")     | 19700      |20100| 13100 | 26500
| triTree.hasWord("babblin") | 25800      |33500| 24500| 22200
| triTree.hasWord("babbling")| 28800 |18800      |64000| 27500
| triTree.wordCountList()    | 58000000| 106000000|73000000|84000000
| triTree.wordCountList("ab")| 50000000| 31000000| 29000000|53000000