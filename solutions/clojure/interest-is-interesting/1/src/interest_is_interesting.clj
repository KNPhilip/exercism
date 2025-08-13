(ns interest-is-interesting)

(defn interest-rate
  "Returns the interest rate based on the specified balance."
  [balance]
  (condp > balance 
    0 -3.213
    1000 0.5
    5000 1.621
    2.475
  )
)

(defn annual-balance-update
  "Returns the annual balance update, taking into account the interest rate."
  [balance]
  (+ balance (* balance (/ (bigdec (Math/abs (interest-rate balance))) 100)))
  )

(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage."
  [balance tax-free-percentage]
  (if (< balance 0)
    0
    (int (* balance (/ (* 2M tax-free-percentage) 100M)))))