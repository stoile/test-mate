(defproject test-mate "0.2.0-SNAPSHOT"
  :description "mate for testing needs"
  :url "https://github.com/freiheit-com/test-mate"
  :license {:name "GPLv3"
            :url "https://www.gnu.org/licenses/agpl-3.0.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "2.0.0"]
                 [cheshire "5.5.0"]]
  :aot :all
  :main test-mate.core
  :jvm-opts ["-Xss8m"]) ;workaround: big jacoco files need a lot of stack -> rewrite aggregation with tail recursion
