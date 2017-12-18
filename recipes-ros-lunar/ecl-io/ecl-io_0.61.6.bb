# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Most implementations (windows, posix, ...) have slightly different api for      "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/lunar/ecl_io/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3d08ba985e59aef9db731442d7e5ace9"
SRC_URI[sha256sum] = "b6b0dc187abdc387a067af551e0498145f612e30797ad1b31c24894ccf753ba1"
S = "${WORKDIR}/ecl_lite-release-release-lunar-ecl_io-0.61.6-0"

inherit catkin
