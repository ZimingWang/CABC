## phone
1. 一开始问了很多暑假实习的内容，coding题目是一个矩阵里某些位置有墙，给一个出发点及目的地，求最短距离。 follwup是现在墙可以打破，没打破一个cost为1，求cost最小的路线。
2. detect cycle in directed graph 

		interface:
		class snap {
		   vector<snap*> next;
		   bool hasCycle();
		
		}
3. Bigint实现加法。题目简单，最好代码一遍过

		String add(String s1, String s2){
		}

4. 给一个二维数组，对角线打印

		1 2 3 4
		5 6 7 8
		9 10 11 12

	打印出

		1
		2 5
		3 6 9
		4 7 10
		8 11
		12


5. 给定字符串A，B， 判断A中是否存在子串是B的anagram
6. （1）用array实现arraylist 
7. （2）写一个level order traversal
8. 给你一个integer set和一个target,找出set用所有integer和能组成target的， 数字可以重复，排列可以不一样，比如set 是 1 3 5，target 是5, 那么需要输出 3 1 1， 1 3 1， 1 1 3，
是Leetcode上的变种，想了一下用一个dfs搞定。follow up是数字不重复怎么办，其实就是每次取一个数后将他从set中移除，回朔时在加上去。
9. level order travesal, 要求不要用recursive, 用了bfs。
10. 1. Implement a BigInt class，Implement the multiply method 
11. 2. LeetCode 原题 Binary Tree Vertical Order Traversal
12. 给你一些interviews 的起始时间和终止时间， 问如何安排interview用的meeting room的数量最短。

	就是LC meeing room II 的变形。 要输出最后如何安排

	先按照起始时间排序。 然后建一个heap， 把终止时间依次加进去。 每次加一个新的回忆， 访问heap的根来看是否有可以用的meeting room
没有就在分配一个。有的话就pop 出来复用这个room

	最后跑了几个test case.小哥人不错， 一直给建议说变量名要好好起。。。面了30 分钟左右就结束了。一天了还没消息。。。。。感觉已跪， 求给个onsite的机会， 二面也行。。。。.

13. 第一轮：meeting room
输入时很多对开始时间和结束时间，比如
1:00 ~ 2:00
14:00 ~ 16:00
然后问哪些时间段这个room是被占用的

	第二轮：big number add
	就是两个很大的数相加，要考虑小数. from: 1point3acres.com/bbs 

	面试我的人都很好，一直都在看我写代码，时不时的还帮我一下，都很友好。

14. 给一串log（function, timestamp，act）, 在single thread的情况下输出各个function执行的时间段
15. valid BST 两种写法
16. 给一个List 实现iterator, 支持next(),delete(),hasNext() 
17. find min in a sorted array稍微变了下形 
18. 1. search in rotated array 2. min stack
19. 实现ArrayList。CodePair写的，还要自己写test case。。。 
20. 一个string, 有空格，需要reverse string中所有的word follow up： 一个char arr， 把里面的词都reverse了 
21. 然后问如果给snapchat加一个feature要加什么 coding: construct binary tree from inorder and preorder 要考虑输入invalid的情况 
22. 给定一个全是正整数的array， 和一个targe值。 你可以取任意数目的elements from the array，允许有重复，然后使得这些elements的和等于target 问一共多少种solutions？ 

	需要注意的是：只要排列不一样就视为不同的solution， 如 {1,2} 和 {2,1}算两个solutions,而不是一个。 
	
		example： 
		array = {1,2,3}， 
		target = 4 
		solutions: 
		1. {1,1,1,1} 
		2. {1,1,2} 
		3. {1,2,1} 
		4. {2,1,1} 
		5. {1,3} 
		6. {3,1} 
		7. {2,2} 
		8. Therefore, return 7. 
	
	最开始并没有说这个array全是正数，需要你提问，并且去确认。这个时候面试官会问你如果包含非正数， 有没有algorithm能解决这个问题。这些楼主都没有问题。 
	
	很明显要用Dynamic Programming去解。楼主一看时间不多了，来不及多想，凭直觉就上了，写了个看似正确其实是错误的解法。 用了2D array。 因为楼主把红色那句给忽视掉了，楼主的解法是针对solutions里不包含duplicate的解法，这样一来其实题目变得更难。。。面试结束之 后才发现解法本身就大错特错了，而面试的时候面试官 也没发现楼主的解法本质上就不对，只是说“看起来没问题，应该是初始的值不对”。有可能是他觉得没时间了， 没有让我去debug我自己的代码。然后他就给我大致说了他自己的解法，用1D array。然后让我把他的解法code出来，楼主很快搞定， 基本一遍就bugfree了。接着问了下他的方法的时间复杂度，和我的方法的时间复杂度。然后就是我提问的环节。随便聊了几句就结束了。
	
23. Design

		// snapchatter
		// toggle(string username) 
		// getSelectedLlist() 
		// t: a getsl: a
		// t: a b c getSl: a b c
		// t: a b a c getSl: b c
		Design题我给的设计，用了doublelinkedlist，确保了toggle时的时间复		杂度为O(1)
		
24. Three Sum
25. 用前序和中序数组重建二叉树，LC 原题。
26. 开始做题目，是game of life。 我虽说准备过这个面经题，我还是很无耻的打开了leetcode。。。（然后还写出了一个bug。。尼玛）面试官只要求写了建新matrix的那种，然后讨论了一下space的问题，说用int表示board还是比较大的，然后我说用boolean就小了32倍，然后提了一下wiki上面的方法，如果board很大可以用一个set只记录live的点，这样更加省。然后就完了，继续聊了一下他们的公司就结束了，总体来说还是比较愉快的。希望能move forward吧。 

	在谈到Ad的时候问我是否了解**Snapchat Geofilter的广告策略**，我当时蒙了，本来做了功课好像看过他们推出了广告Geofilter，但是随口答了一个on-demond geofilter。
	
	Game of Life，其实挺幸运的，因为面经上有，但是我coding好几个bug，最后有一个bug没调出来，是行列坐标整反了，他说思路可以，我算你对了，然后follow up，真是悔恨没仔细想这个问题：首先问时间空间能不能省，我就说可以存活着的pair<x,y>，然后他们怎么判断下一轮是死是活？我说check live的邻居，然后周围死的也check一下是不是活了，他又问如果board无限大怎么办，但是就后悔自己没好好想，最后也没答出来

27. 一个是计算combinations. 是理论上的计算，计算有多少种组合方式。 大概类似word break，比如#Ilovenyc 有多少种分解方式，此时先不考虑字典。 
28. 一个是 word break 2，给个字典，如何break Ilovenyc 问了时间复杂度，worst case是什么时候，为什么solution会比brute force search好，大概说了一下怎么剪枝。 比如word：aaaaa dict= {a, aa, aaa, aaaa, aaaaa}. 
29. 上来惯例问为什么来snapchat，然后就是题给一个n+1元素的数组，元素在范围内，至少有一个重复，让你找其中任意一个duplicate 我马上说了hashset和元素变负的两种方法，他没让coding， followup如果数组只读，而且只用constant space的方法。暴力法可以， 然后followup 继续提高时间效率，二分法缩小range 这时候才给code。 以后一个问题的每一个解法都得看看，中间二分那里卡了一会儿，结果导致时间还就不少白人小哥就不再问了，想来也是被放弃了。。。

	word ladder 2
30. 第一题是valid palindrome。判断是不是合法的palindrome。第二题说给一个string,可以add/delete/change，还可以combine几种来使他变为合法的palindrome。比如：ebabc可以先删了中间的a再把c改成e。问最少需要几步。
31. 题目是设计一个类来存放一个无向图的边和点，我大概用的hashset来存一个点的邻居这样，follow up是问图有多满的情况下用bitmap更加合适。要写main函数和简单testcase跑一下。我是一开始有点编译错误但是编译通过之后结果是对的。感觉只要是能跑通应该就没什么问题。面试小哥是camera组的。 
32. word abbreviation 

	题意：  我们通常压缩的时候会把  interval 压缩成 i8l, 即首尾字母加这个word的长度。 
	1. 但是研究人员发现， internal 和 interval  如果按上面那种方法就会模糊不清，因为都会压缩成 i8l. 于是研究人员就想到一个办法，就是加长它们的prefix, 直到遇到它们第一个不同的字母，
	比如：internal 和 interval 会压缩成： intern8l, interv8l.
	          intension 和 intrusion  会变成： inte9n, intr9n

	2. 当 压缩完后， 发现压缩后的长度 大于等于 原始长度时， 保留原始长度。比如 intern8l  长度也是 8， 那么就 保留原始： internal.
	3. 
	input: 是一个 string
	
		like
		god  
		internal 
		me 
		internet 
		interval 
		intension 
		face 
		intrusion
		
		output: 
		l2e 
		god 
		internal 
		me 
		i8t 
		interval 
		inte9n 
		f2e 
		intr9n
	
	[cankao](http://www.1point3acres.com/bbs/thread-162312-4-1.html)	
		
34. 给一个int的matrix，里面只有0和1，matrix表示i和j是朋友，如果是0表示两人不是朋友，是朋友的分成一个组，问能分几组。比如1和2是朋友，3和他们都不是朋友，那么就是2组，return 2就可以。自己写test自己测
35. 第一题 ：给一个数组，返回左边之和等于右边之和的那个index， 没有就返回-1，比如{1,2,3,2,1}， 返回2，写了好多testcase，各种情况。。。。10分钟完事 ]

	第二题 ：给了一个Person class， 有score和nextSnap两个属性，每个Person有一个朋友的list，也就是nextSnap，输入是（Person， maxStep）， 在maxStep步数以内算max score，注意的是下一个Friend可能会指向上一个Person，要注意回溯的问题。。。10分钟写好了， 输出一直不对。。从recursive改到一个乱七八糟的方法，还是不对，然后一行一行的肉眼debug，感觉没问题啊，最后发现她给的构造器有问题，score没赋值。。。。。。我去。。。。。过分了啊。。。。最后也没有follow up，直接问有什么问题么，我问你们现在做什么，下一步有什么计划。。韩国MM说是private company，不能告诉你。。。好吧，I am good， take care。。。。面经都看了，准备的也挺充分，总是一些各种各样的原因，继续努力吧。。。大家还有5月份毕业，没拿到offer的么。。 
	
36. 面经题 basic calculator +-*/和数字 都是一位 没有空格 输入都是valid 所以不用考虑corner case 

	follow up是 数字变成多位 

	然后再followup加上空格 

	follow up: 负数


37. 发个面经回报地里的各位。楼主是找人内推的，大神晚上9点多推完我HR夜里2点就发邮件约电面了，这个速度简直碉堡了。. visit 1point3acres.com for more.
面试时间是上午11点，面试官是个亲切的白人小哥。上来自我介绍一下，然后聊了聊家常，得知小哥原来也是在湾区工作。之后小哥问为什么想来Snapchat，楼主说我可是你们的用户，特别喜欢里面的Stories里面的Discover类别。然后小哥问楼主最喜欢哪一个频道，楼主说Tastemade，小哥说我也喜欢啊，特别喜欢几个妹子做饭。之后就开始聊楼主的工作，问了目前干什么，工作中遇到过什么挑战。楼主说自己是做网站的，前端后端都搞。小哥问楼主喜欢什么技术，楼主说AngularJS，这时候小哥又共鸣了，貌似他也是搞网页了，然后又聊了一下。

	这些有的没的说完了，然后就是做题。这里还一个小插曲，小哥问我语言是不是用JS，楼主说并不我要用Java。小哥有点愣住了，说Java我不是很熟，估计看到我web的背景所以给我安排了一个用JS的面试官。
问题一个走迷宫问题。给了一个矩阵，"1"代表起点，位于左上角；"9"代表重点，位于右下角；"0"代表通路，"5"代表墙。. 
矩阵长得是这样

		[
		  [1, 5, 5, 5, 5, 0],
		  [0, 5, 0, 5, 5, 0], 
		  [0, 5, 0, 0, 0, 0],
		  [0, 5, 0, 0, 5, 0],
		  [0, 0, 0, 5, 0, 9]
		]
