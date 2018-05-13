package com.onerepo.api.rest;

import com.onerepo.api.rest.dto.MavenRepositoryDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/maven")
public class MavenResource {

  @ApiOperation(
      value = "Creates new Maven Repository",
      notes = "Combination fo group and repository names should be unique",
      response = IdResponse.class
  )
  @PostMapping("/repository")
  public ResponseEntity<IdResponse> createRepository() {
    return null;
  }

  @ApiOperation(
      value = "Obtain maven repository by group and name",
      response = MavenRepositoryDTO.class
  )
  @GetMapping("/repository/{group}/{name}")
  public ResponseEntity<MavenRepositoryDTO> repository(@PathVariable String group, @PathVariable String name) {
    return null;
  }

}
