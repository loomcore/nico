;; Nico: An Environment for Mathematical Expression in Schools
;; Copyright (C) 2011  Philip M. Yeeles
;; 
;; This file is part of Nico.
;; 
;; This program is free software: you can redistribute it and/or modify
;; it under the terms of the GNU General Public License as published by
;; the Free Software Foundation, either version 3 of the License, or
;; (at your option) any later version.
;; 
;; This program is distributed in the hope that it will be useful,
;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;; GNU General Public License for more details.
;; 
;; You should have received a copy of the GNU General Public License
;; along with this program.  If not, see <http://www.gnu.org/licenses/>.

(defproject nico "0.0.1-SNAPSHOT"
  :description "An Environment for Mathematical Expression in Schools"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [guiftw "0.2.0-SNAPSHOT"]
                 [org.eclipse/swt-gtk-linux-x86 "3.5.2"]]
  :dev-dependencies [[swank-clojure "1.2.0-SNAPSHOT"]]
  :repl-options [:init nil :caught clj-stacktrace.repl/pst+]
  :main nico.core)
