  "diff headers mode" should {
  }

  "diff headers copy" should {

  }

  "diff headers rename and similarity" should {
    "Github issue #8" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8.txt"))
    }

    "Github issue #8 no newline at eof" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-no-newline-at-eof.txt"))
    }

    "Github issue #8 wrong example 1" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-diff-wrong1.txt"))
    }

    "Github issue #8 wrong example 3" in {
      allDiffs must succeedOn(StringUtils.readFile("/diffs/github#8-diff-wrong3.txt"))
    }
