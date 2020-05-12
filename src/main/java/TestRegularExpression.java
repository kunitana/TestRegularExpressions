import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*There are some some ways to declare array of args:

IDEA through Edit Configurations:
- Shift+Alt+F10 -> 0-Edit Configurations -> Program arguments -> arg[0] arg[1] arg[2]
- Run -> Edit Configurations -> Program arguments -> arg[0] arg[1] arg[2]

cmd line or Terminal in IDEA:
cd (path until Classname.class) #dir #cd folder
then cmd: java ClassName arg[0] arg[1]...*/

public class TestRegularExpression {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Usage: \njava TestRegularExpression " + "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\"");
        for (String arg: args) {
            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()){
                System.out.println("Match \"" + m.group() + "\" at positions " +  m.start() + "-" + (m.end()-1));
            }
        }
    }
}


