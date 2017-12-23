# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package is a set of basic math fuctions for ROBOTIS's robots.     We provid"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native eigen roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Math-release/archive/release/kinetic/robotis_math/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f8c42f14152becd94bcdce73275a1aa"
SRC_URI[sha256sum] = "60cec669585c8e9eb27971f0b9bf4e347030f72f7e42d5ed19c9d36dfea02af2"
S = "${WORKDIR}/ROBOTIS-Math-release-release-kinetic-robotis_math-0.2.3-0"

inherit catkin
