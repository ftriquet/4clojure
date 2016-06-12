;Write a function which returns true if the given sequence is a palindrome.
;(false? (__ '(1 2 3 4 5)))
;(true? (__ "racecar"))
;(true? (__ [:foo :bar :foo]))
;(true? (__ '(1 1 3 3 1 1)))
;(false? (__ '(:a :b :c)))

(def answer
  (fn [p]
    (loop [word p]
      (if (<= (count word) 1)
        true
        (if (not= (first word) (last word)) false (recur (drop 1 (drop-last 1 word))))))))

(println (false? (answer '(1 2 3 4 5))))
(println (true? (answer "racecar")))
(println (true? (answer [:foo :bar :foo])))
(println (true? (answer '(1 1 3 3 1 1))))
(println (false? (answer '(:a :b :c))))
