txt파일에 있는 문자열을 읽고 이를 단어장으로 만드는 프로젝트

/*
VocaaData와 VocaaMng는 셋트임
VocaaMng와 VocaaHashMap은 같은 기능을 하나 그 방식에서 차이가 보인다.
외부 txt파일을 읽어보는 과정은 똑같으나 txt파일 내부에 , 로 구분되어 있는 문자열을 VocaaMng에선
StringTokenizer를 이용하여 분리했고, VocaaHashMap에선 String에서 제공하는 split()함수를 통해
단어를 분리했다.
이후 분리된 단어들을 VocaaMng에선 VocaaData에서 미리 정해놓은 형식에 따라 단어 - 뜻 형태로 저장하고
VocaaHashMap에선 HashMap을 이용하여 key - value 형태로 저장했다.

VocaaData와 VocaaMng는 미완성 상태

VocaaHashMap은 완성 상태를 보인다.

최종 완성 상태는 외부 txt파일에서 단어들을 읽어오고 검색, 추가, 삭제 등의 기능을 제공하는 단어장의 모습임.
         */
