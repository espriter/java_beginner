package spring.di;

import spring.di.entity.Exam; // 인터페이스
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
    public static void main(String[] args) {

        Exam exam = new NewlecExam(); //Exam = 인터페이스, NewLecExam = 메소드
        ExamConsole console = new InlineExamConsole(exam); // 1줄 출력 // DI
//        ExamConsole console = new GridExamConsole(exam); // 그리드 출력`
        console.print();

    }
}
