package com.telstra.codechallenge.repoCheck;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.telstra.codechallenge.repoCheck.*;

@Data
@NoArgsConstructor
public class repoCheckResponse {

  private List<GitRepoDetail> items = new ArrayList<>();

}
