public class NodeMgmt {
    Node head = null;

    public boolean insertNode(int value) {
        if (this.head == null) {
            this.head = new Node(value);
        } else {
            Node findNode = this.head;
            while (true) {
                if (findNode.value > value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(value);
                        break;
                    }
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(value);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node searchNode(int value) {
        if (this.head == null) {
            return null;
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == value) {
                    return findNode;
                } else {
                    if (findNode.value > value) {
                        findNode = findNode.left;
                    } else {
                        findNode = findNode.right;
                    }
                }
            }
        }
        return null;
    }

    public boolean deleteNode(int value) {

        boolean searched = false;

        Node currParentNode = this.head;
        Node currNode = this.head;

        if (this.head == null) {
            return false;
        } else {
            if (this.head.value == value && this.head.left == null && this.head.right == null) {
                this.head = null;
                return true;
            }

            while (currNode != null) {
                if (currNode.value == value) {
                    searched = true;
                    break;
                } else if (currNode.value > value) {
                    currParentNode = currNode;
                    currNode = currNode.left;
                } else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            if (!searched) {
                return false;
            }

            if (currNode.left == null && currNode.right == null) {
                if (value < currParentNode.value) {
                    currParentNode.left = null;
                } else {
                    currParentNode.right = null;
                }
                return true;
            } else if (currNode.left != null && currNode.right == null) {
                if (value < currParentNode.value) {
                    currParentNode.left = currNode.left;
                } else {
                    currParentNode.right = currNode.left;
                }
                return true;
            } else if (currNode.left == null && currNode.right != null) {
                if (value < currParentNode.value) {
                    currParentNode.left = currNode.right;
                } else {
                    currParentNode.right = currNode.right;
                }
                return true;
            } else {
                Node changeNode;
                Node changeParentNode;

                if (value < currParentNode.value) {
                    changeNode = currNode.right;
                    changeParentNode = currNode.right;

                    while (changeNode.left != null) {
                        changeParentNode = currNode;
                        changeNode = currNode.left;
                    }

                    if (changeNode.right != null) {
                        changeParentNode.left = changeNode.right;
                    } else {
                        changeParentNode.left = null;
                    }

                    currParentNode.left = changeNode;

                    changeNode.right = currNode.right;
                    changeNode.left = currNode.left;

                } else {
                    changeNode = currNode.right;
                    changeParentNode = currNode.right;

                    while (changeNode.left != null) {
                        changeParentNode = changeNode;
                        changeNode = changeNode.left;
                    }

                    if (changeNode.right != null) {
                        changeParentNode.left = changeNode.right;
                    } else {
                        changeParentNode.left = null;
                    }

                    currParentNode.right = changeNode;

                    changeNode.left = currNode.left;
                    changeNode.right = currNode.right;
                }
                currNode = null;
            }
            return true;
        }
    }
}
