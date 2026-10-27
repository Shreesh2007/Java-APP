% Facts: employee(Name, Experience, Training, Rating)
employee(ravi, 6, completed, 5).
employee(priya, 3, completed, 4).
employee(kumar, 8, not_completed, 5).
employee(meena, 7, completed, 4).

% Rule: minimum 5 years, training completed,
% and performance rating >= 4
eligible_for_promotion(Employee) :-
    employee(Employee, Years, completed, Rating),
    Years >= 5,
    Rating >= 4.

% Query:
% ?- eligible_for_promotion(Employee).