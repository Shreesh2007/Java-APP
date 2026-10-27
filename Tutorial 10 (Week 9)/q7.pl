% Facts: parking_slot(Slot, VehicleType, Availability)
parking_slot(s1, car, available).
parking_slot(s2, bike, occupied).
parking_slot(s3, car, available).
parking_slot(s4, bike, available).
parking_slot(s5, car, occupied).

% Rule: slot must match vehicle type
% and be available
available_slot(Slot, VehicleType) :-
    parking_slot(Slot, VehicleType, available).

% Query: find available car parking slots
% ?- available_slot(Slot, car).