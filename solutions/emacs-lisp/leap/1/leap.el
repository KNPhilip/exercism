;;; leap.el --- Leap exercise (exercism)  -*- lexical-binding: t; -*-

;;; Commentary:

(defun divides? (n divisor)
  (= 0 (% n divisor)))

(defun leap-year-p (year)
  (cond ((divides? year 400) t)
        ((divides? year 100) nil)
        ((divides? year 4) t)
        (t nil)))

(provide 'leap-year-p)
;;; leap.el ends here
