# Definition for a undirected graph node
class UndirectedGraphNode:
      def __init__(self, x):
            self.label = x
            self.neighbors = []

class Solution:
      # @param node, a undirected graph node
      # @return a undirected graph node
      def cloneGraph(self, node):
            if(not node):
                  return node
            
            to_be_visited = [] 
            visited = dict();

            # clone the root node
            cloned_root = UndirectedGraphNode(node.label)
            cloned_root.neighbors = node.neighbors

            # add the root to the list of nodes to be visited 
            to_be_visited.append(cloned_root)

            while len(to_be_visited) is not 0:
                  # get the cloned node but now we need to visit its neighbors
                  node = to_be_visited.pop()
                  
                  # add the node to the visited
                  visited[node.label] = node

                  # clone its neighbors and add them to the list of nodes to be visited 
                  to_be_cloned_neighbores = node.neighbors
                  node.neighbors = []

                  for neighbor in to_be_cloned_neighbores:
                        # create a child clone, first check if we have previously created the clone 
                        if not visited.has_key(neighbor.label):
                              # clone the neighbor node
                              neighbor_clone = UndirectedGraphNode(neighbor.label)

                              # add the neighbors of neighbors
                              neighbor_clone.neighbors = neighbor.neighbors

                              # flag it as node to be visited
                              to_be_visited.append(neighbor_clone)

                              # give the current cloned node a reference to the cloned neighbor
                              node.neighbors.append(neighbor_clone)
                        else: 
                              node.neighbors.append(visited[neighbor.label])
                              
            return cloned_root




def print_graph(root):
      print(root.label)
      for neighbor in root.neighbors:
            print_graph(neighbor)


root = UndirectedGraphNode(1)
node2 = UndirectedGraphNode(2)
node3 = UndirectedGraphNode(3)
node2.neighbors.append(node3)

root.neighbors.append(node2)
root.neighbors.append(node3)
#print_graph(root)

sol =Solution();
cloned = sol.cloneGraph({})
print
##print_graph(cloned)

# print a graph

