package Q1Inheritance;

public class CodebusterGroups extends CodeBuster {
    public void groupName(){
        System.out.println("CodeBuster specialize group");
    }

    public static void main(String[] args) {
        CodebusterGroups codebusterGroups = new CodebusterGroups();
        codebusterGroups.groupName();
    }
}
