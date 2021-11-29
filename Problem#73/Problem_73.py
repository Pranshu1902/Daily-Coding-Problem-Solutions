# Daily coding problem 73

class Node:
    def __init__(self, data):
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self, data):
        self.head = Node(data)

    def add(self, data):
        root=self.head
        while root.next:
            root = root.next
        root.next = Node(data)

    def get(self):
        root1 = self.head
        while root1:
            print(root1.data, end=" ")
            root1 = root1.next

    def reverse(self):
        # 3 -> 4 -> 5
        # 3 <- 4 <- 5
        root = self.head
        prev=None
        while root:
            next = root.next
            root.next = prev
            prev = root
            root = next

        while prev:
            print(prev.data)
            prev = prev.next
        self.head = prev



l = LinkedList(3)
l.add(4)
l.add(5)
l.add(6)
l.reverse()