设计一个算法，看看这个迷宫能不能从起点走到重点。

	楼主因为面试经验少，上来突然慌神了，完全不知道从哪里下手，感觉这是一个DP的问但是又不像。楼主突然跟面试官说这个问题用DFS解决，然后小哥说好，那就写代码吧。Snapchat允许查各种资料，Google Hangout也不需要Share Screen，如果运气好貌似查到原题就可以一步登天了，不过楼主并没有去查原题。自己在草稿纸画了画走迷宫的方法，然后确定这个就是DFS问题，而且准备使用递归来实现。之后楼主开始写代码，刚开始跟小哥聊一下思路，小哥没有说话，就说我这边都看得，你自己写就好了，估计小哥是跟楼主一样安静工作的人。代码写完了就是运行，这个时候问题就来了。楼主一直做web而且用leetcode刷题不用自己搭环境，对于Java的运行不是很清楚了，包括各种头文件的引用。由于小哥也不懂Java，楼主只能自己来找错。楼主急中生智打开Eclipse查以前写的代码，发现自己"static"和"length"拼错了，实在是不应该。改了这些拼写错误以后，代码就可以运行了而且结果也正确。然后小哥说能不能打印出来路径，楼主便加入了打印的代码并且输出路径数组。小哥又把迷宫改了改，运行几次说没问题了。. 

	本以为还有一道题，结果小哥说就这样问我还有没有什么问题。楼主问了一下选组和Training的问题，小哥简单介绍了一下。然后楼主说没问题了，小哥说你真的没问题了么，意思再跟我聊聊啊。幸好楼主之前问过一个朋友是Snapchat的资深用户，她说新消息来的时候不知道是照片还是视频，有时候上班的时候想看结果发现是视频，搞得非常尴尬。楼主把这个问题跟小哥说了，小哥说消息之前会有红框或者紫框，一个说明是照片另一个说明是视频，楼主说我不知道啊，小哥说没事这个设计也并不是很清楚，会作为用户反馈的。之后就是小哥说楼主表现还可以，HR会在一周内给消息，简单告别就挂了。面试的第二天下午楼主就收到了HR的邮件约onsite了。


	总结一下，Snapchat面试我的问题并不难，楼主感觉自己发挥一般，能给onsite真的是运气不错。感觉面试的心态真的是太重要了，还是要多面才能更加从容。遇到问题以后千万不能慌，如果想不出来算法可以现在纸上画一画，看看自己如何手工实现解法，然后把自己变成机器来思考，这样就把这个解法转换成算了。千万不要把面试当做是一件特别严肃的事情，做题并不是考试，把解题当做一个解决问题的过程就可以了。


37. 第一道题是print 2d array diagonally top-down, e.g.. From 1point 3acres bbs
[[1,2,3,4], [5,6,7,8], [9,10,11,12]] => 1, 2 5, 3 6 9, 4 7 10, 8 11, 12. from: 1point3acres.com/bbs 
题外话：这道题其实隐隐约约面经里我记得有人写过zigzag打印应该就是这个。。楼主地里电面面经看得到的都自己写了，准备了了洋洋洒洒近两千行的面经代码，唯独那道当时觉得年代久而且觉得现场也能秒就没写。。就那一道。。。

	然后当时心情就坏了。。开始扣着写吧 一开始竟然还开了一个大小相同的数组存访问过没有，空间复杂度O(n)的。。。果断写完等着被优化，冥想半天从上边和右边开始向左下输出就好了，no space。. 
	
	第二道，先问知不知道anagram，两个string怎么判断是不是anagram，楼主迅速说了开128或者256空间那个，以为要问原题了。。。结果 并不是。。
问题是给一个source string和pattern string，求有没有任意一个source string的substring和pattern string互为anagram，返回true or false。让用O(n)。。当时觉得有点蒙，我擦怎么O(n)啊。。光比较就要n的复杂度了何况还要slice window。。反正是后来苦思冥想半天总算是想到了。。楼主解法是用另外一个diff map存不对应关系，key是frequency不同的characters，value是对应的difference，source多value正，pattern为负，然后slice window，没slice一位，更新diff表，每有一个value变空了从map中删除那个entry，diff map为空则说明找到了一个匹配的window返回true。。。此法时间复杂即O(n)。。空间O(n)

38. * 你觉得snapchat 怎么样，你有用么？ 你喜欢什么功能
   doge脸，说阅后即焚好酷啊，我和朋友之间发污污的东西，都用的它（其实前天才专上软件...），各种stories功能好欢乐啊，还教做饭，喜欢的不行.
	* 说说你的经历吧，我没你的简历在手上（怎么写在面试都这样， 周一面Google也是），然后就扯了我的经历，小哥表示你做的东西好有趣啊...

	开始编程，题目不难，不过刷了地里大半的电面面经以为会有重复的碰到，结果是新的，还是有点紧张，大致意思就是输入一串的double表示的sort好的timestamps, 然后一个double的windowSize, 请你找出一个起始时间区域，使得以这个范围的起始时间开始的[x, x + windowSize] 内有最多的timestamp; 
	
   1. 我先给了queue的思路，然后每次碰到新的timestamp, remove所有之前的点，remove的时候更新pre,  然后check现在queue的size, 返回最大sizes时对应的(pre, queue.head]就是answer.
   2. 码完之后说，你有没有更好的思路，不要用O (n)的extra space, 我说用two pointers, 然后又吭呲吭呲地写，小哥说你其中有个地方又问题，我看了半天没发现，提示说，你有没有觉得windowSize
可能是负数。。。负数。。。

	4. 你写几个unit test吧，我对java Unit test 不熟，然后愣了几愣，说我平常常做的就是给不同的输入，看输出的结果，小哥无奈。。
   ［求助大家，unit test  一般要怎么写啊，google了下，感觉好复杂］

39. 就是给了一个Person类，让实现打出这个Person的关系网中的所有朋友，Person有属性id, name和friendList, sample输出是这样子的：

	 	/* * Mike(1) {Mitch, Ryan} 
	 	* Mitch(2) {Mike} 
	 	* Ryan(3) {Mike, Lila} 
	 	* Lila(4) {Ryan} 
	 	* Mike.printFriendsGraph() : Mitch, Ryan, Lila */ 

40. 题目是设计一个类来存放一个无向图的边和点，我大概用的hashset来存一个点的邻居这样，follow up是问图有多满的情况下用bitmap更加合适。要写main函数和简单testcase跑一下。我是一开始有点编译错误但是编译通过之后结果是对的。感觉只要是能跑通应该就没什么问题。面试小哥是camera组的。

41. given a number n, how many ways you can create a BST, for eg for n=2, o/p = 2,n = 3 , o/p is 5.  
42. Implement LRU.  
43. Determine whether a graph is bipartite  
44. 刚面完 是国人大哥 题目 一个板子 一个起点 一个终点 移动按照中国象棋的马 要求输出一条最短移动路径 
45. 第一提，给你你个数组，要你返回数组的最小值的平方是否小于最大值。题目很简单，需要注意的就是最小值的平方可能越界。 佛罗阿噗：如果这个数组不满足第一题中的条件，然后允许你执行“删除数组的第一个元素”的操作，让你返回要执行多少次，也就是删除多少个数组前面的元素后才能满足第一题中的条件。如果删完都不满足，返回-1；这一题小哥反复提示才想出来一个O（n）的做法，然后今天看还有个小bug，哎。。 接着佛罗阿噗：如果可以每次都可以选择删除第一个或者最后一个，问最少要删掉几次。。


--
## Onsite
面了4轮，加中间吃饭一轮，都不是很难，只有第二轮那个不是太懂，但是跟面试官沟通了之后类似quadtree的思想写了一个结果，他觉得OK。
snapchat感觉正在扩招，给的package也很大方，整个team很年轻很chill，无敌海景，大家可以多试试。虽然楼主已经拒了，但是祝snapchat越来越好！

1

3 sum

Design: 然后问如果有一个web based的email app，打开的latency很高，应该怎么办，如何test哪个部分，如果Improve. Waral 
如果有准备过what happened after type an URL，因为没有太大问题，无非就是按照那个过程，DNS, proxy server, cache(这是重点)


2

closest point.

我们有一个data sets, 然后有一个graph是类似10 * 10的grid,写一个function, input是一个query point，求出离它最近的点
brute force是每个点distance求一下，后来改成了类似quad tree分成四个area的做法.

3.

snap with wights, snap has next snaps list

input是start snap, max steps求出一个max total weights

BFS的方法做就可以.

follow up: start snap是一个list怎么办

follow up: 如果每个snap都可以是start nap怎么办， memorization search

4.

1. valid bypart
bypart的意思就是一个图里，value只能是0或1，相邻的都是与自己不同的就是一个valid bypart

2.	buy and sell stock I..

都太简单的题了，聊天聊了半个小时……

--
第一轮，白人小哥白人shadow，project diving deep, coding题目是queue using stack, follow up 是多线程版本，最后让我自己实现mutex那些，自己写测试，问了我如何设计测试等等。

第二轮，东欧大叔，project diving deep, 题目是手机上的通讯录，每条记录只有(name, number)这种pair,有些记录名字重复，有些记录号码重复，让我返回一个list<list<Record>>，将所有记录按人分组。比较tricky的点在于(ABC,123), (ABC, 456), (BCD, 456)三条记录，第一条和第三条也属于同一个人。要求时间复杂度尽量小。

第三轮，美国小哥，how to test. why snapchat.
coding题目是XML parser，follow up是一开始我们假设xml是well-formatted,如果不是的话，比如有不成对出现的<p>或者</p>，怎么破

第四轮，中国小哥，project deep dive. coding 题目是有一条路，路两边可以想象为 y = 0 和y = 1两条直线。现在给你list of radar，每个雷达为(横坐标，纵坐标，辐射半径)。问你一辆车能否通过这条路。这轮一开始没见过有点懵逼，感谢小哥给了提示。

值得一提的是他们加onsite要求让在你自己带的电脑上写代码，自己写test测试，我写的时候旁边有个人看着还是有点紧张的。。比较值得一提的点还有，他们家面试的时候会有一张表，上面写着3年经验一下只考coding question，所以大家可以少准备点system design。以及，上面有些题目不是那么常规，我面的时候也不是那么行云流水的，但是好在面试经验比较多，写出的代码基本都bug free一次就跑过，感觉还是加分不少的。

感觉面试官人都非常好，非常有热情，加入snapchat的最多只有一年多，最少只有三个月，很多都是别的大公司跳过来的。当然我也问了很多大家都关心的问题，比如前一段时间估值下跌，面试官表示不用担心，公司内部的估值并没有下调，下跌跟之前twitter股价下跌有关，snapchat之前一直被投资者参照twitter受了一点影响（这锅甩的好）。有面试官提及最近有从T家跳过来的人，透露S的日活比T多一倍，业务还是发展很快的，虽然外界存在质疑，但是内部的数据其实是很漂亮的。面试官还跟我说最近年底了应该会有年报之类的出来，让我看一下再做决定，想来应该是有一定的自信吧。

面完当天就飞回了纽约，倒头就睡，睡醒了接到HR电话就给了offer，标准的package, 11K base, 10k signon, 32W的RSU。

比较坑爹的也是股票是1：2：3：4这么给的，最后决定接了。接了的原因主要有三：

他们家工程师目前还是不多，只有200多个，去了之后确实对自己锻炼很大，带我吃饭的中国小哥说他来的第一天就给他分配了task去改bug，几周之后就会正式做feature。
Snapchat国人很多，三哥很少，去食堂吃饭的时候感觉差不多一半都是国人了，舍友也去onsite过，四轮都是国人，回来真是赞不绝口。我自己之前在大公司实习过，真的觉得效率还在其次，遇到一个不靠谱的mentor或者manager真是B了狗了，还是喜欢关系相对简单的地方。
他家比较坑的点在于股票的vest方式，我自己恰好没那么在乎。寝室四个人除了我两个uber一个google，大家交流一下发现讲真的对于new grad创业公司还是大公司都不是什么发财的机会了，去比较一下new grad和有经验的包裹，简直不是一个数量级，感觉想发财是指望不上第一份工作了

