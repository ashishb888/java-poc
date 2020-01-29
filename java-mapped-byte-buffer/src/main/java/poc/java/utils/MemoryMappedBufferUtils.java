package poc.java.utils;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;

public class MemoryMappedBufferUtils {
	/**
	 * 
	 * @param filePath
	 * @param size
	 * @return
	 * @throws IOException
	 */
	public static MappedByteBuffer mappedByteBuffer(Path filePath, long size) throws IOException {
		return mappedByteBuffer(filePath, 0, size, false);
	}

	/**
	 * 
	 * @param filePath
	 * @param position
	 * @param size
	 * @return
	 * @throws IOException
	 */
	public static MappedByteBuffer mappedByteBuffer(Path filePath, long position, long size) throws IOException {
		return mappedByteBuffer(filePath, position, size, false);
	}

	/**
	 * 
	 * @param filePath
	 * @param position
	 * @param size
	 * @param lock
	 * @return
	 * @throws IOException
	 */
	public static MappedByteBuffer mappedByteBuffer(Path filePath, long position, long size, boolean lock)
			throws IOException {
		MappedByteBuffer mappedByteBuffer = null;

		try (FileChannel fileChannel = (FileChannel.open(filePath,
				EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.READ, StandardOpenOption.WRITE)))) {

			if (lock)
				fileChannel.lock(position, size, false);

			mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, position, size);
		} catch (IOException e) {
			throw e;
		}

		return mappedByteBuffer;
	}

	/**
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static MappedByteBuffer readOnlyMappedByteBuffer(Path filePath) throws IOException {
		return readOnlyMappedByteBuffer(filePath, 0);
	}

	/**
	 * 
	 * @param filePath
	 * @param args
	 * @return
	 * @throws IOException
	 */
	public static MappedByteBuffer readOnlyMappedByteBuffer(Path filePath, long... args) throws IOException {
		MappedByteBuffer mappedByteBuffer = null;

		try (FileChannel fileChannel = (FileChannel.open(filePath, StandardOpenOption.READ))) {
			if (args.length < 2) {
				mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, args[0],
						fileChannel.size() - args[0]);
			} else {
				mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, args[0], args[1]);
			}
		} catch (IOException e) {
			throw e;
		}

		return mappedByteBuffer;
	}
}
