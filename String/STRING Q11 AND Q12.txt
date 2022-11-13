
class ReplaceExample2 {
    public static void main(String args[]) {
        String s1 = "my name is khan my name is java";
        String replaceString = s1.replace(" ", "%20");//replaces all occurrences of " " to "%20"
        System.out.println(replaceString);
    }
}