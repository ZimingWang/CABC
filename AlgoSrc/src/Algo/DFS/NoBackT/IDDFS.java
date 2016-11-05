package Algo.DFS.NoBackT;

/**
 * Created by wangziming on 11/5/16.
 */
public class IDDFS {
}
/**
 * procedure IDDFS(root)
 for depth from 0 to ∞
 found ← DLS(root, depth)
 if found ≠ null
 return found

 procedure DLS(node, depth)
 if depth = 0 and node is a goal
 return node
 else if depth > 0
 foreach child of node
 found ← DLS(child, depth−1)
 if found ≠ null
 return found
 return null
 */
//https://zh.wikipedia.org/wiki/%E8%BF%AD%E4%BB%A3%E6%B7%B1%E5%8C%96%E6%B7%B1%E5%BA%A6%E4%BC%98%E5%85%88%E6%90%9C%E7%B4%A2