--
1. word search, product of array except self. leetcode 原题. From 1point 3acres bbs
2. implement bloomfilter, construct, add, mightcontain, delete, extend(if near full, extend)
3. 两个人从1-N里面不重复地取数出来加在同一个sum上，第一个超过target的人赢，求先手是不是能赢。 写的暴力recursive
    repeated DNA sequences, leetcode 原题
4.  XML parser, build a map to represent XML given tokenizer.Next() -> (open,name), (inner,content), (close,name), 就是一个 tree transversal    given a string, return whether can use the character to construct target string, 裸hashmap


onsite题目都挺简单的，自己带电脑写，有些要求编译过样例有些写完就行了，附了当时写的[代码](file:///Users/zekun/code/snapchat_onsite.zip)

--
然后收到了onsite的邀请，时间就是昨天，那边的环境什么的就不多说了，相信大家在其他的帖子已经看到了。楼主我被约在了12：30，我以为是12：30就开始了，想想还得吃饭，所以11：30就到了。然后在大厅坐了1个小时。。。。。。中间也遇到其他来面试的人，和他们聊聊，都是面se的。一个小时之后，我被我的内推帅哥带去了食堂，然后吃了一点点点点饭，怕吃多了下午昏迷。
 
大概在1：15的时候，开始了我的第一轮面试。这一轮是一个美国人，反正听起来像是美国人。问了我第一个intern proj。出了个2Sum，3Sum，4Sum，稍微不一样的是，需要找出第一个pair，triplet。。。。第一个的定义随便你，可以是按pair里小的或者大的index取，比如按小的取[1,2,3,4]，target=5,那么返回[1，4]，因为1 < 2。基本都是瞬间给出答案。 就是4SUM的时候受到面试大哥的提示，才给出了O(n2)的解法

第二轮是一个abc或者中国人，口语屌炸。问了我第二个intern proj。 开始想出Bigint，我说已经在电面做过了。 然后他就另外出了一个找最大值的题。给一个数组[1,1,2,1]，然后用+ * （）三个操作求出这个数组的最大值，这个题返回6。 很简单，DP解决。我开始写了个用res[i][j] 表示的solution，然后写完代码，测了几个用例，都过了。然后他问如果数组里面有负数和0咋办呢。 我说维护两个表max[i][j] 和 min[i][j]。然后他很满意。我说其实还有复杂度更低的方法，可以用一位数组做。他说不用了，这个方法已经够好了，不要求写那么复杂。 然后面完还有10分钟，他问我有什么问题没有，我一听慌了，连时间都没有用完是不是不好，我就问他这个是不是没面好的征兆。他说不是不是，因为我已经很快给出solution，而且代码也没有问题，还给出了follow up的思路，就够了，说有时候时间没用完也是面的好的表现。 我听完心里放松了一些，然后和他唠了唠team之间的工作什么的，只是为了把时间耗完。

第三轮是一个长得挺帅的中东小哥，应该是吧，也可能是印度的。。。。不过没有印度口音。问了我第一个course proj。 然后一上来就出了一道twitter系统的设计，幸亏我之前准备过system design，而且在其他面经上也看到别人提到过这个，然后给他讲了讲各个方面的设计。 比如消息推送的机制，push和poll。还有怎么样用hybrid方法。 然后他笑了，说对对对，我们现在snapchat就是这么干的。这个题好像答得还挺好的。聊的也不错。 然后我以为就结束了，但是还有10分钟的时间。他就说我们来coding吧，请听题，“树上一只猴，地下七只猴。。。”，串了串了。。。然后让我coding一个单机的web 服务器的消息处理机制。 我先说如果是单机的话，就不用考虑scale的问题。说了好多乱七八糟的system design的问题，但是他不是这个意思。后来搞了两三分钟才讲清楚是要实现一个类。说当访问量大的时候，怎么handle request，我说线程池。 他说yes， that's what i want。 然后其实就是实现线程池类。我不知道是怎么实现的，自己想了一个方法。然后说了思路，但是还没把代码写完，第四个面试官就开始用木头桩子撞门，额，轻轻地敲门。然后中东小哥说再给5min，第四个面试官说ok。然后这个题关键的是要用到wait和notify方法以避免繁忙等待。 我说了思路，最后还是没有时间写代码了。弄完他问我有没有什么问题，我说我没有写完这个代码会不会有影响，他说不会，反正solution你已经知道了。然后说完握手扬长而去。留下一个华丽的身影。

搜push 和poll机制，然后到时候被问到了，记得考虑两种结合起来，也就是hybrid的思想。


第四轮，面试官进来了，他是director，进来就开始behavior question，我边答他边敲键盘，感觉超级忙得样子。然后我看他好像太忙，自己发起话题说我有好多snapchat改进的点子，还有一个new feature thought。 他说good，那就是他接下去要问得，让我说。我花了15min讲了这些东西，过程中他比之前要更投入了，还不时的记录我的点子。好像挺感兴趣的样子。说完之后，他说要不我们来个coding吧，我说 cao！ 好吧！。 然后问我知不知道non attacking queue problem，我问这是n皇后问题吗，他说是的，问我做过没有，我说以前写过。然后他说ok，给你一个n，我需要你把所有情况打印出来。我说好，这不就是n皇后吗。他说恩，你是第一个说什么什么什么的面试者。没听懂，我只是笑笑。应该是说我是第一个说这个题做了，还问他是不是确定要出这个题的人。 然后我用iteractive写了个DFS，然后把isvalid和print两个函数独立出来，让代码模块化和增加可读性。 写完一遍过， 他看了看输出，让我walk through代码，我就给他讲，怎么回溯，怎么迭代，感觉他反应不是特别快，我讲完代码结构，还一行一行的给他解释，他看完后说这个解法有意思。。。。。。。。然后让我输出按我这种解法出来8皇后的解的个数。 也就是92，我输出来，对了。 然后他就说有没有什么问题问他，问了个可不可以选team的问题，然后我就说没有问题了，因为我太他马累了。 他很惊讶说，ok，笑笑的跟我握手，带我到main building里面见了HR。 

HR问了我有么有其他offer deadline，其他面试，还问我如果给offer， snapchat会排在第几（我说至少第一吧）。。。。然后说offer只给一周时间考虑，明天就给你答复，我说我c ao这么杰宝快，他说恩，我们的pace很快的。我说好的，然后就回家了。
    
面试之前被内推我的帅哥提醒代码命名要规范，不要int i temp什么的，我写的时候特别注意，虽然有点不习惯，但还是避免了这个坏习惯。希望大家也能注意。

说今天给答复的，已经这个时候了（晚上7点）还没有任何回应，我觉得这t m也太不靠谱了，不是说好第二天给答复吗？然后我就写下了这篇帖子！ 然后跪求给offer，因为snapchat真的是我的dream company！
    
--

先被一个人带着去食堂吃了午饭，聊聊了mobile development，带我的是一个加拿大的intern。人挺nice，我感觉我好老＝ ＝。吃完饭就去面试，四轮，一轮一小时左右。自己带着自己的电脑，可以自己选择在白板上写或者在自己电脑的eclipse上写。那个房间的白板太小，我四轮都选择在我的ide上写的。

（1）一个有8年微软经验的中国人面的，感觉他是个神牛啊，anyway，先问我好多project的东西，然后我做过os的project，就详细问了问memory，heap什么的。这个半小时过去了，然后写code。让我写了个binary search，很快写出来了，然后就是一大堆的follow up。。。让我自己想test cases，然后怎么test code。。不知道他是不是bar raiser。

（2）一个刚入职半年的sde面我，上来让我做个自我介绍，然后让我做leetcode上面的一道题：给preorder和inorder，重建bst。好久没刷过这题了，当时想了想还是用递归做出来了。然后给他解释，自己写了test case，最后问了问复杂度。。

（3）一个白人小哥，很活泼，问了问实习和之前的项目和machine learning，因为我的android的项目里面用到了machine learning。然后写code。wiki一下amicable pair就知道了。给一个数n，返回所有amicable pair，要求pair中第一个数小于第二个数，然后问了问复杂度。

（4）最后一轮也是个美国人，他感冒了，有些萎靡不振，跟我说话显得很低迷，让我自我介绍之后就写code。在一个8*8的棋盘上给两个坐标和一个integer k，返回一共有多少种不同走法，走k步从一个坐标到另一个坐标。用dfs，然后问复杂度。然后follow up怎么降低复杂度。

最后出去的时候跟hr聊了聊，问了我都面过哪些公司了，然后有没有deadline，说这几天就会告诉我结果。然后说snapchat不会有offer extension，而且就给两周时间考虑。
以上给大家做参考，顺便攒下人品，保佑我拿到offer啊。。。也祝大家找工作顺利！

--

这个也是OCI之后的onsite。OCI什么问题记不清了。。反正好像是BFS就能解决的问题。office在Venice Beach，那环境。。相！当！好！走5分钟就到海边了。onsite当天早上我就去沙滩旁边散了个步，onsite结束之后在recruiter的见一下又去沙滩旁边散了个步，晚霞超美。。onsite当天是从中午开始先吃个午饭，食堂虽小但是很不错，同时感觉Snapchat的员工和Snapchat的CEO一样和Snapchat的产品一样，都比较wild。。可能也是和环境有关系吧，Venice Beach那边人际关系比较原始的感觉。下午大概是4个技术面，1个HR chat。下面是问题：

1. 给一个数组，判断里面是否有duplicate。扩展1，判断是否有相隔较近的duplicate。扩展2，判断是否有相隔较近的，作差不超过某个上限的数对。
2. 给一个dictionary，两个单词。求最短的以这两个单词为首尾的单词链，使得每两个相邻的单词都恰好有一个字母不同。这个是在电脑上写的，需要compile需要写test case。
3. 给手机的画图app写个屏幕旋转的method。同样问了许多design问题。
4. 设计一个比较简单的Google doc。同样是design向的问题。
HR chat就是简单聊一下，问问喜不喜欢Snapchat之类的问题。面完之后当晚说下周电话答复，目前还等结果中。

--

1. word ladder 1 和 返回一条路经 
2. xml parser
3. dulplicated nums 返回是否有重复数字 follow up 是否有重复数字相距小于k 和 如何解决网页打开慢 
4. steam nums 返回 median 

--

onsite很大部分时间是聊简历和behavior question 

1. 白人， 聊简历和背景 snapchat中的一个应用为背景，扯了很久，最后意思就是一段视频中有一些可以放广告的位置，长度不同，有一堆可以选的广告，长度也不同，问怎么放最多和最长的广告 
2. 国人，聊简历和背景 snapchat的一个应用，拍视频时可以对视频进行处理比如变形，加各种表情装饰等，问怎么实现这个系统，这轮不用coding，纯design， 这哥从头到尾一直板着脸都没怎么笑过，答得不如他意的时候就拿着手机让我玩那个app应用感受感受，看着自已头像心中一万头草泥马奔过，我这特么的是来面试的还是来玩应用的啊
3. 白人，聊简历和背景 实现一个buffer管理系统，不断的存入图片，图片大小不同，然后另一边不断的读出图片，类似于实现一个blocking queue, 但是要求底层实现，连list都不能用 
4. 不知道哪国人，看起来像亚裔， 继续聊简历和背景 给一个string abbcba 按字符出现的频率编码，b->1, a->01, c->001，输出编码后的串 snapchat discover/moment 的一个应用抽像出来的，怎么判断发monment所属在自己的圈子里，就是相当于给一个多边形，怎么快速找到一个点在不在多边形里 

不知道是因为我工作了几年，简历问得很细， 都是提前看了简历带着问题来问的，每个人都会问为什么想来snapchat，以及对snapchat的看法。最后都有10分钟左右问问题。 另外感觉比较重视test case, 电面要求编译通过并跑了基本所有可能testcase， onsite也要写testcase而且漏了会指出来 最后挂了，没给feedback，问了内推的朋友说可能我做的太底层了（EE背景），anyway, 只能move on了 

--

1. 有一个外国字典，里面的字母都不认识，随机抽出足够的单词，让你重构字母的顺序。拓扑排序解 
2. 有一个task stream with value，实现一个class with member function 可以求出过去10s 的平均值，最大值，最小值。每个task生成按时间顺序。注意window是时间10s，不是task个数。 queue/deque解 
3. 任意没有排序的数组，求第三小的数，求中值，求第k大的数
4. 安装程序 with dependecies，求出任一正确的安装顺序，follow up 求出安装顺序但是需要dependecies少的程序先安装

--

1. 半轮culture fit, 问我N-Queen见过没，我说见过，就出了一个bipartite graph的题。
2. Coding：题目是以Snapchat自己的feature的形式给出的，经过分析抽象出来就是一个图的题，图里的每一个节点都有一个score。给定一个节点，找到从这个节点出发，长度少于等于N的路径里面，Sum(Score)最大的那个路径，并且打印出来。解法用BFS就可以 
3. System design. (1) Sort large set of numbers (2) Design Snapchat Story feature 
4. 半轮Design，半轮coding. Design Snapchat Discover feature. Coding: 剩了没多少时间开始问我算法题。先问我见过BigInt这个题没，我说见过，但是没写过。于是就开始让我写，我写了没几行，面试官就说OK，知道了，你不用写了。换了一个题，给一堆(name, phone#)的记录，把属于同一人的记录group到一起打印出来。name一样的，phone一样的都属于都一个group。跟面试官讨论了一下如何用两个map解决的想法，然后时间就到了。这半轮的coding基本没写代码。 

--

第一轮的面试官是个国人小哥，长得还挺帅，上来先让我自己选了一个项目介绍了一下，就开始做题。第一个热身的很简单，leetcode上的Product except itself，大概给他讲了一下思路就开始写了，写代码的时候他没看我，好像还在改他自己的代码。写完了他说我的代码习惯很好，注释很清楚，然后就第二个题。第二个题还是leetcode上的一个变体，二维矩阵的有些格子有障碍，一个人从左上往右下走，只能走下和右两个方向，求到右下的最短距离。这个很典型的一个动态规划，所以很快就写完了。然后小哥发现，咋这么快又写完了，于是就follow up出了第三个题，把第二个题变了一下说这个人可以上下左右都走，还是找最短距离。这个用dp就做不了了，于是就换成了bfs来做，还写了一点小bug，没有维护visited的set，小哥最后给我指出来了，然后时间就到了。 

中午吃饭是推我的学长带我吃的，我一开始以为有吃饭的cultural fit面，然后看到学长推门进来简直要哭，以为运气咋这么好。结果学长说，我们公司都这样，如果有人推，就是推你的人带你吃饭。然后就跟着学长去吃饭了。事实证明我的运气是很好，吃饭的时候学长带着我跟另外几个小哥一起吃饭，其中一个也是我的直系学长，之前不认识，吃饭的时候就在聊。后来，事实证明他就是我的第二个面试官，吃完饭后等着看到他进来的是有一次简直想哭。 

所以第二轮就很轻松，学长进来直接跟我说中文，说没关系的，我们不聊了，直接做个题吧。于是就做了一个meeting room II的变体，不是求需要多少个room，而是要把schedule打出来，输出哪些meeting在同一个room里进行。很轻松就写完了，然后学长说，那我们变一下，现在只有一个room，然后每个meeting都有权重，要求在不冲突的情况下使得最后安排下来的权重和最大。但是真是困，这个题上来的时候有点懵，没太想清楚dp的动态转移，就大概说了一下。此时，就体现了校友的厉害，学长说，没关系，来我带你想，于是就一步一步的带着我把动态转移写出来了。本来我以为他会让我把代码写了，结果他说没关系你就再把整个思路给我串一下就好了，不用写了。所以第二轮其实还是有点难的，但是运气太好，学长也没有为难我。 

然后第三轮，是带shadow的面试，一来就是两个人，一个主面一个shadow，进来还是让我介绍项目，这个小哥很挑剔，很多技术的细节都让我解释了。shadow小哥一直在微笑不说话，还搞得我挺紧张。然后主面小哥开始出题了，说我们先写个简单的，的确是挺简单的，就是leetcode的那个找有多少个island的题。这一轮我是懵逼了，本来这个题很容易的bfs写的，但是当是我也不知道到底那根筋搭错了，说我给你写个UnionFind吧，小哥显然有点吃惊，说那你写吧。结果我也是的确就写出来了，然后小哥说那你说时间复杂度和空间复杂度是多少，于是我就说了。结果小哥说那UnionFind要额外的空间去记录，不太好，你现在就在原矩阵上走怎么做。当时还是有点二，一直纠结没太想清楚，然后小哥就说你想一想不是bfs就是dfs吧，然后突然就想通了说bfs。然后小哥说对对对，但是没时间写了，本来这一轮我给你准备了两个题，我没想到你第一题上来就写UnionFind，所以花了很多时间，第二题就算了。我当时就吓到了，以为我就跪了。但是shadow小哥给我吃了一剂定心丸，我问他你有没有什么feedback，他说我觉得很厉害，之前我也是学过UnionFind，但是自己没写过，今天看你bug free的一下子写出来，让我很震惊。所以感觉适度装逼也是可以的，其实我当时是真的没想到bfs。 

第四轮是一个白人小哥，上来就上了个厕所，然后就让我介绍了一下自己，介绍了一下自己对snapchat的印象，介绍了一下为什么要选择snapchat。然后就开始做题。第一个不是很难，就是给了两个text文档，去parse第一个文档中的每个字符，然后去判断能不能组成第二个text。很简单，用hashmap做就好了。小哥后来让我优化，说怎么样可以提前退出而不用走完第一篇text，我就给他写了一个flag，记录到第二个text结束的时候就直接退出，小哥很满意。然后就第二题，第二题也是之前地里有的，外星人词典，判断这个addressbook对不对就行了，其实就是一个有向图判断有没有环，或者用拓扑排序也可以做。写完跑了一下test case也都过了就结束了。 

完了之后跟recruiter聊了一下就让我回去等消息了，然后snapchat家是真的很快，第二天早上就给消息了，直接打电话给的offer。

 感觉snapchat的整体bar还是挺高的，主要考图和dp，要求代码速度很快，每一轮要聊20分钟左右然后还要做2-3个hard左右的题，基本要求自己写test case测。当天感觉发挥不错，代码都是test case一次跑过bug free的。记得第三轮写完UnionFind跑出来没有问题的时候，shadow小哥在我背后感叹了一句 ‘哇’，还把我吓了一跳。 

[Snapchat Onsite](http://instant.1point3acres.com/thread/160401)

--

第一轮，ABC小哥，给两个string的数组和一个pattern数组，判断将两个string数组分别和pattern转化后的结果是否相同。例如s1={“abc”, “a”, “ccc”}, s2={“bc”, “aa”, “d”}, pattern={1, 0}，则s1和p的转化结果是“aabc”，s2和p的转化结果也是是“aabc”，则返回true。如果pattern是{0, 1}，则转化结果分别是“abca”, “bcaa”，则返回false。followup是，如果给定s1和s2，判断是否存在一个pattern使得转化结果一致。 过程中要求分析算法复杂度。 

第二轮，韩国大叔，Leetcode的symmetric tree。这题我一开始上来用了最精简的方法，然后似乎大叔不太能follow，要我从最简单的BFS做一遍，然后又从DFS做一遍。现在回过头来总结，其实面试的时候不要一开始给出最优解，给出一个相对naive但是直观的解，然后逐步改进，这样可以向面试官展现你的thinking process，一上来就最优的，很多面试官都不是很喜欢的。followup就是各种DFS和BFS的tradeoff，主要是在social app的应用中。 

第三轮，华人小哥，就是大家现在看到新OA（http://www.1point3ac...）。其实算法不是很复杂，按照长度和尾字幕分成bucket，然后没个bucket建trie，用trie来生成缩写。但是在讨论算法复杂度的时候我脑子犯浑了，不知道怎么搞的跟面试官为一个无所谓的复杂度讨论了半天，然后写代码的时间就所剩无几，写完了代码，面试官就问了问打算怎么测试就结束了。本轮面试官是manager，估计跪在这里了。 

第四轮，华人小哥，一个矩阵表示的迷宫，1表示有障碍，0表示没有，求一条从A点到B点的路径。第一遍，我忘了写用visited matrix，所以复杂度很高，在面试官提示下，增加了visited matrix，但是时间没有多少了。followup是如果迷宫不是联通的，问怎么remove障碍，使得可以从A到B。这一轮是reverse shadow interview，感觉面我的小哥比我还紧张，各种交流不顺，写完代码后问我是想向他问问题，还是做个follow up，我问能不能介绍一下你的工作，结果他说，看来你不是很有兴趣问问题，那我来问你followup吧。。。心中万匹cnm飞过。。。唉，感觉如果面试遇到reverse shadow，就自认倒霉吧。。。 

第二天收到的结果，悲剧。。。第一个onsite面试，感觉失败也很正常，现在面了几个onsite之后回过头来想想这次的onsite，觉得当时太缺少经验了，面试还是有很多技巧的，并不是想得出最优算法就一定会面的好，感觉最好的模式是能够跟面试官慢慢交流，逐步导出最后的解答，即便最后的答案不是最优的也不要紧，重要的是在这个过程当中可以向面试官展现你自己方方面面的能力，而且可以避免很多不必要的麻烦。 

关于snapchat公司再多说两句，感觉这个公司目前几乎是个纯前端的公司，后端基本上都包给google了（这也是为什么前段时间google的cloud service挂了，导致snapchat直接也挂了），比较适合喜欢做前端的同学。 

--

第一轮 印度哥哥 先在白板上写了关于linkedlist的题目，把linkedlist拆成两个，odd一列，even一列。 在电脑上写的employee的class （class里有一个directreport的list， string name， name是相当于id，独一无二），然后实现method， input是employee ceo， string emp1, string emp2， 找到emp1和emp2共同的manager。 

第二轮 美国哥哥 bloomfilter， 支持add， mightcontains，resize，remove 

第三轮 两个国人哥哥， 给一个double array， 让输出能使用＊，＋， 以及（）得到的maximum。 follow up，如果有<0的怎么处理 

第四轮 abc director， 先问了问background，然后出了magzine里找massage的题目，之后又问了design的题目，类似于google doc，如何保证大家拿到的 信息是一致的，在同一个version. 

--

回馈地里，奉上snapchat的onsite面经。感觉地里面的面经基本上都能cover他们家的题，大家认真准备机会还蛮大，他们家monetization在扩招。 

一轮：会议室，国人小哥先提出各自优化，晚上没睡好反应有点慢，一开始没注意到heap里需要存储<会议，结束时间>数字对, 我只存了结束时间导致，最后才发现错误，为时已晚啊。。followup的会议室dp问题没有时间做了（地里帖子有提到）。跪在这里真是不甘心。 

二轮：外星人词典，原题 

三轮：给一个数组，A,B轮流从头尾处选出一个数字，求当B使用（1）贪心和（2）最优策略时，A能取到所有数字之和最大。我使用的recursive写的，优化用的是hash 存储从子数组（i, j）上能得到的最优解。写了几个test跑过了。 

四轮：给一个n\*n 的chess board, knight可以跳 2\*3的格子的对角线，就是国际象棋的规则。求给出一个起始点，knight能否跳到给定的重点。BFS搞定。followup print出来路径，backtrace就可以了，把每个格子上个格子的方位存下来，允许使用额外空间。写完后跑了test，小哥说：you did a good job 

--

第一轮.亚裔小哥自我介绍，对项目经历问得挺细的，问了实习过程中遇到过的困难有什么，详细说一个 

1.给我看了一个snapchat给好友群发消息的功能，可以任意选中和删除想要投递消息的好友，并显示群发好友的list(按先后选中的顺序)，设计一个数据结构，实现 toggle(String username); getList(); LZ给的hashmap + doubly linked list的设计，类比LRU cache, 详细解释了一下，分析了时间复杂度。小哥说是最优解了，不coding 

2.给如下结构 

		class ChainSnap {
		 	List recipients; 
		 	boolean hasCycle(); 
		 	} 

让实现其中的hasCycle()。实际就是有向图判断有没cycle，用dfs加两个hashset判断globally visited 和 temporarily visited。 小哥问能不能不用额外的数据结构（那两个hashset）,但可以把以上的class修改一下。LZ说可以加两个boolean变量在class里。小哥问了两种方法在空间消耗上的差异，然后问能不能再减少空间的开销。。后来提示说那两个变量可能的值只有几种组合，然后提示用enum类型。然后让LZ写了用enum的那种方法的代码。 


第二轮.美国小哥 小哥说话挺慢的，先让自我介绍，问了why snapchat, 实习经历里面最exciting的事是啥以及实习过程中有没有不开心的事 题目问了XML parser, LZ不熟悉XML，就改成了HTML Parser, 本质上一样 输入是一个tokenizer对象，可以调用其getNextToken()函数获得下一个token, token结构包括name和tag，name就是具体的文字，tag有open,close,text三种，让把所有的token建成一棵树 

比如： aa bb 得到的token就是 

	(“html”,“open”)
		(“user”,“open”) 
			(“id”,“open”) 
				(“aa”,“text”) 
			(“id”,“close”) 
			(“meta”,“open”) 
				(“bb”,“text”) 
			(“meta”,“close”) 
		(“user”,“close”) 
	(“html”,“close”)

 LZ的方法是用stack来存parent, 遇到open和text建新node, 并把新node加到stack顶部node的child list里面，如果是open就把新node压栈，遇到close就pop掉stack顶端的node 写完以后小哥的follow up是如果输入的token有问题，比如close tag和open tag不匹配，如何做verification。LZ加了几行判断的code以后，小哥说他木有follow up了，于是开始聊天。。 

第三轮. 两个人，主面试官有口音，但是看不出是哪里人 问了简历+why snapchat+最喜欢的feature 主要面的是unique paths I + II, 加了面试官自己的follow up, 就是如果给定的grid里面有三种情况，0能走，1不能走，2表示弹簧，可以走到2右边2格的位置，求结果 对于I, LZ直接说用dp做了，面试官表示其实直接一个公式就能算出来- -。但还是让LZ在白板上画了图，讲了思路，然后coding, 以及写test case测试 然后问LZ代码可以怎样优化让其更reliable更readable…LZ没啥概念，瞎扯了下…然后又问如果grid很大，如何encapsulate input, 依旧有点答非所问。。然后开始聊天。。 

第四轮. 中国小哥 下午三轮是连着的，看到中国小哥简直热泪盈眶 问了简历+why snapchat+最喜欢的feature 1.反对角线打印矩阵，电面面经题 2.给两个string判断是不是anagram follow up, 给一个长string一个短string, 判断长string里是否存在substring和短string是anagram,要求O(n)时间，n是长string的长度 LZ用了移动窗口+hashmap存出现次数的方法，好像不是小哥想到的方法，纠结了一段时间此法是否work, 小哥想到了overfit的问题，好心提醒了一下可以在hashmap存负数，然后coding解决，闲聊了一会 *overfit指的是当前substring某个字母出现个数多于短string里面该字母的出现次数 面完以后回到lobby,本来要跟hr聊天，幸好有hr出差了人手不够，这个环节就省了 每轮面试都是1个小时。上午11点让到，11点15才开始面，12点半吃饭，1点半开始下午的面试，下午连着3轮，面完还是很累的，不过面试的房间里就能看到海景，确实很漂亮

--

Round 1

Introduce yourself

Talk about 1 or 2 past projectsWhy snapchat?What do you like about snapchat?How can snapchat improve? 

Coding:

BigInt add(BigInt &other)

Follow upsupport adding floating numbers Do you have question for us?

What do you like about working for Snapchat?

What cutting edge stuff you have? (The interviewer ask me what do i mean by cutting edge?

I said google has self-driving cars. 

Which sound arrogant and stupid to ask) 

Round 2

Metric Collection System Design and implement the apis below:
void addRecord(double value, long timestamp)	double getAverage	double getMax	double getMin 

Round 3

		//Employee, Manager, ItemsSold
		//A, , 5
		//B, A, 3
		//C, B, 2
		//D, B, 3
		//E, A, 7 

for each employee, calculate the number of items sold by himself and his org(all the employee reported to him)

print the results 

Round 4

Given some points on a grid and point X, find the closest point to X

--

dream company就这么挂了，十分忧桑，写下面经求大家分析下原因TwT 

一到公司就直接第一轮，感觉还木有反应过来，也不给个tour啥的，哎 第一轮是个国人大哥，题目是amicable number，分析了下思路直接开写。写完再添了一些test case。感觉第一轮状态非常差，写的过程中出了几个很低智商的bug，虽然自己都解决了。 然后分析了下复杂度，从O(n^2)优化到O(n^3/2)，我觉得并木优什么用，十分虚，但是大哥看起来还挺满意的 

然后就是lunch，和两个认识的师兄一起吃饭，感觉还比较放松，调整一下继续后面 

第二轮是个亚裔小哥，题目是input一个text file，里面是last name, first name, mm/dd/yy, manager's full name这样的格式，按照他的要求parse然后按照hierarchy print出来。题目不难，但是细节讨论了蛮久，写了一半，最后时间都木有写完。。。虽然小哥说没关系，毕竟这题毕竟难（？有咩？我觉得其实不难，是自己时间没掌控好没写完，我的错，哎），但是我觉得没写完还是很糟糕。 

第三轮是个亚裔mm，设计题，一些snapchat功能的设计，如何pre-load的strategy。题目很细节，我一开始完全木有概念，但是她给了很多信息，所以一点点也就答出来了了。然后就是很多聊天，聊得比较开心。。。 

第四轮是个小印gg，上来就聊了很多经历和公司的事情，聊得特别开心，导致我还以为是behavior轮正好那个时候已经面了四五个小时脑子已经转不动了，开始反应迟钝。。。结果聊了蛮久以后小哥说行吧我们来做道题。。。orz 也是设计题，设计数据结构来完成snapchat的一个具体function，我设计的类似于LRU cache的东东，实现了代码，小哥看起来十分满意。。。 

他家流程非常快，第二天就出结果。挂了还不给feedback，问了也只是说你很优秀然而我们非常selective，看来是套话罢了。。。心塞。 

--

第一轮是个中国小哥，人超级好。题目是你要举办一个party，给你一些人和他们的上下级关系，如果你邀请了一个人就不能邀请他的直接上级或者直接下级，问怎样邀请能使邀请的所有人的级别加起来和最高（比如CEO是10级然后VP9级这样，类似每个人有一个分数）。小哥差不多提示得已经快把解法告诉我了才想明白，然后开始码代码，写完小哥看了看说感觉是对的时间不够了不用跑了- -然后聊了聊，小哥说，在这里大家之间都很nice，因为来了就做好了呆满四年拿够RSU的准备……= = 吃饭那轮貌似习惯性在附近某个咖啡厅吃，反正见到了好几个当天面试的小伙伴，而且因为下雨所以店里全都是snapchat的员工/面试官/来面试的，感觉中国人比例真是高啊。。。反正其他人都是跟中国员工吃饭，给我安排了个校友，美国小哥，于是聊了一中午中国和美国的教育差别外加吐槽母校的食堂有多么难吃- - 

第二轮还是个中国小哥，题目有点类似wall and gate，就是一个二维迷宫，0表示可以走，1表示障碍物，问从其中某点到另一点有没有通路。用BFS+染色法做了。follow up是打印出这条路（不必是最短路径）是什么，但是我没时间写这个了。就把之前那个找不找得到的写了testcase跑过了。另外这轮的小哥问了不少我想做什么方向啦之类的。其他轮基本上就是简历大概聊聊就开始做题了。

 第三轮是个外国小哥，给了一个class如下 
 
		 class Task { 
		 		public: void exec() {};
		 		set getDeps() {} 
		 		}; 
		 
 然后写一个函数，输入是一堆Task，每个task可能有一些dependency，必须先执行完dependency才能执行这个task，输出是这堆task的正确执行顺序。follow up是如果有环，需要报出错误信息。同时可以补充给的这个class。依然是用递归写的。。。跑的时候出现了奇怪的编译错误小哥说他不会C++解决不了就这么着吧就没有再跑 
 
 第四轮是个国人大叔，先写个reverse linked list，follow up如果有环怎么办，然后是level order traversal，最后还有时间就问了一个如何用4G内存sort 100G数据，假设CPU速度很快可以忽略，瓶颈是硬盘读写速度（50M/S），问只有一块硬盘的话估计要用多少时间，如果有两块硬盘如何优化。 
 
最后跟HR见一下说第二天通知结果，拒信就是邮件，offer就是邮件约时间打电话。然后第二天早上收到了约电话的邮件……pkg就是标准的吧(或者比标准低一点？反正觉得自己表现也挺一般的)，110k base + 10 signon + 322.56k RSU，还问了想去哪个组可以安排跟director聊天，ddl给了两周但是说需要可以延。hr说一般一天面七八个人能发一个offer就不错了，但我觉得应该没有这么难吧，毕竟他家今年是冲着翻倍去招的……按这速度得招多久才能招够啊…… 另外他家零食的那个BBQ味道的薯片真心好吃啊，还有瓶装的茶也很好喝！千万别喝苏打水就行（但是给我的袋子里是苏打水T T）中午吃饭那个地方的薯条好好吃（我的关注点真是奇怪。。。 

--

1. Amicable pairs: Given a number n, return all amicable pairs (a, b) with a < n and b < n. The definition of amicable pairs is in http://mathworld.wolfram.com/AmicablePair.html 这个就写了O(sqrt(N) N)的暴力做, 但后来告知有O(NlogN)的... 不过真心没什么意思, 一共amicable pairs没几个.. 应该打表的... 
2.  2Sum, 3Sum, 4Sum 稍微有点变化的是, array中数字是0-10, target也是0-10的. 要求输出在数组中最先遇到的 满足条件的pair (triplet...). 
3. 其他就是design problem和data science problem. 由于我的背景是machine learning, 比较有意思的是最后有一个面试官: 先问我知道neural network吗? 知道.. 好, 你来derive一下back propagation algorithm. 然后问我知道kernel trick吗? 知道.. 好, 你来explain and derive一下kernel trick.. 我就写了derivation of dual, 然后解释了一下. 我的感受是..在不给任何objective function或者提示的前提下, 回答这些基本问题当时还是有点一身冷汗的.. 

然后过3天收到了据信.. 不过差不多也意料之中, 在最后一面时就被告知所有team都是做infrastructure的, 目前还没有data之类的职位, 问我 有没有兴趣做infrastructure. 我很呆的说.. 这个方面我不是强项... (据说6个月之后会有data science之类的job了..). 


--


手快点出去了，接下来正文哈。
Snapchat 是我一位同学的朋友帮忙内推的。先是一轮online test，题目是地里出现过的valid sudoku. 然后就是一轮电面，是sudoku solver.
后来HR很快就通知我去洛杉矶onsite. 那时我因为已经拿了facebook的intern，洋洋得意之际已经1个月木有刷题了，手感其实已经有点生疏了。但本着农村人进城看看的原则也就去了。
先废话，直接开始po面试过程吧。
第一轮是一个大胡子白人，扎着马尾辫。看起来还是挺严肃的。先聊简历，聊了很多。他问到有个我做过的项目，如果想再做一遍的话，问我想怎样改进。编程题是给定一个有向关系图，在给定2个名字，求出这两个人的共同朋友（即2个点能达到的共同节点，类似树的共同祖先）

第二轮是一个白人小哥，人很nice。简单的聊了一下简历后就开始编程。题目是如果通讯录里从某一个名字开始翻转了，请把这个名字找出来。类似leetcode这道题：。这题我二分搜索算法犯了个低级错误，大概被扣分不少。

第三轮是一个印度小哥，这轮开始题目就有点飘了。题目是这样的，通过二维数组来建一颗四叉树。四叉树的叶子节点来自二维数组相邻的上左下右四个方块的值。建树规则是，四个节点的都是0，则父节点也是0，如果四个节点都是1，则父节点也是1.如果四个节点既有0，又有1，则父节点是2.如果四个节点都是2，则父节点是1.(规则有点复杂，一些细节我可能忘记了，但大体是这样）我是用递归的方式建树的。但因为代码量太大，导致我这一轮没完成编码。所以大概挂在这里了。

第四轮，国人小哥。我也不知道他后来有没有放水，反正是挂了。但过程中他给了很多的提示。题目是这样的：一棵树，代表上司和员工的关系，然后每个节点都有一个对应的权值。然后公司开了一个party，为了让员工们更好的交流，有个规定，如果上司去参加party，那么他的直接下属（直接孩子节点)就不去（同理，如果下属去了，直接上司，父节点就不去）。然后设计一个算法，参加party的人的权值总和最高。这是一道动态规划题，思路是每次计算一个员工去的权值之和与不去的权值之和，从叶子开始。

结束之后HR会简单的和你聊会儿天。当然，第二轮和第三轮面试之间有一个午餐，帮忙内推你的人会带你去吃饭。Snapchat专门租了一个地方当餐厅。然后就回家啦。很遗憾，木有见到传说中的CEO。
. visit 1point3acres.com for more.
PS：snapchat的办公室位于洛杉矶 Santa Monica海滩，海滩本身很漂亮，但海滩上各样怪咖，流浪汉都有。还有国内各种卖T恤和纪念品的店，里面的商品大概是义乌进的货吧。如果喜欢这样自由而略带混乱的环境的话，可以考虑去snapchat工作，我是没机会了，就算吃不到葡萄就说葡萄酸的吐槽一下吧。

--

第一轮： 面试官：亚裔妹子，人很nice很可爱，好像是broadcast组的，就是题一出我就有点懵了。 题目： ternary expression paser （三目运算符）， input是一个string，其中 ‘T’ 表示true， ‘F’ 表示false， 要求返回最后运算的结果。 乍一看题目很直接， bool expression ? first result : second result ，但实际上我们通常都用的都是非常简单的形式，但每一部分都可以无限嵌套。例如： T ? T : F ? T : 1 : 2 : F ? 3 : 4; 原本妹子没让我考虑bool expression部分也嵌套的情况，结果我本着把问题分析清楚的原则，成功把问题弄的复杂了，她后来觉得这可以作为follow up。。。 说了两三个简单的solution，然后举例发现有问题。在妹子的提示下，写出了 “不考虑 bool expression”的情况，但是因为已经说出口了，妹子指出我还需要继续考虑。最终时间不够，没有运行代码。 过后发现，确实应该多在纸上找一下规律，理清逻辑在写解法。string的变式题对我来说比较tricky，完全在脑子里思考容易变成一团浆糊。。。。妹子对我我说，没事她比较看重逻辑。我心里只能说谢谢你的安慰。。T.T 

午饭： 美国小哥，Seattle土生土长，UW毕业直接来snapchat工作，感觉很开朗很厉害的样子。去了其中一个食堂发现好多国人，但是地方比较小比较挤，饭菜还行。我们带着饭去了另一个snapchat租的小阁楼的楼顶聊天吃饭，那风吹得我简直冷洒比。。。从面试地点和食堂来回聊了蛮多，从他们data组聊到篮球足球dota2。我俩都表示足球太难碰到球了还是篮球好好玩，并且两人对dota2辅助的重要性深有同感，同时鄙视网上自私自利只喜欢玩carry的玩家哈哈哈。 

第二轮： 面试官：挺厉害的国人小哥，原谅我忘记你是哪个组了。。。去过大公司，换过start up，最后来的snapchat，逻辑很清晰。聊了好一会project，问得很详细，花了不少时间。 题目： Alien dict （感谢面筋。。。） 具体就不说了，写了topo sort。之后小哥详细问了怎样test保证能在product work，扯了下unit test + modular test + system test, 然后具体说了unit test的五六种case，然后test发现有个小bug，改之。再问如找不到valid sequence咋办，以及写exception。小哥不太熟unordered_map，问我有个地方是否会出现out of bound问题，我说map会直接新建一个value不会有问题，他表示惊奇并且说还是要注意下。 

第三轮： 面试官：白人manager，手下两个team，team主要做internal tool， UX之类。10+年工作经验，很nice很耐心。问了会project之后开始做题。 题目： construct string from web page + XML paser，再次感谢面筋，不过有一点不同是需要设计data structure保存paser后的结果。 每个token有如下结构，然后给了个API getNextToken()获取下一个token, 我表示应该还有个
hasNextToken()。 and
		
		token { 
			string name; // e.g. story, id, snaps 
			string tag_type; // {open, close, test} 三种type 
			}; 
	
第一题没让写代码，就讨论，用hash map。 第二题说了用stack 保存状态来解析，但是在设计结构的时候纠结了一会。最近缺乏运动，因而下午有小睡的习惯，结果在这个问题上卡了一会。说用nested hashmap，他表示make sense，就是想了半天没想到用下面这个结构，他提示我可以用vector>的结构，表示恍然大悟，然后发现应该并不需要vector。写完之后follow up就是如果tag不匹配怎么检测。 Node { string name; string value; unordered_map; }; 

第四轮： 面试官：比较腼腆的国人小哥，刚从google跳槽过来，但是中途话比较少不太主动给提示，但你跟他交流他还是很愿意跟你解释。表示我们可以skip introduction和project直接coding，LZ表示当时脑子快累洒比了，欣然同意。 题目： tic tac toe的m\*n版本，也就两个人是在一个m\*n的board上玩。（LZ最讨厌玩游戏了。。。） 规则如下： 

（1）获胜方式依然是横竖对角线有三个连在一起的symbol。 

（2）每次movement不能任意放置，只能放在 每一列 的 最下方的空白处，也就是说每个玩家每轮最多只有 n （行数）个选择。 
要求实现以下API： 

	（1）valid()。检查当前board是否有效，有效board必须满足 
		(i) 没有人获胜 
		(ii) 不能违背第二条规则。 
	（2）nextMove()。返回当前玩家的任意一个movement，
		要求对手无法获胜，如果找不到报错（我选择了返回-1） 
	
脑子实在累了，讨论了一下给出了bruteforce的方案。 

1. valid主要难点在怎么判断已经有人赢了，LZ用check8个方向一共16个格子的方法，于是O(16\*N^2)。跟小哥交涉，表示常数可以减小，不过16也合理可以写。 
 
2. 假设当前为player A， 则枚举A的n个选择，每个选择会对应B的n个选择，复杂度依然是O(16*N^2)。但实际上如果不保存board state，不管是A还是B都得先找到每一列放置的位置，每次都扫描一遍就会多出O(N)的时间，总时间会变成O(N^3)，所以需要保存一下状态。 加上一些细节的调整，最后写完但依然没时间测试debug了，两人一起表示过了一遍应该work。。。。

总结： 刷面筋依然高效。遇到思路不清晰的问题，还是在纸上多举几个例子跟面试官讨论一下，思维清晰了反而能节省时间。继续保持coding，并且坚持运动增强体力。。。move on。。。。 

补充内容 (2016-3-30 22:50): 

抱歉第一题例子有个小typo。。。 T ? T : F ? T ? 1 : 2 : F ? 3 : 4; 会转化成T : 1 : 4，然后返回1 

补充内容 (2016-3-30 22:51): 

第三轮也有个小typo，XML和之前面筋一样都是三种类型 {open, close, text}

--


估计要挂了，感觉发挥太差

1）给一个target串，判断另外source串中有没有substring满足edit distance of target and that substring <= 1，讲下思路然后写，没写完整

2) design query suggestion system, implement trie tree's seach function. 

3) quad tree, 写的一对bug，改了半天才改完，没时间下一题了

4）meeting room ii， 然后 1 room with 带权重的meeting

--

第一轮
n叉树判断是否有回路，dfs, 但是不希望一直维护一个祖先节点的哈希表，所以可以设计一个类，里面存一个布尔型的变量，访问过的设为true，回溯之后设为false

第二轮， rotate过的数组排序，nlogn找出最小值，o(n)时间构造新的数组


第三轮， 高精度加法，follow up可以是负数，多加一个高精度减法


第四轮 

1. 一堆数，中间插入*，+或者括号，求最大值，dp就可以， 但是如果数字全部是正整数的话，只用通过判断1的个数是奇数还是偶数来求最大值，0(n)就可以了
2. merge n个排序过的数组，优先队列或者divide and merge都可以               
3. 简单的regax判断是否match

--


第一轮国人小哥中文面的，给一个List of meetings, meetings有起始时间，求meetings的arrangement，返回的是哪个meeting Room被排了哪些面试。

第二轮

1. c

		class Throttler {
	      int qps;
	      public Throttler(int qps) {
	      }
	      pubilc boolean allowAccess() {
	      }
		}
	
给这么一个class实现rate limiter，allowAccess()返回的事当前时间的access能不能被批准
举个栗子：

		qps是2
		request1 time 0.0 return true;
		request2 time 0.5 return true;
		request3 time 0.6 return false;

2. Given List<word>, String para, 返回包涵所有word最短的一段话,返回String 
先把word简化成character来做的，就是LC的minimum window substring，最后时间不够没写完，感觉gg在这里了

第三轮
1.给一个单核CPU的log，parse log，每一行log三列分别是jobname(String)    start/end(boolean)    timeStamp(long)


name(String) |   start/end(boolean)   | timeStamp(long) 
-------------|------------------------|----------------
f1           |        start           |            0
f2           |        start           |            2  
f3           |        start           |            4
f3           |        end             |            5
f2           |        end             |            8
f1           |        end             |            9


		上面log的意思是我们在0开始做f1
		在2的时候切换到f2,
		4的时候开始做f3，
		5的时候f3结束
		要返回每个function要用的时间
		这个input的返回就是
		f1 ： 3
		f2 ： 5
		f3 ： 1

2. 在terminal里输入文件名的一部分然后按tab补全，求能找到target文件要输入string的最短长度

3. 写一个可以被多线程访问的计数器？？每被访问一次count++，check被访问次数的method并不常用

第四轮，第四轮是我面的最迷的一轮，前半段连写了三道简单题 reverse linkedList, 按层打印树，和LC reverse words in a string
后半部分在讨论如何用4G的RAM sort硬盘里100G文件的问题，可以加额外的硬盘，要尽量使用时尽量短

--


今天去Snapchat onsite，体验了一下神级startup的氛围。地理位置非常的好，距离沙滩就几步远，公司隐僻在一堆厂房之中，周围没有任何明显的标志，刚到的时候完全不知道哪里是公司，后来是被保安大哥叫住然后领进“小黑屋”的。和几个工程师聊过天之后，感觉他们非常的有朝气也很有激情，给人一种非常振奋人心的感觉。闲话少说，直接上题，楼主感觉是跪了，不过体验了一次Snapchat也算是值了。

另外提一句，由于今天去onsite的人太多，楼主被挤到一个瑜伽房去面试了，没有白板只有白纸，anyway，反正都是要在电脑上编译再测试。

第一面,一个口音不是很重的三哥。上来先问了简历上的实习的project，问的比较详细。之后做题，给一个Employee类，有一个String name和一个List<Employee> directReport来表示一个公司的组织结构，然后给定一个公司的ceo和两个员工的名字，找到这两个员工的第一个common manager，给的两个员工一定存在。N-try tree的first common ancestor。楼主就用最naive的方法先找到从根到target节点的path然后在两个path中找第一个common ancestor。在电脑上写代码和测试样例，改掉测试样例的一个小bug之后通过。要求优化，说了用postorder traversal的方法来找，这样只需要遍历树一遍，说了一下整体的过程没有coding。之后问在一个很大的social network中，给两个个名字，如何快速的找到名字对应的node然后再去找他们的common friends。楼主提了一下hash，consistent hash然后就没啥了，不熟悉DHT没办法啊。还是自己准备不够充分，好多东西需要了解。

中午是一个韩国小哥带着去吃午饭，聊得很开心。

第二面，一个中年白人manager。一上来先问了问why snapchat, what's your favoriate parts of internshop in Facebook。之后做题，给定一些输入如

		Employee,Manager,ItemsSold
		Alice,,5
		Bob,Alice,3
		Carol,Bob,2
		David,Bob,3
		Eve,Alice,2
		Ferris,Eve,1
		要求打印出这个样子
		Alice 16
		    Bob 8
		        Carol 2
		        David 3
		    Eve 3
		        Ferris 1
楼主先自己设计数据结构，和第一面那个基本一样，只是多了一个int num来记录数量，根据输入构建树，注意这里每条记录给定的顺序是随机的，所以可能先出来David,Bob,3然后才是Bob,Alice,3。不注意的话可能会有小bug报错。然后postorder算出所有node的child的数量和，然后update自己的，之后preorder打印。写的时候有个小bug，改正之后通过。follow up要求打印成这个样子

		Alice 16
		|-Bob 8
		| |-Carol 2
		| \_David 3
		\_Eve 3
		  \_Ferris 1
		  
然后楼主就跪在这里了，怎么改都是有bug，最后也没改出来。最后面试官说，你的大方向是对的，只是你API设计的不够好，你如果把parent需要打印的prefix也传递给child，打印起来就非常方便了。楼主终于醒悟，刷题太多导致思维僵固了，另外这一面全程要coding并且编译运行。


第三面，一个年轻白人。一上来先介绍了一下Snapchat各个team什么的，然后问了问project。然后问说我们有个很huge的social network，你需要design一个system，这个system可以用来evaluate各种我们设计的朋友推荐算法，你要怎么设计。说了一下大概的设计，面试官更看重我如何准备data来做evalution，于是就也说了说这个部分。之后做题，就是根据计算机网络里面那个CIDR然后来做IP address filtering。比如给定一些rule: "7.0.0.0/8", 那么所有前8位是7的address应该全部被filter掉。楼主用hashset来存rule然后用一些位运算的方法来做filter。写完代码改了一个小bug之后测试通过。

第四面，一个年轻白人。一上来也是问了问project。然后做题，给定一个grid matrix，就是类似围棋盘那种东西。然后某些grid（放棋子的地方）上面有点，给定一个query点的位置，返回k nearest点on this grid matrix。第一开始我assume给了个list，里面是自己设计的一个结构体，记录了坐标和距离query点的距离，然后写了个comparator来sort这个list，然后返回k个node。之后要求优化到O(n)，楼主就写了quick selection。之后要求再优化，然后楼主就**了，尼玛这是要让我写kd-tree的节奏，这东西曾经在普利斯顿的算法公开课写过一次，之后就再也没碰过了，果断回避之。就设计了一种逐渐膨胀的正方形的方法，不过这种方法有bug，返回的不一定是k nearest，我也指出了可能哪些情况不work，但是面试官还是让我写了，我也就写了。全程几乎在梦游，感觉这一轮和第二轮面得一样差，面完当场感觉已经和Snapchat say Goodbye了。


最后就是和HR简单的聊了一些东西，比如有什么offer啊，你选择offer的时候最看重哪些方面啊之类的，然后就被送出了building。


之后去沙滩上走了走，这是楼主最后的一个interveiw（其实一共也就3个面试）。感觉不能再天天刷题刷面经了，好多东西不是刷题能够弥补的，还是多去看看书，尝试尝试新技术，做一些自己的小project来增长一些实际的经验更靠谱。

--

(1) LRU
(2) IP address filter，给一些ip的规则，然后问那些ip复合这些规则
(3) word pattern (其他面经里有)
(4) 1. valid BST     2. 添加括号使得表达式值最大，表达式只有+ - *

--

Venice海滩真的好漂亮，晚上说脑袋糊涂得不行，去吹海风，结果第二天重感冒；
第一轮：Monetization组Google新跳过来的老美director,  去年12月才来的，感觉他相当relax, 和他聊天一点都不紧张，也让我放松了好多，问了下简历，然后直接上题：

1. 设计一个API, 返回所有朋友看的snap 从高到低的snap, 所有数据结构自己构造，我就想了个Person的class, 里面有friend List, 以及一个hashMap统计各个snap的观看纪录，然后就是bfs, 再一个大的hashmap统计了

最后加了个Node class {private int snapId, private int count}, 用Collections.sort出结果
       extra:  他说你20分钟写好了，咱还有时间，你给我写个quicksort的实现吧，啪啪啪， bug free写好了， 说good job
中饭是内推你的人和你一起的， 公司安排了素未谋面的内推的小伙伴一起吃，中饭，感觉还行，中饭共1小时时间，下午1:15开始第二场面试， 还是有点困的


2. 一个蛮年轻的小哥，入职一年半， support paltform的，Big Integer加减，可正可负，听他描述完，有点想抽自己，看到有人说了类似题目的面经，但是说的是电面，就没准备，没想撞上了。题目大意： 传入一个String, 自己定定义BigInteger class的内部变量,  实现加减； 想了一下，本来想直接char arrar处理，发现把符号信息单独拿出来会简单很多， 所以就是BigInteger{int sign, int[] nums}, 然后就是实现， 两个数的符号
++, --, +-, -+, 分情况写，没有全部写完，就写好了＋＋， －－, 小哥说没时间了，你写几个testcase 先跑一下这个吧，testcase 通过， done..
3. 一个华人小哥， 感觉放水了，data metrics的， 聊了聊简历，题目基本就是Leetcode 317, bug free搞定，然后小哥说你来想给足testcase跑一下吧，我想了几组case，凑了好一会，小哥也比较满意； 然后问我有什么问题，我就问了下snapchat 每个snap 信息比较难提取，你是怎么向各个不同用户推荐discovery / stories 里的snap的， 小哥回答了下.


4. 一个不明国籍的中年男, 感觉相当严谨的感觉，面的菊花各种紧,  说是geofilter 主要负责人，我赶紧跪舔说我可喜欢你的geofilter了,  比如什么什么，还能植入广告啥的好牛逼啊： 问了实习时候的简历，每当我抛出一个新概念就各种问，略虚， 题目和regular expression matching 有点像， 除了＊不在表示任意count, 而是1-100 的count， 我说直接暴力枚举各种可能的结果，比如碰到a* 就见一个list 包含所有可能，然后把 s 和 由 p生成的所有可能比较一次， 面试官问有没有更好的方法，细想了下，dp还是能写的，然后就写了下，调了下bug, 测了各种testcase， 过了

面完第二天就通知要了，还说我culture fit 方面每个面试官都觉得很好， &#128531;

经验就是多刷leetcode + 面经， 发现snapchat 目前题库还不是很大， 多刷几题也算给自己额外的安慰，面试的时候不太紧张；然后各种culture fit， 后面要面的人要取巧的话，看一下snapchat 的wiki, 然后看几篇技术报道，最后youtube上搜一下网红们怎么用的snapchat, 基本就能“看着” 很fit了

--

第一轮电面：实现 linux command line中的tab completion功能（其实就是让实现一个trie，但是要注意一下有多个可能结果时的情况。小哥当时要求实现的效果跟command line behavior一样。平时没注意过这点，蒙圈了，被加了一轮电面）

第二轮电面：Big integer addition and substraction。S家的电面高频题

Onsite: onsite前一晚和当天都在发高烧，有些细节记不清了还请见谅. from: 

第一轮：Binary tree level order traversal，LC原题，早上吃药退了烧，状态还行秒掉了

第二轮：Team manager小哥。Given a M X N grid, a random cell in the grid (coordinate <a, b> for example), find number of ways you can reach top-left corner in k steps, assuming you can move in any direction. 这轮又开始发烧，明明是个3D DP昏昏沉沉硬是用2D DP来写，被小哥的edge case challenge好多次 QAQ。最后他说you actually started very close to the right solution, only if you added number of steps as a dimension的时候LZ简直要哭出来了T_T.


第三轮：做安卓端的小哥。问题是假定给个屏幕和一些屏幕坐标和渲染单个像素点的API，要求设计一个渲染class, 能实现当手指点下去的时候开始渲染，手指拖动过程中渲染以屏幕一角和手指作为对角线的一个长方形（这个长方形可以根据手指的运动扩大缩小），最终当手指离开屏幕的时候，以手指最后位置为准，留下most recent的那个长方形。小哥在整个过程中除了回答clarification以外一直不出声，edege case都是LZ一边写一边找出来的。。。

第四轮：面试官没来，LZ在趴桌半小时后才意识到自己被放了鸽子。。。undefined. 1point 3acres 璁哄潧

周五Onsite,周一下午收到拒信。也是意料之中吧，毕竟onsite的表现实在不好。S家确实如传说中那样，很注重culture match，一小时一轮的onsite，每轮都至少聊了20分钟culture fit才开始做题，最后还有五到十分钟的Q&A

--

第一轮，word pattern，面试官 叫奥斯汀 李（俩e的那个，估计是ABK，其它面经曾经提过。。。）。小哥迟到了至少20分钟，上来又先聊了10分钟简历，以至于后面的时间并不多了。。。s1，s2，s 分别代表string list1，string list2 和index list。两者根据index list，match就return true，不match就return False。我一上来先提出了直接历变的解法，集创建两个空string，根据index不断把两个string list里的string往两个空string里面写。小哥问我时间复杂度，我说O(n)，他说太general了，具体咧？懵逼了，真没了解那么深。后来提醒我说每次空string叠加也是耗时的，耗的时间跟被叠加的string有关。。。就是O(mn)。再问我空间复杂度，我说O(n)，还说general，最后也是O(mn)，让我改进我的算法用O(1)的空间复杂度。。。好吧，在不断交流和提醒中，写完了，用pointer，四个pointer，两个指现在的string，两个string里面的字母。但是时间也到了，我明白后面还有follow up，我没做成，第一轮扑街。

第二轮，task management design（考官塞巴斯汀，某个组manager）。比方说给你50个task，有个API假设已经有了，是用来run这些task的，但是这个API最多每次只能同时run3个。并且run的顺序根据priority level来定，让实现。具体包括 get，change priority 和run，get就是新的task，change priority就是把已有的还没运行的task更改priority level，run就是运行同时保证运行完一个马上推入下一个运行，楼主现在想了想，今天写了写，写出来了，当时扑街，面试官说他看中的是怎么样思考。。。

第三轮，life of game，面经很多，不多说。不能用in place来做，用hashmap来记下一轮会发生变化的点。考官布兰登，刚刚入职不到一年，他自己说自己是个小本科。follow up是如果board很大，大到根本存不了，咋办，我说那只记录边界和是活细胞的点的位置，挺满意，提前15分钟搞完，跟我说我没啥问题了咱俩谈谈逼吧。。。

第四轮，中国小哥，跟了一个shadow也是中国人，问了25分钟简历，还挺详细。完事之后让写一个Bigint class，面经很多人说到过bigint，但是你们为啥不说是bigint class？！反反复复跟小哥交流，感觉小哥都无奈了。最后终于把同号相加的写完了，异号相加确实没有时间了，这轮基本也是扑街。
总体来说不难，或者说很简单，只是这是楼主第一个onsite，实在是没有技巧还紧张。。。当天晚上6点他们就开完会投完票了。。。我内推跟我说估计反馈不是很positive，而且反映follow up不好。是不好，都没来得及做。。。最后他去帮我问hr，hr说的就是风格不匹配。。。什么才叫风格匹配？在线等。。。
最后，希望大家都有好offer，希望下面的面试能有好表现。。。加油

--

第一轮：白人小哥Will，Discover组。小哥上来先介绍自己，然后我开始介绍我自己以及我的项目经历，然后问我why snapchat，然后我说我自己在用很喜欢Discover，楼主面试前作了功课，听说snapchat会直播今年奥运会的highlights就提了一下，之后就是做题：地里面经Basic Calculator多位，double，带括号，没空格, 没有follow up。之后问问题，我问了一句关于3V广告和视频的问题。小哥最后还问我一个问题：discover应该如何改进。。。

中午吃饭：内推大哥和另外一个姐姐带着我和另外面试同学一起吃饭，很开心。

第二轮：Manager Sebastian，上来问为啥Snapchat，为啥这个职位。面经8x8走K步多少种走法，我开始本着循序渐进的原则，写了BFS然后大BUG又来了，找8个邻居有出错了，又调了好久总算过了，然后问时间和空间复杂度，我分析完他说提高一下，我说DFS可以减低空间复杂度，没让写，然后一看不行啊，得挽回一点BUG的硬伤，马上说觉得可以DP做，然后讲了一下思路，他说：那你写一个DP吧，很快写完了，然后他说你把DP和BFS结果都运行，对比一下。结果不一样:(，眼巴巴地瞅着经理，他说你这pre.swap(cur)啥意阿？我说交换赋值，他问难道交换完不要清一下cur么？我恍然大悟，改完，过。

第三轮：国人大哥，直接聊项目，很感兴趣我会OpenGL，然后给我个codepair地址，说咱俩在codepair上做，Wildcard Match，讲了DP的解法，写完，又忘记namespace了，不过这次很快发现了，大哥问：你咋这么快就发现了？我说：上午也忘了。运行完大哥follow up说你这个p[j] == '*'的情况，你写了三个L(i - 1, j),L(i - 1, j - 1)和L(i, j - 1)能省一个，你给优化一下告诉我为什么。后来想想说L(i-1, j-1)可省，因为一个可以算成多个，大哥说解释的太通俗，算你过了。然后就是聊天

第四轮：国人大哥，聊他的工作，我开始跟他说Android设备太慢的问题，然后聊得很开心，他说看来你对android还挺有了解，我说不，我不太会，就知道一点点。
题目：一个tunnel， 范围是[0，1]中间有各种尺寸的雷达，(x, y, r)，一个小车只有不被雷达监测的地方可以通过，问给定一个List<Radar>判断小车能不能过去。这轮最成功，一点点和大哥分析出需求，做出来的。最后做完题，边走还边和大哥聊天，指出了在snapchat使用中有个小bug，大哥表示会反映一下。

最后HR就说了一下，我们很快48小时内就给你消息，没事你可以走了。楼主出门直奔大海，眼泪差点掉出来，这一路以来压力太大，投了很多家，都没有消息，要不就是简历跪，只有snapchat给了面试一直到最后onsite，周五就毕业了，要是跪了不知道以后该怎么办。
晚上基本没睡觉，早上十点多收到Recruiter邮件，问我啥时候有时间电话聊聊，然后offer就到了。
总结来说：bug free更好，不然其实也无伤大雅，我四轮都都没有bug free，主要是看你culture fit程度，觉得交流其实很重要。
谢谢大家，找工作找得太晚了，就面了这一家，明天pocket gems店面准备推掉了。努力看看面经和刷题还是非常有希望的，祝大家都有offer！！！

--


来补个面经吧。onsite体验还可以，就是下午三轮到最后有点懵，不过和面试官交流的都比较开心吧。culture fit不错。第二天拿到offer。

第一轮，挑了我一个简历上的project问，然后问我如何改进。感觉自己答的没有很好，不过中国小哥感觉人很不错，除此之外应该聊的还可以。题目是两个人是否能通过6个人认识。一步步改进着做，期间纠正了一些小错误，然后也会提示着我需要改进，最后写完代码没用IDE跑，用例子在纸上跑了跑，然后说了说testcase。

第二轮，manager，不知道哪国的人，随便听了听我简历，然后问了k*k，先dfs，再优化用dp，最后问了如果坐标是负数或者棋盘很大怎么办。都写了代码，运行看了结果（心好虚，生怕出来结果不对）。写的比较顺利，最后我问了一个问题，提前就走了，让我休息了会。

第三轮，shadow面，问了我一个项目，问的比较细，还让我说了下里面某个算法到底怎么运行的。题目是假设1T的硬盘，内存只有200G，你怎么排序。其实就是merge k sorted list。写完之后又问如果很多数重复怎么办，经过提醒，国人大哥告诉我应该在merge的时候，对于每次从priorityque中poll后的那个对应的sorted list，对比下自己这个sorted list里后面的数是不是和当前的一样，一样的话直接加进总的list中就可以了。出了点小bug，后面改改也可以了。之后随便问了会问题。

第四轮，中国小哥，问了简历，也和我聊了很多我一些背景的东西。出了个开放性的问题，说的是随便交流一下。我给了个自己觉得可以的解法，当时脑子浆糊了，也想不出其他的了。不过感觉和他沟通的比较开心，所以估计放了我一马吧（题目我就不说了，感觉也没什么参考价值）。

每一轮，提出的每个算法都会要说出复杂度，不是特别麻烦的题目，都会运行。还有聊天环节都会或多或少问对于他们app的看法什么的，我之前做过一些功课，所以感觉聊的比较开心。运气不错，三轮国人面，而且很多题都见过。

祝大家找工作顺利~多尝试，总会成功的。



补充内容 (2016-5-12 00:25):
第二轮是8*8走k步0 0

--

第一轮，word pattern，面试官 叫奥斯汀 李（俩e的那个，估计是ABK，其它面经曾经提过。。。）。小哥迟到了至少20分钟，上来又先聊了10分钟简历，以至于后面的时间并不多了。。。s1，s2，s 分别代表string list1，string list2 和index list。两者根据index list，match就return true，不match就return False。我一上来先提出了直接历变的解法，集创建两个空string，根据index不断把两个string list里的string往两个空string里面写。小哥问我时间复杂度，我说O(n)，他说太general了，具体咧？懵逼了，真没了解那么深。后来提醒我说每次空string叠加也是耗时的，耗的时间跟被叠加的string有关。。。就是O(mn)。再问我空间复杂度，我说O(n)，还说general，最后也是O(mn)，让我改进我的算法用O(1)的空间复杂度。。。好吧，在不断交流和提醒中，写完了，用pointer，四个pointer，两个指现在的string，两个string里面的字母。但是时间也到了，我明白后面还有follow up，我没做成，第一轮扑街。 

第二轮，task management design（考官塞巴斯汀，某个组manager）。比方说给你50个task，有个API假设已经有了，是用来run这些task的，但是这个API最多每次只能同时run3个。并且run的顺序根据priority level来定，让实现。具体包括 get，change priority 和run，get就是新的task，change priority就是把已有的还没运行的task更改priority level，run就是运行同时保证运行完一个马上推入下一个运行，楼主现在想了想，今天写了写，写出来了，当时扑街，面试官说他看中的是怎么样思考。。。 

第三轮，life of game，面经很多，不多说。不能用in place来做，用hashmap来记下一轮会发生变化的点。考官布兰登，刚刚入职不到一年，他自己说自己是个小本科。follow up是如果board很大，大到根本存不了，咋办，我说那只记录边界和是活细胞的点的位置，挺满意，提前15分钟搞完，跟我说我没啥问题了咱俩谈谈逼吧。。。 

第四轮，中国小哥，跟了一个shadow也是中国人，问了25分钟简历，还挺详细。完事之后让写一个Bigint class，面经很多人说到过bigint，但是你们为啥不说是bigint class？！反反复复跟小哥交流，感觉小哥都无奈了。最后终于把同号相加的写完了，异号相加确实没有时间了，这轮基本也是扑街。 

总体来说不难，或者说很简单，只是这是楼主第一个onsite，实在是没有技巧还紧张。。。当天晚上6点他们就开完会投完票了。。。我内推跟我说估计反馈不是很positive，而且反映follow up不好。是不好，都没来得及做。。。最后他去帮我问hr，hr说的就是风格不匹配。。。什么才叫风格匹配？在线等。。。 最后，希望大家都有好offer，希望下面的面试能有好表现。。。加油！ 

--

发面经回馈地里。楼主是10月末的onsite，面试体验还是很好地。面试地点就在沙滩旁边，每人一个小房间，在里面有准备好的interview survival小袋子，以及墙上的欢迎语。看到了感觉还是挺暖心的。楼主因为当时比较忙，只看了一部分地里的相关面经，如果下面有碰到之前的面经题目但是楼主没提出来，还请见谅。

楼主当天去的比较晚，到那里才发现第一轮的面试官已经在等我了，被领到房间里直接开始，电脑还临时抽风了耽误了十分钟，结果面试官在旁边安慰我说没事没事，电脑就是时不时会出问题 = =！面试官人很好嘛~~ 当天一共四轮，上午两轮下午两轮，每轮一个小时。感觉楼主运气比较好，碰到了三位国人，以及很多leetcode的题目。

第一轮

1. find all amicable numbers. more info on 1point3acres.com
输入一个正整数，找出所有小于这个数的amicable pairs。讨论了一下时间空间复杂度以及如何tradeoff，最后写了时间复杂度O(nlogn)，空间复杂度O(n)的算法。

2. leetcode原题 basic calculator II， 不需要考虑空格， 但是除法结果不限制是整数。
follow up：如果可以有括号怎么做（这个说一下思路就好，没要求我在电脑上写出来运行）

第二轮
1. 有点类似leetcode里面的 valid anagram， 直接可以用hashmap解决的那种。
2. 基本是leetcode里面的 alien dictionary，不同的要求是如果排序结果不唯一，则直接报特殊错误（在原题基础上加一个if 判断就可以啦）。


第三轮
1. leetcode unique paths II
2. leetcode find median from data stream
（国人小哥这轮放水提前结束，让我可以多休息一下，感谢~）

第四轮
1. 输入是一串不断更新的数据流，要求输出是其中k个随机数据，每个出现过的数据被输出的概率相同。
楼主之前做过随机输出一个数据的类似题目，当时跟面试官交流的也不好，就直接照搬过来把一个随机输出复制了k遍，然后被告知输出数据不能重复。。。然后思路就卡住了，被提示后知道分两步走，第一步用随机函数得知每次一个新数据来了之后是否使用，第二步如果要使用该数据再用一个随机函数得知替换掉哪个原来存在的数据。
之后要求在电脑上自己写出来各种test case来检测函数的正确性
2. leetcode word break II， 只需要输出一种结果就可以.

--


电面： LeetCode原题 Jump Game 1和2
onsite:

第一轮是个外国小哥，算术式Evaluation, 要求支持+-*/()。

第二轮是个国人大哥，一个2D平面有一堆雷达（雷达有x, y坐标，以及能探测到的范围r半径）然后又一辆小车要从y=0和y=1的区间里面通过并且不能被雷达探测到。让写一个function看小车能不能通过。

第三轮是个印度小哥，Game of Life原题。

第四轮是个外国大叔，基本上纯behavior，最后问了一个很简单的题目，就是Leetcode Unique Path ii.

他家聊天会聊很久，大家要注意点聊天技巧。聊得开心就好

--

System Design基本都是常规题，没有遇到很另类的题。
最后决定去Snapchat了，Seattle这边只有二十多人，做的东西也很有意思，都是从头开始，是一个打怪升级的大好时期。

不过这边只招比较有工作经验的人，所以new grad可能还是去投LA那边的职位比较好。
简单说下考的题，

1. Design story feature，有private，public用户，24hr ttl 删除之前的story
2. 午饭
3. 给一个contact名单，电话键盘有字母，实现给一个电话，看对应的名字在不在contact中。
4. design 一个four in a row game， OOdesign
5. BST给数值k，找两个node加起来为k，要用less than O（n） space， 实现两个整数相除。

--
Implement diff/ Word Splitter.  

--

1. shortest distance from all building, 

2. android unlock 
3. string pattern number, 
4. 还有两道面经和leetcode
5. 是关于给一组string sort，规则是除了正常的按ascII字母排序，纯数字的比较需要看完整数字。这里有一些细节需要搞清楚，比如overflow以及首位为0的情况特殊处理

--


本来不打算面snapchat，被同学一通说教就去面了。面了之后感觉很开心。。。

1. 第一轮面了道shortest path sum in matrix, follow up 打印路径, 问有多少种最短路径
从左上角到右下角
2. 第二轮 不够言笑的manager,问了道六边形构成的图，问怎么存这六边形，以及如何返回他的六个邻居，。。然后假设有个中心，然后它是ring1 就是第一行的输入， 第二行是它的邻居，第三行是第二行的外层邻居有十二个。。。问你要怎么存这样的结构，然后通过坐标对应的某个元素 输出它对应的六个邻居。。。。。。不过给你的格式是第一行是ring1, 第二行是ring2 第三行是ring3，每一行开始的位置在一条直线上……如果要这样存就要先找出邻居数学关系式。。。怎么存其实不重要，因为总是要找出给你输入格式下邻居的位置的数学关系
3. 第三轮是个健谈的小哥，各种聊，超级哈皮。。跟我一起坐着看着海滩感觉好惬意。。问了game of life 然后问steam 输入的情况下怎么处理。
4. 第四轮 一个permutation 加第k个permutation f