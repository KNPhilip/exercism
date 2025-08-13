(ns cars-assemble)

(defn success-rate [speed]
  (cond 
    (= speed 0) 0.0
    (<= speed 4) 1.0
    (<= speed 8) 0.9
    (= speed 9) 0.8
    :else 0.77
  )
)

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (let [cars-per-hour 221
        rate (success-rate speed)]
    (* speed cars-per-hour rate))
)

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60))
)
