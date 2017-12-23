# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Most implementations (windows, posix, ...) have slightly different api for      "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/kinetic/ecl_io/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d64d8b9c71a305dd4aee94e820a3b42"
SRC_URI[sha256sum] = "c9cdfe2df091df99b310c88fa72328f06d85893fbdc9d8b8b4b66f859f726323"
S = "${WORKDIR}/ecl_lite-release-release-kinetic-ecl_io-0.61.6-0"

inherit catkin
