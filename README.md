# Project #5 - Text Analysis Using Tries
Christian Engelberth Olsen, Sean Altoft & Benjamin Schultz Larsen

![](https://github.com/benjaco-edu/dsalg-tries/blob/master/img/header.png?raw=true)

_Sections_

[Intro](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#intro)

[What is tries](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#what-is-tries)

[Real life Context and uses](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#real-life-context-and-uses)

[Code](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#code)

[Our performance results](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#our-performance-results)

[General performance](https://github.com/benjaco-edu/dsalg-tries/blob/master/README.md#general-performance)

## Intro

We’ve opted to write a report on Text Mining and how tries can be used for sorting big data, in regards to the algorithm topic of tries.

As for our data to be handled by our solution, we’ll be using the complete works of Shakespeare.

The goal of the assignment is that we want to be able to get a list of words, how many times a word occurred, as well as get the list for only the words starting in a specific way.

Our alphabet for this is going to be a-z and ‘ for the Shakespeare dataset, but the algorithm should be able to handle any presented alphabet or text without modifying the class.

## What is tries

![](https://github.com/benjaco-edu/dsalg-tries/blob/master/img/tree.png?raw=true)

Trie (also known as digital tree, radix tree or prefix tree) is a tree data structure where each leg in a three represent a letter in a word, and a character in a word has its own level followed by each other. It is the reason it is fast to lookup a word in the data structure (follow the letter) always takes n time where n is the number of characters in the word there is being looked up.

The word is only found if the last node leads to another note where a special flag is set, a flag who says that the word has ended. If this flag wasn't a part of the algorithm, the word “bo” would be recognized as a word in a structure where only the word “boat” has been added.

## Real life Context and uses

There is (at least) to categories of uses for tries, statiscal speedup, and uses in applications.

### Statistical

If you have a large amount of text, it can be useful to load it into a trie to be able to quickly get information about how many times a specific word have been found in the text without going through all of the words. 

Or it is possible to get a list of words starting with a chosen prefix to see with parts of the alphabet there is popular as starting sequences.

### Applications

Tris can be used in all sort of writing aid, for predicting the next letter in the sentence/word. Ex. search-engine, in car gps applications, orthographic corrector or as part of a phones keyboard.

Tries are super fast for locking up the possible next letters, it can be done in constant time (it the tree it navigated while typing), the legs of a given node can be used for proposals of the next character.


## Code
The code for our example with tries used for counting words in the complete works of Shakespeare can be found in the `src` folder,


## Our performance results

We timed our functions with 3 different partitions of the shakespeare data set (100%, 50% and 25% of the data). The timing calculated as a average of 5 runs pr. function pr. data size. The results showed that no matter how big the dataset where, it took roughly the same time to executed the given function.

### Word count list

![](https://github.com/benjaco-edu/dsalg-tries/blob/master/img/wordcountlist.png?raw=true)

We would have expected the time for tree traversal to grow as there were added more words to the structure. But it didn’t, we world guess it is because the cpu is busting op and gives us unreliable timing.

### Word count

![](https://github.com/benjaco-edu/dsalg-tries/blob/master/img/wordcount.png?raw=true)

As the collections grows, it takes the same amount of time to get the word count, exactly as expected. 

### Has word

![](https://github.com/benjaco-edu/dsalg-tries/blob/master/img/hasword.png?raw=true)

As the collections grows, it takes the same amount of time to found out if a word is in the collection, exactly as expected.

## General performance

Using a trie instead of a hash table for word check has a better worst case performance because of hash collisions, tries has nothing of that.

Some data can however be a lot worse for a trie than a hash table, that is when the data is sparse and do not have a lot (of the start) in common, that can ex. Be floating numbers where you can walk out of a long and lonely path only to find your only little home alone in the wilderness.

## _Links and Literature_

https://www.topcoder.com/community/competitive-programming/tutorials/using-tries/

https://www.youtube.com/watch?v=zIjfhVPRZCg

https://medium.com/basecs/trying-to-understand-tries-3ec6bede0014

https://en.wikipedia.org/wiki/Trie

https://algs4.cs.princeton.edu/52trie/

https://www.hackerearth.com/practice/data-structures/advanced-data-structures/trie-keyword-tree/tutorial/

https://stackoverflow.com/questions/17891442/what-is-the-best-worst-average-case-big-o-runtime-of-a-trie-data-structure 



