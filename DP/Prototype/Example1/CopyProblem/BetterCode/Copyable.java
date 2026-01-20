package DP.Prototype.Example1.CopyProblem.BetterCode;
// There is already a Clonable interface in java which can be used instead of creating our own Copyable interface
public interface Copyable<T> {
    T copy();
}
