package streams.and.lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecordStatistics {

	public static void main(String[] args) {
		List<Album> albums = constructAlbums();
		//Map<Artist, Album> topHits = albums.stream()
				//.collect(Collectors.toMap(Album::artist, e -> e, Collectors.maxBy(Comparator.comparing(keyExtractor))));
	}

	private static List<Album> constructAlbums() {
		// TODO Auto-generated method stub
		return null;
	}

	static class Artist {
		private String firstName;
		private String lastName;
		
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		

	}

	static class Album {
		private Artist artist;
		private String name;
		private double sales;
		public Artist getArtist() {
			return artist;
		}
		public String getName() {
			return name;
		}
		public double getSales() {
			return sales;
		}
		
	}
}
