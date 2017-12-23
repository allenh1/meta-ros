# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The urg_c package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ros-gbp/urg_c-release/archive/release/kinetic/urg_c/1.0.404-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "033be9297b96feb75bb7def8ac847f04"
SRC_URI[sha256sum] = "411e905bfc05f7d9ac60c713d46cd47bca980556c0c8b4f996b2359eeded8c95"
S = "${WORKDIR}/urg_c-release-release-kinetic-urg_c-1.0.404-0"

inherit catkin
