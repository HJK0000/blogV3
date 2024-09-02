package shop.mtcoding.springv3.core.error;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component // 모든 어노테이션 안에 있는 그 메타 어노테이션! 이거 붙여야지 이 클래스가 new가 된다.
@Aspect // AOP 등록
public class GlobalValidationHandler {

    // 유효성 검사
    // 매서드 전에만 발동하면 되니까 before 붙여주기
    @Before("@annotation(org.springframework.web.bind.annotation.PostMapping) || @annotation(org.springframework.web.bind.annotation.PutMapping)")
    public void validCheck(JoinPoint jp) {
        Object[] args = jp.getArgs(); // 매서드의 매개변수가 args 에 담긴다.
        

        // 수정 실행해서 확인
        System.out.println("사이즈 : " + args.length);
        // 담겼는지 확인
        for (Object arg : args) {
            System.out.println(arg);
        } // 확인하는 코드


    }


}
