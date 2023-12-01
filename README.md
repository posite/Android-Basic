# Android 인프런 강의 정리
- 아키텍처 패턴과 Android Jetpack Library의 사용법, 그리고 의존성 주입과 테스트 자동화
 
 
## Architecture Pattern
   - 사용하는 이유: 자주 발생하는 문제들에 대해 반복적으로 사용 가능한 효율적인 구조이기 때문
   - MVC : Model, View, Controller 구조로 Model과 View가 분리되어 Model은 Test하기 쉬우나 Controller가 Android에 종속되어 Test하기 어려우며
     Activity가 View와 Controller 역할을 하므로 결합도가 높아지고 비대해짐
     
   - MVP : Model, View, Presenter 구조로 Presenter가 Controller 역할을 하지만 View 참조를 거치지 않고 Interface를 통해서 결합도가 느슨해지며
     Android 의존성을 가지지 않아 테스트도 용이해 짐 View와 Presenter가 1대1로 대응해야 해서 두 요소의 의존성이 강해짐
     
   - MVVM : Model, View, ViewModel 구조로 ViewModel이 View에 필요한 로직을 가지고 있으며 1대 N관계를 가져 중첩되는 부분을 묶어 줄일 수 있음
     Activity에서 DataBinding과 Observing을 통하여 View를 갱신 -> View와 Model, ViewModel과 View 사이에 의존성을 가지지 않으며 단방향으로 참조
