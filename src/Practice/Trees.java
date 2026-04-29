package Practice;


        public static void PostOrder(Node root) {
            if(root != null) {
                return ;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.val + " ");

        }

        public static void main(String[] args) {
            Node root = Sampletree();
            System.out.print("Post Order traversal");
            PostOrder(root);
        }

    }

