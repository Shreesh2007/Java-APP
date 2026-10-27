% Facts: students who passed
passed(arun, python).
passed(arun, data_structures).

passed(bala, python).

passed(charan, python).
passed(charan, data_structures).

passed(divya, data_structures).

% Facts: students who failed
failed(bala, data_structures).
failed(divya, python).

% Eligibility rule
eligible(Student) :-
    passed(Student, python),
    passed(Student, data_structures).