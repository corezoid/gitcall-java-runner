package com.corezoid.gitcall.runner.api;

/**
 *
 * The Corezoid Gitcall v2 node request handler.
 * Use plain java objects or Map for input and output.
 *
 * @param <I> The input parameter type
 * @param <O> The output parameter type
 */
@FunctionalInterface
public interface IUsercode<I, O> {
    /**
     * Handles a Corezoid Gitcall v2 node request
     * @param input The Corezoid Gitcall v2 node input
     * @return The Corezoid Gitcall v2 node output
     */
    public O handle(I data) throws Exception;
}
