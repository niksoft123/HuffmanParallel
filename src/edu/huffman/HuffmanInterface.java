package edu.huffman;

import edu.huffman.algorithm.Tree;

import java.util.logging.Logger;

public class HuffmanInterface {
	final static Logger logger = Logger.getLogger(HuffmanInterface.class.getName());
	/**
	 * The maximum number of threads that the program may use
	 * */
	Integer maxTasksCount;
	/**
	 * Path to the file that will be compressed
	 * */
	String filePath;
	/**
	 * Indicates quiet mode
	 * */
	Boolean isQuiet;
	static final Integer MAX_DIFFERENT_CHARACTERS = 256;
	/**
	 * The huffman tree of the algorithm
	 * */
	Tree huffmanTree;

	static final String treeFileExtension = ".part%d.tree.txt";
	static final String compressedFileExtension = ".part%d.data.compressed";
	static final String decompressedFileExtension = ".part%d.decompressed";

	public HuffmanInterface(String filepath, Integer maxTasksCount) {
		this.filePath = filepath;
		this.maxTasksCount = maxTasksCount;
	}

}
