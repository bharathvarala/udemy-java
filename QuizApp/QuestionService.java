package QuizApp;
import java.util.*;


public class QuestionService {
    Question[] questions = new Question[3];

    public QuestionService()
    {
        questions[0] = new Question(1,"What is capital of India?","Hyderabad","Delhi","Chennai","Mumbai","Delhi");
        questions[1] = new Question(2,"What is national bird of India?","Crow","Sparrow","Peacock","Pegion","Peacock");
        questions[2] = new Question(2,"What is national animal of India?","Dog","Lion","Cat","Tiger","Tiger");
    }
    
    public void quizGame()
    {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        for(Question q:questions){
            System.out.println(q);
            String opted = sc.nextLine();
            if(opted.equals(q.getAnswer())){
                System.out.println("Correct Answer");
                score++;
            }
            else{
                System.out.println("Incorrect Answer");
            }
        }
        System.out.println("Your score is "+score+"!!");
        System.out.println("Thanks for playing");
    }

}
