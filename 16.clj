;(= (__ "Dave") "Hello, Dave!")
;(= (__ "Jenn") "Hello, Jenn!")
;(= (__ "Rhea") "Hello, Rhea!")

(def answer #(str "Hello, " % "!"))
(println (= (answer "Dave") "Hello, Dave!"))
(println (= (answer "Jenn") "Hello, Jenn!"))
(println (= (answer "Rhea") "Hello, Rhea!"))
