class Tree {
    private String name;
    private String treeType;
    private boolean leavesFall;
    private String leafColor;

    Tree() {
      name = "";
      treeType = "";
      leavesFall = false;
      leafColor = "";
    }
    Tree(String aName, String aTreeType, boolean aLeavesFall, String aLeafColor) {
      name = aName;
      treeType = aTreeType;
      leavesFall = aLeavesFall;
      leafColor = aLeafColor;
    }
  String getName(){
    return name;
  }
  String getTreeType() {
    return treeType;
  }
  boolean getLeavesFall(){
    return leavesFall;
  }
  String getLeafColor(){
    return leafColor;
  }
  void setName (String theName){
    name = theName;
  }
  void setTreeType (String theTreeType){
    treeType = theTreeType;
  }
  void setLeavesFall (boolean theLeavesFall){
    leavesFall = theLeavesFall;
  }
  void setLeafColor (String theLeafColor){
    leafColor = theLeafColor;
  }
  void print(){
    System.out.print("This is a " + name);
    System.out.print("tree.  It is a " + treeType);
    System.out.print("and its leaves are currently " + leafColor);
    System.out.print(". It does not lose its leaves for the winter.");
  }


  }

class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();

    Tree tree2 = new Tree("Maple ", "Broadleaf ", true, " Red");

    tree1.print();
    tree2.print();

    tree1.setName("Spruce ");

    tree1.print();

  }

}
