# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides messages and serializations / conversion for the ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/octomap_msgs-release/archive/release/kinetic/octomap_msgs/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "629b5241049ce0dd613bb41ecbfda91a"
SRC_URI[sha256sum] = "180382de6115d1c1afc3a009ee35804fe49795d2cd36c67418c68542d3b6f4c1"
S = "${WORKDIR}/octomap_msgs-release-release-kinetic-octomap_msgs-0.3.3-0"

inherit catkin
