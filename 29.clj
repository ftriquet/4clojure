;Write a function which takes a string and returns a new string containing only the capital letters.
;(= (__ "HeLlO, WoRlD!") "HLOWRD")
;(empty? (__ "nothing"))
;(= (__ "$#A(*&987Zf") "AZ")

(def answer
  (fn [s]
    (clojure.string/join (filter #(Character/isUpperCase %) s))))

(println (= (answer "HeLlO, WoRlD!") "HLOWRD"))
(println (empty? (answer "nothing")))
(println (= (answer "$#A(*&987Zf") "AZ"))
