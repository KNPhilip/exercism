(ns two-fer)

(defn two-fer
  "Returns what you will say as you give away the extra cookie."
  [& [name]]
    (format "One for %s, one for me." (or name "you")))
