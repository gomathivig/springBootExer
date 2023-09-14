package com.telstra.codechallenge.repoCheck;

	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;
	import com.telstra.codechallenge.repoCheck.repoCheckService;

	@RestController
	@RequestMapping("/git")
	public class repoCheckController {

	  public static final int NO_WEEK_DAYS = 7;
	  private final repoCheckService repoCheckService;

	  @Autowired
	  public repoCheckController(
			  repoCheckService repoCheckService) {
	    this.repoCheckService = repoCheckService;
	  }

	  @GetMapping("/hottest/{noOfRepos}")
	  public ResponseEntity<repoCheckResponse> getHottestRepos(@PathVariable int noOfRepos) {
	    return ResponseEntity.ok(repoCheckService.getHottestRepos(noOfRepos, NO_WEEK_DAYS));
	  }

}
