// node 구현
function Node(element) {
    this.element = element;
    this.next = null;
}

// Linked List 구현
function LinkedList() {
    this.head = new Node("head");
    this.find = find;
    this.append = append;
    this.insert = insert;
    this.remove = remove;
    this.toString = toString;
    this.findPrevious = findPrevious;
}

// 노드 찾기
function find(item) {
    var currNode = this.head;
    while(currNode.element != item) {
        currNode = currNode.next;
    }
    return currNode;
}

// 이전 노드 찾기
function findPrevious(item) {
    var currNode = this.head;
    while(currNode.next != null && currNode.next.element != item) {
        currNode = currNode.next;
    }
    return currNode;
}

// 노드 추가
function append(newElement) {
    var newNode = new Node(newElement); //새로운 노드 생성
    var current = this.head; // 시작 노드
    while(current.next != null) { // 맨 끝 노드 찾기
        current = current.next;
    }
    current.next = newNode;
}

// 노드 중간 삽입
function insert(newElement, item) {
    var newNode = new Node(newElement); //새로운 노드 생성
    var current = this.find(item); // 삽입할 위치의 노드 찾기
    newNode.next = current.next; // 찾은 노드가 가리키는 노드를 새로은 노드가 가리키기
    current.next = newNode; // 찾은 노드는 이제부터 새로운 노드를 가리키도록 하기
}

// 노드 삭제
function remove(item) {
    var preNode = this.findPrevious(item); // 삭제할 노드를 가리키는 노드 찾기
    preNode.next = preNode.next.next; // 삭제할 노드 다음 노드를 가리키도록 하기
}

// 연결 리스트의 요소들을 출력
function toString() {
    var str = '[ ';
    var currNode = this.head;
    while(currNode.next != null){
        str += currNode.next.element+' ';
        currNode = currNode.next;
    }
    return str+']';
}




const list1 = new LinkedList();
list1.append(7);
list1.append(1);
list1.append(6);

const list2 = new LinkedList();
list2.append(5);
list2.append(9);
list2.append(2);


console.log(list1, list2)

